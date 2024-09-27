package OOP.src;

public class Mammal extends Animal{

    public Mammal(int age, int weightInKgs) {
        super(age, weightInKgs);
    }

    public void move(){};
    
    // methods that only apply to mammals
    public void giveBirth(){
        System.out.println("The mammal gives birth to live young.");
    }

    
}
