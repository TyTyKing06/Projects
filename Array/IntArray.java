import java.util.Random;

public class IntArray {

    //Private data fields
    private int length;
    private int myArray[];

    //Constructor to initialize the array with a given size
    public IntArray(int size) {
        length = size;
        myArray = new int[size];
    }

    //Returns the number of elements in the array
    public int size() {
        return length;
    }

    //Fills the array with random numbers between 1 and 6
    public void fillRand() {
       Random rand = new Random();
       
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Random number between 1 and 6
        }
    }

    //Changes the value at a specific index in the array
    public void set(int index, int value) {
                myArray[index] = value;
        }
    
    //Returns the value at a specific index in the array
    public int get(int index) {
        return myArray[index];
    }
  
    //Clears the array by setting all elements to 0
    public void clear() {
        myArray = new int[0]; 
        length = 0;
        }

    //Checks if the array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    //Sorts the array in ascending order
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    //Converts the array elements to a readable string format
    @Override
    public String toString() {
      String result = "[";
        for (int i = 0; i < length; i++) {
            result += myArray[i];
            if (i < length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
