package LearningDatastructures.src.ds.doublylinkedlist;

public class Node<T> {
    public T data;
    public Node<T> next = null;
    public Node <T> previous = null;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}


