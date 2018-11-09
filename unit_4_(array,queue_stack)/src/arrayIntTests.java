//A class with series of methods to test int array class.
public class arrayIntTests {

    // Test to string method.
    public static boolean testArrayIntToString (int[] input, String expected) {
        boolean error = false;
        String result = arrayInt.toString(input);
        if (!expected.contentEquals(result)) {
            error = true;
            System.out.println("Error: Items are not equal");
        }
        return error;
    }

    // Main method to test arry and demo array int.
   public static void main(String[] args) {

        //a normal set of data
        int[] arr = {67, 98, 15, 32, 44};
        String expected = "[67, 98, 15, 32, 44]";
        boolean test1 = testArrayIntToString(arr, expected);

       //a normal set of data2
       arrayInt arr10 = new arrayInt (10, 10);
       String expected10 = "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]";
       boolean test20 = testArrayIntToString(arr10.array, expected10);

       //Set Test
       arr10.set(4, 5);
       String expected101 = "[0, 0, 0, 0, 0, 4, 0, 0, 0, 0]";
       boolean result10 = testArrayIntToString(arr10.array, expected101);

       //a normal set of data3
       arrayInt arr5 = new arrayInt (10, 5);
       String expected5 = "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]";
       boolean test3 = testArrayIntToString(arr5.array, expected5);
       //Set Test
       arr10.set(4, 5);
       String expected51 = "[0, 0, 0, 0, 0, 4, 0, 0, 0, 0]";
       boolean result5 = testArrayIntToString(arr10.array, expected51);

        //a empty set of data
        int[] arr0 = {};
        String expected1 = "[]";
       boolean test4 = testArrayIntToString(arr0, expected1);

       if (test1 || test20 || test3 || test4 || result10 || result5) {
           System.out.println("Error: please review console for specific error");
       } else {
           System.out.println("No error found, all tests passed");
       }
    }
}
