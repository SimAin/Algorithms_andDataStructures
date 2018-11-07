public class queueString {
    public static void main (String[] args) {
        queueString queue = new queueString(10);
        queue.join("S");
        queue.join("I");
        queue.join("M");
        queue.join("O");
        queue.join("N");

        System.out.println(toString(queue.array));

        System.out.println(queue.leave());
        System.out.println(queue.leave());
        System.out.println(queue.leave());
        System.out.println(queue.leave());
        System.out.println(queue.leave());
    }

    public String[] array;
    public int currentSize;
    public int maximumSize;

    public queueString (int maximumSize) {
        array = new String[maximumSize];
        this.maximumSize = maximumSize;
        this.currentSize = 0;             // our stack starts empty
    }

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

    public void join (String value) throws ArrayIndexOutOfBoundsException{
        if (currentSize >= maximumSize) {
            throw new ArrayIndexOutOfBoundsException(currentSize + maximumSize );
        }

        array[currentSize] = value;
        currentSize = currentSize + 1;
    }

    public boolean isEmpty(String[] array) {
        if(array.length == 0) {
            return true;
        }
        return false;
    }

    public String leave () {
        String result = "";
        if(array.length == 0) {
            System.out.println ("Error: Stack size = 0");
        } else {
            result =  array[0];
            for (int i = 1; i <= currentSize  ; i++) {
                array[i-1] = array[i];
            }
            currentSize = currentSize -1;

        }
        return result;
    }
}
