package LearningDatastructures.src.ds.stack;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top; //will represent the index position of the last item placed on the stack

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        if(!this.isFull()){
            top++;
            stackArray[top] = j;
        } else {
            System.out.println("Stack is full, unable to add " + j + ".");
        }

    }

    public long pop(){
        // doesn't really remove anything from the array, just uses the index as a
        // pointer
        if(!this.isEmpty()){
            int old_top = top;
            top--;
            return stackArray[old_top];
        } else {
            System.out.println("Stack is empty, unable to pop!");
            return -1;
        }
    }

    // returns top of the stack / last thing that was added
    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }

    
}


