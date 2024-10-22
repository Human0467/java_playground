package LearningDatastructures.src.ds.binarysearchtree;

public class BST <K extends Comparable<K>, V>{

    private Node<K,V> root;

    public void insert(K key, V value){
        Node<K,V> newNode = new Node<K,V>(key, value);
        if(root == null){
            root = newNode;
        } else {
            Node<K,V> current = root;
            Node<K,V> parent;

            while(true) {
                parent = current;
                if(key.compareTo(current.key) < 0){
                    current = current.leftChild;
                    if(current == null){ // it's parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null){ // it's parent is the leaf node
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node<K,V> findMin(){
        Node<K,V> current = root;
        Node<K,V> last = null;

        while(current != null){
            last = current;
            current = current.leftChild;
        }

        return last;
    }

    public Node<K,V> findMax(){
        Node<K,V> current = root;
        Node<K,V> last = null;

        while(current != null){
            last = current;
            current = current.rightChild;
        }

        return last;
    }
}
