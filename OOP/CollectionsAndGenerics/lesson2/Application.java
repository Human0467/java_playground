package OOP.CollectionsAndGenerics.lesson2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //ArrayList<String> animals = new ArrayList<String>();
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("cat");
        animals.add("dog");
        animals.add("turtle");

        // // ways to loop over this
        // // 1 - for loop
        // for (int i = 0; i < animals.size(); i++) {
        //     System.out.println(animals.get(i));
        // }

        // // 2 - for each
        // // (also works for standard arrays)
        // for (String animal : animals){
        //     System.out.println(animal);
        // }

        // we can use the data structures with our own classes too!
        // defaults to size 10
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        //ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(new Vehicle("Toyota", "camry", 12000, false));
        vehicles.add(new Vehicle("Jeep", "wrangler", 25000, true));

        List<Vehicle> vehicles2 = new LinkedList<Vehicle>();
        //LinkedList<Vehicle> vehicles2 = new LinkedList<Vehicle>();
        vehicles2.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles2.add(new Vehicle("Toyota", "camry", 12000, false));
        vehicles2.add(new Vehicle("Jeep", "wrangler", 25000, true));

        // for(Vehicle car: vehicles2){
        //     System.out.println(car.toString());
        // }

        // even though one is an ArrayList and one a LinkedList, we can use the 
        // same function to print them as they are both of type List - 
        // polymorphism
        printElements(vehicles2);
        printElements(animals);
    }

    // does have some limitations - won't have access to all of the method
    // only those that are available to list. 
    public static void printElements(List someList){
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
            
        }
    }
}
