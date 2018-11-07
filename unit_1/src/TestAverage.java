public class TestAverage {

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

        testStringLengths(Average.computeStringLength(words),new double[] {4, 2, 7, 0} );
    }
}
