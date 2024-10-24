package LearningDatastructures.src.ds.binarysearchtree;

public class Application {

    public static void main(String[] args) {
    
    BST<Integer, String> tree = new BST<Integer, String>();
    tree.insert(10, "ten");
    tree.insert(8, "eight");
    tree.insert(100, "hundred");
    tree.insert(11, "eleven");
    tree.insert(-1, "minus one");
    tree.insert(0, "zero");
    tree.insert(20, "twenty");

    // System.out.println(tree.findMax().key);
    // System.out.println(tree.findMin().key);

    tree.printValues();

    
    }
}
