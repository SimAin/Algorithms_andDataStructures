public class listStringTests {
    public static boolean checkStringValues(String data, String expected) {
        if(data.equals(expected)) {
            return false;
        } else {
            System.out.println("expected: " + expected);
            System.out.println("actual: " + data);
        }
        return true;
    }

    // Main method to run tests.
    public static void main (String[] args){
        listString firstItem = new listString ();
        listString current = firstItem;
        current.join("middle");
        current.join("end");

        //Joining items to list after creation.
        current.join("Frank");
        current.join("Jedi");
        current.delete(1);
        current.insert("Hand Stand", 2);
        current.set(2, "Trains");

        //Testing set and get were successful.
        if(!current.get(2).equals("Trains")) {
            System.out.println("Error: Set/Get - output not as expected.");
            System.out.println(current.toString());
            System.out.println("Actual: " + current.get(2));
            System.out.println("Expected: Trains");
        }

        //Testing size function works as expected.
        if(current.size() != 4) {
            System.out.println("Error: Set/Get - output size not as expected.");
        }

        //Testing to string method, that joins, delete, insert were successful.
        if(checkStringValues(current.toString(), "[middle, Frank, Trains, Jedi]")) {
            System.out.println("Error: toString output not as expected.");
        }

        System.out.println("Run complete: Any errors will be listed above.");
    }
}
