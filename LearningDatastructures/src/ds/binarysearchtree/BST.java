package LearningDatastructures.src.ds.binarysearchtree;

public class BST <K, V>{

    private Node<K,V> root;

    public void insert(K key, V value){
        Node<K,V> newNode = new Node<K,V>(key, value);
        if(root == null){
            root = newNode;
        } else {
            Node<K,V> current = root;
            Node<K,V> parent;
        }
    }
}
