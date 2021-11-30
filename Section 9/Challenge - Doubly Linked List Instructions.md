In this exercise, we will be building our own version of Java's LinkedList class.

*ListItem (abstract class) —> NodeItem*
Create an abstract class that we can call "ListItem (NodeItem)", or something similar.
	- To emulate Java's LinkedList behavior, where each item in the list points, or refers, to the next and previous item, our ListItem (NodeItem) abstract class will have two fields, "nextItem" and "previousItem" (these fields must also be of the "ListItem (NodeItem)" class).
	- This class will also have a value. It can be anything you want, but giving it a "String name" as a field is enough to serve as its value for this exercise.
	- The ListItem (NodeItem) class will also have a method to compare the values of two items' names (hint: use the compareTo() method), and methods to set the previous and next items' names.

*Node (extends ListItem) —> Node*
Create a concrete class from this abstract class (suggestion: call it "Node") and define the necessary methods.

*NodeList (interface) —> DoublyLinkedList*
Create an interface to be implemented by the class below.  We need the following method signatures to be implemented are as follows:
	- a method to get the root and returns a ListItem (NodeItem) object.
	- a method to add an Item that takes a ListItem (NodeItem) and returns a boolean to see if the item was able to be added.
	- a method to remove an item that takes a ListItem (NodeItem) and returns a boolean to see if  the item was able to be removed.
	- a method to traverse and print the list.  It will need the root to be able to start at the beginning and it will not return anything.

*MyLinkedList (implements NodeList) —> MyLinkedList*
Create the class the user will interact with that will implement the interface above.
	- We can call this class MyLinkedList. It will need an initializer, conventionally called "root", a field which needs to be of the same class as the items we will be listing.
	- In our example, "root" would be of class "NodeIItem”. "Root" will always refer to the first object to be listed, so don't forget to update it, if necessary, when linking new Node objects. If no objects have been "added" by the user, "root" remains null.
	- When the user wants to add items to our list, the MyLinkedList class should create a new object of class Node.
	- This object should be compared with other objects already referenced, or linked together, in our list and inserted alphabetically.
	- This insertion process is done by setting the new object's "nextItem" and "previousItem" fields as pointing to the alphabetically relevant existing objects, as well as updating those existing objects' "nextItem" and/or "previousItem" fields.

Summing it up, this version of Java's LinkedList works by creating new objects, not by adding existing objects to a list.
As we create new objects, we reference them through other objects of the same class, essentially "linking" them together.
If there are no other objects of the same class, then we reference the new object via the "root" of our MyLinkedList class.