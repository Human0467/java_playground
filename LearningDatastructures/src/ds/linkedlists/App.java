package LearningDatastructures.src.ds.linkedlists;

public class App {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;
        nodeA.next = nodeB;

        Node nodeC = new Node();
        nodeC.data = 7;
        nodeB.next = nodeC;

        Node nodeD = new Node();
        nodeD.data = 8;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
    }

    public static int listLength(Node aNode){
        int length = 1;
        while(aNode.next != null){
            aNode = aNode.next;
            length++;
        }
        return length;
    }
}
