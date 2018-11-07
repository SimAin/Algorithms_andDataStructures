public class SortTestLibrary {

    //Main runs all tests and returns any errors for unexpected results
    public static void main (String[] args) {

        //a normal set of data
        int[] first = {67, 98, 15, 32, 44};
        int[] second = {15, 32,  44, 67, 98};
        boolean b1 = testBubble(first, second);
        boolean s1 =testSelection(first, second);
        boolean i1 =testInsertion(first, second);

        //an empty array
        int[] emptyIn = {};
        int[] emptyExpected = {};
        boolean b2 = testBubble(emptyIn, emptyExpected);
        boolean s2 = testSelection(emptyIn, emptyExpected);
        boolean i2 = testInsertion(emptyIn, emptyExpected);

        //an array with a single element
        int[] singleIn = {17};
        int[] singleExpected = {17};
        boolean b3 =  testBubble(singleIn, singleExpected);
        boolean s3 = testSelection(singleIn, singleExpected);
        boolean i3 = testInsertion(singleIn, singleExpected);

        if(!b1 || !b2 || !b3 || !s1 || !s2 || !s3 || !i1 || !i2 || !i3){
            System.out.println("All tests ran, no errors.");
        }
    }

    public static boolean testEqualIntArraysItems (int[] first, int[] second) {
        boolean error = false;
        for (int i = 0; i < first.length; i++) {
            if(first[i] != second[i]) {
                error = true;
            }
        }

        return error;
    }


    public static boolean testBubble (int[] input, int[] expected) {
        boolean error = false;
        int[] result = SortLibrary.bubbleSort(input);
        boolean equalItemsSingleTest = testEqualIntArraysItems(result, expected );
        if (equalItemsSingleTest) {
            error = true;
            System.out.println("Error: Items are not equal (Bubble)");
        }
        return error;
    }

    public static boolean testSelection(int[] input, int[] expected) {
        boolean error = false;
        int[] result = SortLibrary.selectionSort(input);
        boolean equalItems = testEqualIntArraysItems(result, expected );
        if (equalItems) {
            error = true;
            System.out.println("Error: Items are not equal (Bubble)");
        }
        return error;
    }

    public static boolean testInsertion(int[] input, int[] expected) {
        boolean error = false;
        int[] result = SortLibrary.insertionSort(input);
        boolean equalItems = testEqualIntArraysItems(result, expected );
        if (equalItems) {
            error = true;
            System.out.println("Error: Items are not equal (Bubble)");
        }
        return error;
    }
}
