public class SelectionSort {

    public static int findSmallestNumberIndex(int[] array, int start) {
        int small = start;
        for (int i = start; i < array.length; i++) {
            if(array[i] < array[small]) {
                small = i;
            }
        }
        return small;
    }

    public static void swap (int[] numbers, int i1, int i2) {
        int temp;
        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
    }

    public static int[] selectionSort (int[] numbers) {
        int t = 0;
        do {
            int smallest = findSmallestNumberIndex (numbers, t);
            if(numbers[t] != smallest) {

                swap (numbers, t, smallest);
            }
            t = t + 1;
        } while (t != numbers.length );
        return numbers;
    }

    public static void main (String[] args) {
        int[] numbers = {15, 32, 67, 5, 44, 98, 2};
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }

        System.out.println();

        selectionSort(numbers);
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }
    }
}
