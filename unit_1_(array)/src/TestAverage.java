//Test class for the Average class
public class TestAverage {

    //Test that the result equal to what is expected within a tolerance of 0.0001
    public static void testEqualDoubles (double result, double expected) {
        double tolerance = 0.0001; // we hard-code this constant into the function

        if ((result - expected < tolerance) &&
                (expected - result < tolerance)) {
            // do nothing
        } else {
            System.out.println ("Error: the result " + result +
                    " does not equal the expected " + expected);
        }
    }

    //Test that the result of the find sum method is as expected within a tolerance of 0.0001
    public static void testFindSum (double result, double expected) {
        double tolerance = 0.0001; // we hard-code this constant into the function

        if ((result - expected < tolerance) &&
                (expected - result < tolerance)) {
            // do nothing
        } else {
            System.out.println ("Error: the result " + result +
                    " does not equal the expected " + expected);
        }
    }

    //Test that the result of the strings length are as expected within a tolerance of 0.0001
    public static void testStringLengths (double[] result, double[] expected) {
        double tolerance = 0.0001; // we hard-code this constant into the function
        int counter = 0;

        for (double length : result
             ) {
            if ((length - expected[counter] < tolerance) &&
                    (expected[counter] - length < tolerance)) {
                // do nothing
            } else {
                System.out.println ("Error: char counter the result " + length +
                        " does not equal the expected " + expected[counter]);
            }
            counter ++;
        }
    }

    //Main method
    public static void main (String[] args) {

        double[] numberList = {15, 32, 67, 44, 98};
        double[] emptyList = {};
        double[] singleList = {1};

        String[] words = {"This", "is", "getting", ""};

        testEqualDoubles (Average.computeAverage (numberList), 51.2);
        testEqualDoubles (Average.computeAverage (emptyList), 0);
        testEqualDoubles (Average.computeAverage (singleList), 1);

        testEqualDoubles (Average.findSum (numberList), 256);
        testEqualDoubles (Average.findSum (emptyList), 0);
        testEqualDoubles (Average.findSum (singleList), 1);

        testFindSum(Average.findSum(numberList), 256);

        testStringLengths(Average.computeStringLength(words),new double[] {4, 2, 7, 0} );

        //Below do not have a return object and output from the method.
        System.out.println(Average.toStringLengthArray(words));
        System.out.println(Average.toDoubleArray(numberList));
        System.out.println(Average.toArray(numberList));
    }
}
