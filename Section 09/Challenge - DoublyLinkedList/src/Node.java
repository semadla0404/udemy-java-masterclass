public class Node extends NodeItem {

    public Node(Object data) {
        super(data);
    }

    @Override
    NodeItem next() {
        return this.next;
    }

    @Override
    NodeItem setNext(NodeItem item) {
        this.next = item;
        return this.next;
    }

    @Override
    NodeItem previous() {
        return this.previous;
    }

    @Override
    NodeItem setPrevious(NodeItem item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    int compareTo(NodeItem item) {
        if(item != null) {
            int retVal = ((String) super.getData()).compareTo((String) item.getData());
            // negative: listitem goes before newitem
            // 0: listitem is the same as newitem
            // positive: listitem goes after newitem
            return retVal;
        } else {
            // return -1 for a null because it would have to be placed as the first item
            return -1;
        }

    }
}
