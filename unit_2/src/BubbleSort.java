public class BubbleSort {




    public static void swap (int[] numbers, int i1, int i2) {
        int temp;

        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;
    }



    public static void bubbleSort (int[] numbers) {
        boolean madeSwap;

        do {
            madeSwap = false;
            for (int i = 0; i < numbers.length-1; i = i + 1) {
                if (numbers[i] > numbers[i+1]) {
                    swap (numbers, i, i+1);
                    madeSwap = true;
                }
            }
        } while (madeSwap);
    }

    public static void main (String[] args) {

        int[] numbers = {15, 32, 67, 44, 98};
        for (int i : numbers
             ) {
            System.out.print(i + ", ");
        }

        System.out.println();

        bubbleSort(numbers);
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }
    }
}
