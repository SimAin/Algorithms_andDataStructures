public class SortLibrary {
    public static int numberOfSwaps;
    //Main runs all sorts and returns sorted results
    public static void main (String[] args) {

        measureBubbleSort (new int[]{3, 2, 1});
        measureBubbleSort (new int[]{ 5, 4, 3, 2, 1});
        measureBubbleSort (new int[]{6, 5, 4, 3, 2, 1});
        measureBubbleSort (new int[]{ 8, 7, 6, 5, 4, 3, 2, 1});
        measureBubbleSort (new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        measureBubbleSort (new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        measureBubbleSort (new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1});

        int[] numbers = {15, 32, 67, 44, 98};
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }

        System.out.println();

        bubbleSort(numbers);
        int[] sel = selectionSort(numbers);
        int[] ins = insertionSort(numbers);
        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }

        System.out.println("HERE");
        String[] re = new String[]{"aa", "ba", "qw", "zz", "ds", "ea", "bb", "wa"};
        insertionSort (re);
        for (int i = 0; i < re.length; i++) {
            System.out.println(re[i]);
        }
    }

    public static void measureBubbleSort (int[] numbers) {
        numberOfSwaps = 0;
        bubbleSort (numbers);
        System.out.println ("Number of swaps for array length " + numbers.length +
                " is " + numberOfSwaps);
    }

    //region Helper methods

    public static void swap (int[] numbers, int i1, int i2) {
        int temp;

        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;

        numberOfSwaps += 1;
    }

    public static void swap (String[] numbers, int i1, int i2) {
        String temp;

        temp = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = temp;

        numberOfSwaps += 1;
    }


    public static int findSmallestNumberIndex(int[] array, int start) {
        int small = start;
        for (int i = start; i < array.length; i++) {
            if(array[i] < array[small]) {
                small = i;
            }
        }
        return small;
    }

    public static void doInsert(int[]numbers, int counter) {
        int mover = numbers[counter];
        for (int i = 0; i < counter; i++) {
            if(numbers[i] > mover) {
                swap(numbers, i, counter);
            }
        }
    }

    public static void doInsert(String[]numbers, int counter) {
        String mover = numbers[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println(numbers[i].compareTo(mover));
            if(numbers[i].compareTo(mover) > 0) {
                swap(numbers, i, counter);
            } else {

            }
        }
    }

    public static boolean checkEqualIntArraysLength (int[] first, int[] second) {
        boolean lengthError = false;
        if(first.length != second.length) {
            lengthError = true;
        }

        return lengthError;
    }

    public static void addLengthError(int[] beforeSort, int[] afterSort) {
        System.out.println("Error: length of array differs before and after sort. ");
        System.out.println("-- before sort: ");
        for (int i = 0; i < beforeSort.length; i++) {
            System.out.print(beforeSort[i] + ", ");
        }
        System.out.println("-- after sort: ");
        for (int i = 0; i < afterSort.length; i++) {
            System.out.print(afterSort[i] + ", ");
        }
    }

    //endregion

    //region Sorting methods

    public static int[] bubbleSort (int[] numbers) {
        boolean madeSwap;
        int[] tempArray = numbers;

        if (numbers.length != 0)
        {
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

        //Test sort length was the same as at the start
        boolean lengthsError = checkEqualIntArraysLength(tempArray, numbers);
        if(lengthsError) {
            addLengthError(tempArray, numbers);
        }

        return numbers;
    }

    public static int[] selectionSort (int[] numbers) {
        int t = 0;
        int[] tempArray = numbers;

        if(numbers.length  != 0) {
            do {
                int smallest = findSmallestNumberIndex (numbers, t);
                if(numbers[t] != smallest) {

                    swap (numbers, t, smallest);
                }
                t = t + 1;
            } while (t != numbers.length );
        }

        //Test sort length was the same as at the start
        boolean lengthsError = checkEqualIntArraysLength(tempArray, numbers);
        if(lengthsError) {
            addLengthError(tempArray, numbers);
        }

        return numbers;
    }

    public static int[] insertionSort (int[] numbers) {
        int t = 0;
        int[] tempArray = numbers;

        if(numbers.length != 0) {
            do {
                doInsert (numbers, t);
                t = t + 1;
            } while (t != numbers.length);
        }

        //Test sort length was the same as at the start
        boolean lengthsError = checkEqualIntArraysLength(tempArray, numbers);
        if(lengthsError) {
            addLengthError(tempArray, numbers);
        }

        return numbers;
    }

    public static String[] insertionSort (String[] numbers) {
        int t = 0;
        //String[] tempArray = numbers;

        if(numbers.length != 0) {
            do {
                doInsert (numbers, t);
                t = t + 1;
            } while (t != numbers.length);
        }
        return numbers;
    }

    //endregion
}
