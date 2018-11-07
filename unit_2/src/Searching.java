public class Searching {

    public static int findNumber (int[] numbers, int toFind) {
        int foundNum = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == toFind) {
                foundNum = numbers[i];
            }
        }

        return foundNum;
    }

    public static int binarySearch (int[] unNnumbers, int toFind) {
        int[] numbers = InsertionSort.insertionSort(unNnumbers);
        int l = 0;
        int r = numbers.length - 1;

        while (l <= r) {
            int m = (l + r)/2;  // compute index of middle-ish number

            if (toFind == numbers[m]) {       // SUCCESS! We found our number, so return its index
                return m;
            } else if (toFind < numbers[m]) { // choose the LEFT part
                r = m-1;
            } else { // (toFind > numbers[m])  choose the RIGHT part
                l = m+1;
            }
        }

        // we get here if the number has not been found
        return -1;
    }

    public static void main (String[] args) {
        int[] numbers = {15, 32, 44, 67, 5, 3, 44, 98, 2};

        int search = 44;

        for (int i : numbers
        ) {
            System.out.print(i + ", ");
        }

        System.out.println();

        int found = findNumber(numbers, search);
        if(found == -1) {
            System.out.println("The int " + search + " was NOT found in the array (Long Search)");
        } else {
            System.out.println("The int " + found + " was found in the array (Long search)");
        }

        int foundB = binarySearch(numbers, search);
        if(foundB == -1) {
            System.out.println("The int " + search + " was NOT found in the array (Binary search)");
        } else {
            System.out.println("The int " + found + " was found in the array (Binary search)");
        }
    }
}
