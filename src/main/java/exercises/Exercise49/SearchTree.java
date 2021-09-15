package exercises.Exercise49;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
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
            int comp = curr.compareTo(item);
            if (comp < 0) {
                if (curr.next() != null) {
                    curr = curr.next();
                } else {
                    curr.setNext(item);
                    return true;
                }
            } else if (comp > 0) {
                if (curr.previous() != null) {
                    curr = curr.previous();
                } else {
                    curr.setPrevious(item);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem curr = this.root;
        ListItem parent = curr;
        while (curr != null) {
            if (curr.compareTo(item) < 0) {
                parent = curr;
                curr = curr.next();
            } else if (curr.compareTo(item) > 0) {
                parent = curr;
                curr = curr.previous();
            } else {
                performRemoval(curr, parent);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (item != null) {
            traverse(item.previous());
            System.out.println(item.getValue());
            traverse(item.next());
        }
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem curr = item.next();
            ListItem leftParent = item;
            while (curr.previous() != null) {
                leftParent = curr;
                curr = curr.previous();
            }
            item.setValue(curr.getValue());
            if (leftParent == item) {
                item.setNext(curr.next());
            } else {
                leftParent.setPrevious(curr.next());
            }
        }
    }
}
