package LearningDatastructures.src.adt;

public class Counter {

    private String str;
    private int count = 0;

    public Counter(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public void increment(){
        this.count++;
    }

    public int getCurrentValue(){
        return count;
    }

    public String toString(){
        return str + ": " + count;
    }
}
