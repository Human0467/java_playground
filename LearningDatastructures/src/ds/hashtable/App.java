package LearningDatastructures.src.ds.hashtable;

public class App {

    public static void main(String[] args) {
        HashTable table = new HashTable(19);
        table.insert("apple");
        table.insert("orange");
        table.insert("grape");
        table.insert("banana");
        table.insert("kiwi");
        table.insert("mango");
        table.insert("melon");
        table.insert("pear");
        table.insert("sausage");
        table.insert("smoothie");

        System.out.println(table.find("apple"));
        System.out.println(table.find("zebra"));
        System.out.println(table.find("feeling"));
        System.out.println(table.find("africa"));
        System.out.println(table.find("melon"));

        System.out.println("");
        table.displayTable();

    }

    



}
