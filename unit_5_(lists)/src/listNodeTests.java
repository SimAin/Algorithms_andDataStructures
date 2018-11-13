//A class with series of methods to test int listNode class.
public class listNodeTests {

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
        listNode lastItem = new listNode (null, "last item");
        listNode middleItem = new listNode (lastItem, "middle item");
        listNode firstItem = new listNode (middleItem, "first item");
        listNode current = firstItem;

        //Joining items to list after creation.
        current.join("Frank");
        current.join("Jedi");
        current.delete(1);
        current.insert("Hand Stand", 3);
        current.set(2, "Trains");

        //Testing set and get were successful.
        if(!current.get(2).equals("Trains")) {
            System.out.println("Error: Set/Get - output not as expected.");
        }

        //Testing to string method, that joins, delete, insert were successful.
        if(checkStringValues(current.toString(), "[first item, last item, Frank, Hand Stand, Jedi, ]")) {
            System.out.println("Error: toString output not as expected.");
        }
    }
}
