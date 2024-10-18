package LearningDatastructures.src.ds.circularlinkedlist;

public class CircularLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } else {
            last.next = newNode;
            newNode = last;
        }
    }

    public T deleteFirst(){
        T temp = first.data;

        if(first.next == null){
            last = null;
        }

        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node<T> current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty(){
        return first == null;
    }
}
