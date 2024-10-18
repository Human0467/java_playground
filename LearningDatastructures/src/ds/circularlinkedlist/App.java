package LearningDatastructures.src.ds.circularlinkedlist;

public class App {
    public static void main(String[] args) {
        CircularLinkedList<String> myList = new CircularLinkedList<>();
        myList.insertFirst("apple");
        myList.insertFirst("50");
        myList.insertFirst("cat");
        myList.insertFirst("pear"); // will be at the front
        myList.insertLast("garbage"); // will be at the end
    
        myList.displayList();
    }
}