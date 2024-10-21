package LearningDatastructures.src.ds.binarysearchtree;

public class Node<K,V> {

    K key;
    V value;
    Node<K,V> leftChild, rightChild;

    public Node(K key, V value){
        super();
        this.key = key;
        this.value = value;
    }
    
}
