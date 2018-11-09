////A class with series of methods to manage an insertion sort.
public class InsertionSort {

    // Insert item by triggering correct swap
    public static void doInsert(int[]numbers, int counter) {
        int mover = numbers[counter];
        for (int i = 0; i < counter; i++) {
            if(numbers[i] > mover) {
                swap(numbers, i, counter);
            }
        }
    }

    // Swap two ints in array
    public static void swap (int[] numbers, int i1, int i2) {
        int temp;
        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
    }

    // Run insertion sort for given int array
    public static int[] insertionSort (int[] numbers) {
        int t = 0;
        if(numbers.length != 0) {
            do {
                doInsert (numbers, t);
                t = t + 1;
            } while (t != numbers.length);
        }
        return numbers;
    }

    //Main method ror running and demoing sort
    public static void main(String[] args) {
        int[] numbers = {15, 32, 67, 5, 44, 98, 2};
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }

        System.out.println();

        int[] result = insertionSort(numbers);
        for (int i : result
        ) {
            System.out.print(i + ", ");
        }
    }
}
