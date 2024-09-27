package OOP.CollectionsAndGenerics.lesson2;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
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

        // defaults to size 10
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(new Vehicle("Toyota", "camry", 12000, false));
        vehicles.add(new Vehicle("Jeep", "wrangler", 25000, true));

        for(Vehicle car: vehicles){
            System.out.println(car.toString());
        }
    }
}
