public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.printList(list.getRoot());

        // Create a string data array to avoid typing loads of addItem instructions
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for(String s : data) {
            list.addItem(new Node(s));
        }

        list.printList(list.getRoot());

        list.deleteItem(new Node("Darwin"));
        list.printList(list.getRoot());

        list.addItem(new Node("Perth"));
        list.printList(list.getRoot());

        list.deleteItem(new Node("Sydney"));
        list.deleteItem(new Node("Sydney"));
        list.deleteItem(new Node("Perth"));
        list.printList(list.getRoot());

        list.deleteItem(new Node("Adelaide"));
        list.deleteItem(new Node("Canberra"));
        list.deleteItem(new Node("Brisbane"));
        list.deleteItem(new Node("Melbourne"));
        list.printList(list.getRoot());

    }
}
