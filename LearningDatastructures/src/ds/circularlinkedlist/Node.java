package LearningDatastructures.src.ds.circularlinkedlist;

public class Node<T> {
    public T data;
    public Node<T> next = null;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}

