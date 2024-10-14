package LearningDatastructures.src.ds.stack;

public class Stack <T> {
    private int maxSize;
    private T[] stackArray;
    private int top; //will represent the index position of the last item placed on the stack

    public Stack(int size) {
        this.maxSize = size;
        // see: https://stackoverflow.com/questions/18581002/how-to-create-a-generic-array
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T j){
        if(!this.isFull()){
            top++;
            stackArray[top] = j;
        } else {
            System.out.println("Stack is full, unable to add " + j + ".");
        }

    }

    public T pop(){
        // doesn't really remove anything from the array, just uses the index as a
        // pointer
        //if(!this.isEmpty()){
            int old_top = top;
            top--;
            return stackArray[old_top];
        //} else {
        //    System.out.println("Stack is empty, unable to pop!");
         //   return new T();
        //}
    }

    // returns top of the stack / last thing that was added
    public T peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }

    
}


