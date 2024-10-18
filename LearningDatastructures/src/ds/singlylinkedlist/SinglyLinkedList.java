package LearningDatastructures.src.ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return first == null;
    }

    // prepend - constant time O(1)
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode; 
    }

    // delete from front
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    // append - O(n)
    public void insertLast(int data){
        Node current = first;
        // find the end of the list - need to traverse every element. slow
        while(current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
