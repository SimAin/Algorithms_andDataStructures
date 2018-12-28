public class stackStringTests {

    // Test to string method.
    public static boolean testStackStringToString (String[] input, String expected) {
        boolean error = false;
        String result = stackString.toString(input);
        if (!expected.contentEquals(result)) {
            error = true;
            System.out.println("Error: Items are not equal");

            System.out.println(stackString.toString(input));

            System.out.println(expected);
        }
        return error;
    }

    // Test string method.
    public static boolean testStringToString (String input, String expected) {
        boolean error = false;
        if (!expected.contentEquals(input)) {
            error = true;
            System.out.println("Error: Items are not equal");

            System.out.println(input);

            System.out.println(expected);
        }
        return error;
    }

    // Main method to test stack and demo stack string.
    public static void main(String[] args) {

        //a normal set of data
        String[] arr = {"we", "are", "fam", "and", "get", "in", "here"};
        String expected = "[we, are, fam, and, get, in, here]";
        boolean test1 = testStackStringToString(arr, expected);

        //a normal set of data2
        stackString arr10 = new stackString (10);
        String expected10 = "[null, null, null, null, null, null, null, null, null, null]";
        boolean test20 = testStackStringToString(arr10.array, expected10);

        //Push Test
        arr10.push("Hey ho");
        String expected101 = "[Hey ho, null, null, null, null, null, null, null, null, null]";
        boolean result10 = testStackStringToString(arr10.array, expected101);

        //a empty set of data3
        stackString arr5 = new stackString (10);
        String expected5 = "[null, null, null, null, null, null, null, null, null, null]";
        boolean test3 = testStackStringToString(arr5.array, expected5);

        //Push Test
        arr10.push("Why eye");
        String expected51 = "[Hey ho, Why eye, null, null, null, null, null, null, null, null]";
        boolean result5 = testStackStringToString(arr10.array, expected51);

        arr10.push("Why eye");
        arr10.push("eyes");
        arr10.push("dwn");
        arr10.push("tre");
        arr10.push("mvc");
        arr10.push("qwert");
        arr10.push("rte");
        arr10.push("move");

        //Pop Test
        arr10.pop();
        arr10.pop();
        arr10.pop();
        boolean result50 = testStringToString(arr10.pop(), "mvc");

        //a empty set of data
        String[] arr0 = {};
        String expected1 = "[]";
        boolean test4 = testStackStringToString(arr0, expected1);

        if (test1 || test20 || test3 || test4 || result10 || result5 || result50) {
            System.out.println("Error: please review console for specific error");
        } else {
            System.out.println("No error found, all tests passed");
        }
    }
}
