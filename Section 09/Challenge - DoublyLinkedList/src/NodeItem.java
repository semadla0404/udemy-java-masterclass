public abstract class NodeItem {
    protected NodeItem previous = null;
    protected NodeItem next = null;
    protected Object data;

    public NodeItem(Object data) {
        this.data = data;
    }

    abstract NodeItem next();
    abstract NodeItem setNext(NodeItem item);
    abstract NodeItem previous();
    abstract NodeItem setPrevious(NodeItem item);
    abstract int compareTo(NodeItem item);

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
