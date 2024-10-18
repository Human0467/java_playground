package LearningDatastructures.src.ds.singlylinkedlist;

public class App {
public static void main(String[] args) {
    SinglyLinkedList myList = new SinglyLinkedList();
    myList.insertFirst(100);
    myList.insertFirst(50);
    myList.insertFirst(99);
    myList.insertFirst(76); // will be at the front
    myList.insertLast(999); // will be at the end

    myList.displayList();
}
}
