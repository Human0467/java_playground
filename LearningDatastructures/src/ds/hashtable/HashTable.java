package LearningDatastructures.src.ds.hashtable;

public class HashTable {

    // underlying array container
    String [] hashArray;
    int arraySize;
    int size =0; // counter for number of elements in hash table

    public HashTable(int noOfSlots){


        // array length must be prime to avoid potential stuck loop
        if(isPrime(noOfSlots)){
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[noOfSlots];
            arraySize = primeCount;

            System.out.println("Hash table size given " + noOfSlots + " is not a valid size");
            System.out.println("Hash table size changed to: " + primeCount);

        }
    }

    private boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private int getNextPrime(int minNumber){
        for(int i = minNumber; true; i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    /*
     * first of the two required hash functions - this one gives us the preferred index
     * that we would like to store the value at
     */
    private int hashFunc1(String word) {
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal < 0){
            hashVal += arraySize;
        }
        return hashVal;
    }

    /* 
     * this one gives us the step size - the number of steps we will take if the preferred index
     * is already occupied. We may need to do this multiple times
     */
    private int hashFunc2(String word) {

    }
}
