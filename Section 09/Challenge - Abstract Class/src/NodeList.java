public interface NodeList {
    ListItem getRoot();  // this is the "head" of the list
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
