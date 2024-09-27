package OOP.src;

// if the class is abstract, you can never make an instance of it, it can only
// be a parent (used for inheritance)
public abstract class Animal {
    
    //fields that all animals would have
    int age;
    int weightInKgs;

    // constructor
    public Animal(int age, int weightInKgs){
        this.age = age;
        this.weightInKgs = weightInKgs;
    }

    // these methods would work the same for all animals.
    void respire() {
        System.out.println("The animal respires.");
    }
    void eat() {
        System.err.println("The animal takes on nourishment.");
    };
    void sleep() {
        System.out.println("The animal sleeps.");
    };

    

    // child classes will need to implement this abstract method
    // So all animals will do it, but the way they do it might be
    // different
    // e.g. move could be swim, run, fly etc
    public abstract void move();
}
