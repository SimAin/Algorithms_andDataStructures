//A class with series of methods to manage a custom stack of strings.
public class stackString {

    public String[] array;
    public int currentSize;
    public int maximumSize;

    // Constructor of an stackString object.
    public stackString (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;             // our stack starts empty
    }

    // Creates a printable string of the array.
    public static String toString(String[] intArray) {
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

    // Pushes item onto stack ( increases size by 1)
    public void push (String value) {
        if (currentSize >= maximumSize) {
            System.out.println ("Error: Stack push has exceeded available space");
        }

        array[currentSize] = value;
        currentSize = currentSize + 1;
    }

    // Checks if stack is empty
    public boolean isEmpty(String[] array) {
        if(array.length == 0) {
            return true;
        }
        return false;
    }

    // Pop item off stack (decrease size by 1)
    public String pop () {
        String result = "";
        if(array.length == 0) {
            System.out.println ("Error: Stack size = 0");
        } else {
            result =  array[currentSize- 1];
            currentSize = currentSize -1;
        }
        return result;
    }

    //Main method to run and demo methods in class.
    public static void main (String[] args) {
        stackString stack = new stackString(10);
        stack.push("S");
        stack.push("I");
        stack.push("M");
        stack.push("O");
        stack.push("N");

        System.out.println(toString(stack.array));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
