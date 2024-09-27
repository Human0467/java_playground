package src.java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        
        boolean hungry = true;

        if(!hungry){
            System.out.println("I'm starving...");
        } else {
            System.out.println("I'm not hungry");
        }

        int hungerRating = 5;

        if(hungerRating < 6){
            System.out.println("not hungry");
        }else{
            System.out.println("hungry");
        }

        int favouriteTemp = 28;
        int currentTemp = 18;
        String opinion;

        if(currentTemp < favouriteTemp -5){
            opinion = "too cold";
        }else{
            opinion = "alright";
        }

        System.out.println(opinion);

        /*
         * SWITCH STATEMENTS - useful when there are lots of decisions. 
         * More reader friendly than huge if/else
         * 
         */

        int month = 6;
        String monthString;

        switch(month){
            case 1 : monthString = "January";
                break;
            case 2 : monthString = "February";
                break;
            case 3 : monthString = "March";
                break;
            case 4 : monthString = "April";
                break;
            default: monthString = "unknown";
                break;  
        }
        System.out.println(monthString);
    }
    
}
