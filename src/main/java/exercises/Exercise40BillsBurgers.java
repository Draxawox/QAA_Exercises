package exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise40BillsBurgers {
    public static void start() {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}

class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat,double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println(addition1Name + " added for " + addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println(addition2Name + " added for " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println(addition3Name + " added for " + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println(addition4Name + " added for " + addition4Price);
    }

    public double itemizeHamburger() {
        double sum = this.price;
        if (addition1Price != 0) {
            sum += this.addition1Price;
        }
        if (addition2Price != 0) {
            sum += this.addition2Price;
        }
        if (addition3Price != 0) {
            sum += this.addition3Price;
        }
        if (addition4Price != 0) {
            sum += this.addition4Price;
        }
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe hamburger", "Sausage & Bacon",  14.54, "White roll");
        super.addHamburgerAddition1("Chips" , 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition3Name, double addition3Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition3Name, double addition3Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("no additional items can be added to a deluxe burger");
    }
}
class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double priceSum = super.itemizeHamburger();
        if (this.healthyExtra1Price != 0) {
            priceSum += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Price != 0) {
            priceSum += this.healthyExtra2Price;
        }
        return priceSum;
    }


}

