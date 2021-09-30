package stuff;

import java.util.Map;

public class SortedCollections {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("apple", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("bread", 12.50, 1);
        stockList.addStock(temp);
        temp = new StockItem("bottle", 1.10, 7200);
        stockList.addStock(temp);
        temp = new StockItem("car", 6.70, 1);
        stockList.addStock(temp);
        temp = new StockItem("cup", 6.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("chair", 7.10, 8);
        stockList.addStock(temp);
        temp = new StockItem("desk", 9.90, 2);
        stockList.addStock(temp);
        temp = new StockItem("door", 3.10, 1);
        stockList.addStock(temp);
        temp = new StockItem("vase", 2.20, 9);
        stockList.addStock(temp);


        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        if (sellItem(timsBasket, "car", 1) != 1) {
            System.out.println("There is no more cars in stock");
        }
        sellItem(timsBasket, "chair", 1);
        System.out.println(timsBasket);
//
//        temp = new StockItem("pen", 1.13);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(200);
        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don;t sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don;t sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
