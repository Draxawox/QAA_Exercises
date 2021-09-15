package exercises.Exercise49;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem curr = this.root;
        while (curr != null) {
            int comp = (curr.compareTo(item));
            if (comp < 0) {
                if (curr.next() != null) {
                    curr = curr.next();
                } else {
                    curr.setNext(item).setPrevious(curr);
                    return true;
                }
            } else if (comp > 0) {
                if (curr.previous() != null) {
                    curr.previous().setNext(item).setPrevious(curr.previous());
                    item.setNext(curr).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem thisItem = this.root;
        while (thisItem != null) {
            if (thisItem.compareTo(item) == 0) {
                if (thisItem == this.root) {
                    this.root = thisItem.next();
                } else {
                    thisItem.previous().setNext(thisItem.next());
                    if (thisItem.next() != null) {
                        thisItem.next().setPrevious(thisItem.previous());
                    }
                }
                return true;
            } else if (thisItem.compareTo(item) < 0) {
                thisItem = thisItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (item == null) {
            System.out.println("The list is empty");
        } else {
            while (item != null) {
                System.out.println(item.getValue());
                item = item.next();
            }
        }
    }
}
