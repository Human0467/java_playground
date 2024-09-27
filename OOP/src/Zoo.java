package OOP.src;

/*      ___________ package (folder) ___________
 *      |                                       |
 *      |   __________ java class (file) __     |
 *      |   |                              |    |
 *      |   |   ______ methods ______      |    |
 *      |   |   |                    |     |    |
 *      |   |   ----------------------     |    |
 *      |   --------------------------------    |
 *      -----------------------------------------
 * 
 *      Objects exist during application runtime 
 *      object variables are reference variables, they do not contain the object but
 *      a memory location. This is stored in the stack
 *      The actual object location is in the heap
 * 
 *      e.g. Car myCar;
 *      myCar = new Car();   <--- memory address in the heap that contains myCar
 *      // assign myCar to new object
 *      myCar = new Car();   <--- points address of new car. Lose track of original car object
 *      *** garbage collection needed to elimate objects with no reference to them
 *      
 */


public class Zoo {
    public static void main(String[] args) {
        // create three animals

        Animal monkey1 = new Monkey(10, 80);
        Mammal monkey2 = new Monkey(12, 50);
        Monkey monkey3 = new Monkey(14, 100);
        Macaca monkey4 = new Macaca(16, 100);
        Monkey monkey5 = new Macaca(20, 60);

        // all of the monkies can access the methods in Animal
        monkey1.eat();
        monkey2.sleep();
        // giveBirth exists in the Mammal class
        // Animal > Mammal > Monkey
        // so only monkey 2 and 3 can call the method
         
        //monkey1.giveBirth(); // <---- errors!
        monkey2.giveBirth();
        monkey3.giveBirth();

        //monkey4 implements climbable
        monkey4.climb();

        // can monkey5 climb? Its a macaca but also a Monkey!
        // it cant!
        // monkey5.climb();

        // can I cast an object? Yes! Format is (B(A).method())
        ((Macaca) monkey5).climb();
    }
}
