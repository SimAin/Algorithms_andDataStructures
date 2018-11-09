//A class with series of methods to test all sort classes.
public class Tests {

    //Tests arrays are equal length
    public static boolean testEqualIntArraysLength (int[] first, int[] second) {
        boolean lengthError = false;
        if(first.length != second.length) {
            lengthError = true;
        }

        return lengthError;
    }

    //Test all items in array are equal
    public static boolean testEqualIntArraysItems (int[] first, int[] second) {
        boolean error = false;

        for (int i = 0; i < first.length; i++) {
            if(first[i] != second[i]) {
                error = true;
            }
        }

        return error;
    }

    //Test inputted lengths are equal (with expected error trigger)
    public static boolean testLength(int[] test, int[] expected, boolean expectError) {
        boolean error = false;
        if (test.length != expected.length && !expectError) {
            error = true;
            System.out.println ("Error: int inputted length does not equal the expected");
        }
        return error;
    }

    public static void testBubble () {
        int[] first = {15, 32, 67, 44, 98};
        int[] second = {15, 32, 67, 44, 98};

        boolean len = testEqualIntArraysLength(first, second);
        if (len) {
            System.out.println("Lengths are unEqual");
        } else {
            boolean it = testEqualIntArraysItems(first, second);
            if (it) {
                System.out.println("Items are unEqual");
            }
        }

        int[] p = {15, 32, 68, 44, 98};
        int[] pp = {15, 32, 67, 44, 98};

        boolean len2 = testEqualIntArraysLength(p, pp);
        if (len2) {
            System.out.println("Lengths are unEqual");
        } else {
            boolean it2 = testEqualIntArraysItems(p, pp);
            if (!it2) {
                System.out.println("Error: Items are Equal");
            }
        }

        int[] d = {15, 32, 67, 44, 98, 45};
        int[] dd = {15, 32, 67, 44, 98};

        boolean len3 = testEqualIntArraysLength(d, dd);
        if (!len3) {
            System.out.println("Error: Lengths are Equal)");
        }

        int[] y = {};
        int[] yy = {15, 32, 67, 44, 98};

        boolean len4 = testEqualIntArraysLength(y, yy);
        if (!len4) {
            System.out.println("Error: Lengths are Equal");
        } else {
            boolean it4 = testEqualIntArraysItems(y, yy);
            if (it4) {
                System.out.println("Items are unEqual");
            }
        }
    }

    public static void testSelection() {
        int[] first = {15, 32, 67, 5, 44, 98, 2};
        int[] second = {2, 5, 15, 32, 44, 67, 98};

        int[] result = SelectionSort.selectionSort(first);
        boolean lenCHeck = testLength(result, second, false);
        if(!lenCHeck) {
            for (int i = 0; i < first.length; i++) {
                if (result[i] != second[i]) {
                    System.out.println("error");
                }
            }
        }


        int[] first1 = {15, 32, 44, 5, 44, 98, 2};
        int[] second1 = {2, 5, 15, 32, 44, 44, 98};

        int[] result1 = SelectionSort.selectionSort(first1);
        boolean lenCHeck2 = testLength(result1, second1, false);
        if(!lenCHeck2) {
            for (int i = 0; i < first1.length; i++) {
                if (result1[i] != second1[i]) {
                    System.out.println("Error: Int array not sorted");
                }
            }
        }

        int[] first2 = {15, 32, 44, 5, 98, 2};
        int[] second2 = {2, 5, 15, 44, 98};

        int[] result2 = SelectionSort.selectionSort(first2);
       testLength(result2, second2, true);
    }

    public static void testInsertion() {
        int[] first = {15, 32, 67, 5, 44, 98, 2};
        int[] second = {2, 5, 15, 32, 44, 67, 98};

        int[] result = InsertionSort.insertionSort(first);
        boolean lenCHeck = testLength(result, second, false);
        if(!lenCHeck) {
            for (int i = 0; i < first.length; i++) {
                if (result[i] != second[i]) {
                    System.out.println("error");
                }
            }
        }

        int[] first1 = {15, 32, 44, 5, 44, 98, 2};
        int[] second1 = {2, 5, 15, 32, 44, 44, 98};

        int[] result1 = InsertionSort.insertionSort(first1);
        boolean lenCHeck1 = testLength(result1, second1, false);
        if(!lenCHeck1) {
            for (int i = 0; i < first1.length; i++) {
                if (result1[i] != second1[i]) {
                    System.out.println("Error: Int array not sorted");
                }
            }
        }

        int[] first2 = {};
        int[] second2 = {};

        int[] result2 = InsertionSort.insertionSort(first2);
        boolean lenCHeck2 = testLength(result2, second2, false);
        if(!lenCHeck2) {
            if(first2.length != 0 && second2.length != 0){
                for (int i = 0; i < first1.length; i++) {
                    if (result2[i] != second2[i]) {
                        System.out.println("Error: Int array not sorted");
                    }
                }
            }
        }
    }

    //Run all test methods
    public static void main (String[] args) {

        testBubble();
        testSelection();
        testInsertion();
    }
}
