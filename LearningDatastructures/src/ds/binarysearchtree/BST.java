package LearningDatastructures.src.ds.binarysearchtree;
import java.util.ArrayList;

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

    public boolean remove(K key){
        Node<K, V> currentNode = root;
        Node<K, V> parentNode = root; // parent of current

        boolean isLeftChild = false;
        // searching to find the node with the key to delete
        while(currentNode.key != key){
            parentNode = currentNode;
            if(key.compareTo(currentNode.key) < 0){
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                isLeftChild = false;
                currentNode = currentNode.rightChild;
            }
            if(currentNode == null){ 
                return false; 
            }
        }

        // we only get here if we find the node
        Node<K, V>  nodeToDelete = currentNode; // renamed only for readability

        // check if leaf (i.e. no children)
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null){
            // if there's only one node..
            if(nodeToDelete == root){
                root = null;
            } else if (isLeftChild){
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } 
        // if node has one child on the left
        else if(nodeToDelete.rightChild == null){
            if(nodeToDelete == root){
                root = nodeToDelete.leftChild;
            } else if (isLeftChild){
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        }

        // if node has one child on the right
        else if(nodeToDelete.leftChild == null){
            if(nodeToDelete == root){
                root = nodeToDelete.rightChild;
            } else if (isLeftChild){
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        }

        // if a node has two children
        else {
            Node<K,V> successor = getSuccessor(nodeToDelete);

            if(nodeToDelete == root) {
                root = successor;
            } else if(isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }

            successor.leftChild = nodeToDelete.leftChild;
        }

        return true;
    }

    private Node<K,V> getSuccessor(Node<K,V> nodeToDelete){
        // go to right then follow all the way left
        Node<K, V> successorParent = nodeToDelete;
        Node<K, V> successor = nodeToDelete;

        Node<K, V> current = nodeToDelete.rightChild; // go to right child

        while(current != null){ // start going left
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // if the sucessor not a right child
        if(successor != nodeToDelete.rightChild){
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }
        return successor;
    }

    public void displayTree(){
        ArrayList<String> toPrint = new ArrayList<>();

        public void addLevel(Node<K,V> node){

        }
    }

    public void printValues(){
        values(root);
    }

    public void values(Node<K,V> node){
        if(node.leftChild != null){
            values(node.leftChild);
        }
        if(node.rightChild != null){
            values(node.rightChild);
        }
        System.out.println(node.key);

    }
}
