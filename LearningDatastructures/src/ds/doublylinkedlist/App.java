package LearningDatastructures.src.ds.doublylinkedlist;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> theList = new DoublyLinkedList<>();

        theList.insertFirst(10);
        theList.insertFirst(20);
        theList.insertFirst(30);
        theList.insertFirst(60);
        theList.insertFirst(9);
        theList.insertLast(999);
        theList.displayForward();
        theList.displayBackward();
        System.out.println("insert");
        theList.insertAfter(9, 111);
        theList.insertAfter(30, 111);
        theList.insertAfter(999, 111);
        theList.displayForward();
    }
}
