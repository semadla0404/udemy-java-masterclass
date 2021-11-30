public class MyLinkedList implements DoublyLinkedList {
    private NodeItem root = null;

    public MyLinkedList(NodeItem root) {
        this.root = root;
    }

    @Override
    public NodeItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(NodeItem newItem) {
        if(this.root == null) {
            // list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        // need to traverse the list and compare the items to see where to insert it in the list
        NodeItem currentItem = this.root;  // set a node to head of the list to keep tabs on what node we are looking at
        while(currentItem != null) {
            int comparisonVal = (currentItem.compareTo(newItem));

            if(comparisonVal < 0) {
                // negative: newItem is larger than current=>move right to next node
                if (currentItem.next() != null) {
                    currentItem = currentItem.next(); // setting currentItem to the next node to iterate through the loop
                } else {
                    // we are at the end of the list, so insert new item at the end
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparisonVal > 0) {
                // positive: newItem is smaller than current=>insert before current
                if(currentItem.previous() == null) {
                    // we are at the beginning of the list, so insert new item at the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                } else {
                    // insert before current in the middle of the list
                    currentItem.previous().setNext(newItem);
                    newItem.setNext(currentItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                }
                return true;
            } else {
                // 0: newItem is a dup and we will not add
                System.out.println(newItem.getData() + " is already in the list, not added.");
                return false;
            }
        }
        System.out.println("Item not found, not added.");
        return false;
    }

    @Override
    public boolean deleteItem(NodeItem item) {
        if(this.root == null) {
            // list was empty and there is nothing to delete
            return false;
        }

        // need to traverse the list and compare each node to item
        NodeItem currentItem = this.root;  // set a node to head of the list to keep tabs on what node we are looking at
        while(currentItem != null) {
            if(currentItem.getData().equals(item.getData())) {
                // the currentItem EQUALS item, so delete it
                if(currentItem.previous() == null) {  // node to delete is at start
                    this.root = this.root.next();
                    root.setPrevious(null);
                } else if(currentItem.next() == null) {  // node to delete is at the end
                    currentItem.previous().setNext(null);
                } else {  // node to delete is in the middle
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                }
                System.out.println("Removing " + currentItem.getData());
                return true;
            } else {
                currentItem = currentItem.next();
            }
        }
        System.out.println("Item not found, no action taken.");
        return false;
    }

    @Override
    public void printList(NodeItem root) {
        NodeItem currentItem = this.getRoot();

        if(currentItem == null) {
            System.out.println("The list is empty.  Nothing to print.");
        } else {
            while(currentItem != null) {
                System.out.println(currentItem.getData());
                currentItem = currentItem.next();
            }
        }
    }
}
