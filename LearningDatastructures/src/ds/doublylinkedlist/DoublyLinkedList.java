package LearningDatastructures.src.ds.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    };

    public boolean isEmpty(){
        return first == null;
    }

    // prepend - constant time O(1)
    public void insertFirst(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public Node<T> deleteFirst(){
            Node<T> tmp = first;
            if(first.next == null){
                last = null;
            } else {
                first.next.previous = null;
                first = first.next;
            }
            return tmp;
    }

    public Node<T> deleteLast(){
        Node<T> tmp = last;
        if(first.next == null){
            first = null;
        } else {
            last.previous.next = null;
            last = last.previous;
        }
        return tmp;
    }

    public boolean insertAfter(T key, T data){
        Node<T> current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(current == last){
            current.next = null; // don't think you need this?
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
            
        }
        newNode.previous = current;
        current.next = newNode;
        
        return true;
    }

    public Node<T> deleteKey(T key){
        Node<T> current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }
        if(current == last){
            current.previous.next = null;
            last = current.previous;
        } else if (current == first){
            
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
        return current;
    }

}
