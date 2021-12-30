public interface DoublyLinkedList {
    NodeItem getRoot();  // this is the "head" of the list
    boolean addItem(NodeItem item);
    boolean deleteItem(NodeItem item);
    void printList(NodeItem root);
}
