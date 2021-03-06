//A class with series of methods to manage a custom array of ints.
public class arrayInt {

    protected int[] array;
    private int currentSize;
    private int maximumSize;

    // Constructor of an arrayInt object.
    public arrayInt (int maximumSize, int currentSize) {
        array = new int[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = currentSize;
    }

    // Creates a printable string of the array.
    public static String toString(int[] intArray) {
        String result = "";

        result = result + "[";
        for (int i=0; i<intArray.length; i=i+1) {
            result = result + intArray[i];
            if (i+1<intArray.length) {     // only add the ", " if we are not at the end
                result = result + ", ";
            }
        }
        result = result + "]";

        return result;
    }

    // Set value of item in array given the index.
    public void set (int value, int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= currentSize) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        array[index] = value;
    }

    // Get value in specific index of array.
    public int get ( int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= currentSize) {
            throw new ArrayIndexOutOfBoundsException(index );
        }

        return array[index];
    }

    // Insert value onto array (increase size by 1).
    public void insert (int value, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= maximumSize) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            for (int i=currentSize-1; i>=index; i=i-1) {
                array[i+1]=array[i];
            }

            array[index]=value;
            currentSize = currentSize + 1;
        }
    }

    // Delete value in array (reduce size by 1).
    public void delete ( int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= currentSize) {
            throw new ArrayIndexOutOfBoundsException(index );
        } else {
            for (int i=currentSize-1; i>=index; i=i-1) {
                array[i-1]=array[i];
            }

            currentSize = currentSize - 1;
        }
    }

    //Main method to run and demo methods in class.
    public static void main (String[] args) {
        arrayInt arr1 = new arrayInt (10, 10);
        arr1.set(23, 7);
        int getter = arr1.get( 7);

        System.out.println ("Array 1: " + toString(arr1.array) + " GET: " + getter);

        arrayInt arr2 = new arrayInt (10, 5);
        //inserted
        arr2.insert(23, 4);
        System.out.println ("Array 2: " + toString(arr2.array));
        arr2.delete( 4);
        //deleted
        System.out.println ("Array 2: " + toString(arr2.array));

        arrayInt arr3 = new arrayInt (0, 0);

        System.out.println ("Array 3: " +toString(arr3.array));
    }
}
