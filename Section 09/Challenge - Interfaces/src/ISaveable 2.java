import java.util.List;

public interface ISaveable {
    List<String> write();  // add items to an array list (use a generic List to use in the signature that way you can use any type of List object)

    void read(List<String> items);  // get items from an array list (use a generic List to use in the signature that way you can use any type of List object)
}
