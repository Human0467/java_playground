package LearningDatastructures.src.ds.queue;

public class Queue {

    private int maxSize; 
    private long[] queArray;

    // index positions for front and back
    private int front;
    private int rear;

    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[maxSize];
        front = 0; // index position of first slot of array
        rear = -1; // no item to be considered as last item;
        nItems = 0;
    }

    public void insert(long j){
        // if we try to add too many it will wrap around and overwrite the first values
        if(rear == maxSize -1){
            rear = -1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    /* should probably rebuild the array to allow for new values to be
     * added. This currently doesn't work as expected
     */
    public long remove(){ // remove item from the front of the queue
        long temp = queArray[front];
        front ++;
        if(front == maxSize){
            front = 0; 
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]\n");
    }
}
