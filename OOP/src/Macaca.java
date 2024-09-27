package OOP.src;

public class Macaca extends Monkey implements Climbable {

    public Macaca(int age, int weightInKgs) {
        super(age, weightInKgs);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void climb() {
        System.out.println("Climbs a tree.");
    }
    
}
