//
public class listNode {

    private listNode next;
    private String data;

    public listNode (listNode next, String data) {
        this.next = next;
        this.data = data;
    }

    //TODO: write test method in testClass
    // Get data for current node.
    public String getData () {
        return data;
    }

    //TODO: write test method in testClass
    // Get next node.
    public listNode getNext () {
        return next;
    }

    //TODO: write test method in testClass
    // Set vale of next node
    public void setNext (listNode next) {
        this.next = next;
    }

    //TODO: write test method in testClass
    // Return data in node
    public String get (int i) {
        listNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    //TODO: write test method in testClass
    // Set value in current node
    public void set (int i, String newData) {
        listNode current = this;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.data = newData;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

    //TODO: write test method in testClass
    // Inset node into list.
    public listNode insert (String data, int index) {
        listNode current = this;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {
            return new listNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                listNode insertedNode = new listNode (current.getNext(), data);
                current.next = insertedNode;
                return this;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    //TODO: write test method in testClass
    // Delete node in list
    public listNode delete (int index) {
        listNode current = this;
        int currentIndex = 0;

        if (index == 0) {
            return next;
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                current.setNext ( current.getNext().getNext());

                return this; // remember, the delete method was called on the first item
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    //TODO: write test method in testClass
    // Take data, create node and place it in last item
    public void join (String data) {
        listNode current = this;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new listNode (null, data));
    }

    //TODO: write test method in testClass
    // Creates a printable string of the array.
    public String toString() throws ArrayIndexOutOfBoundsException {
        String result = "[" + this.getData() + ", ";
        while (this.next != null) {
            result = result + this.next.getData() + ", ";
            this.next = this.next.getNext ();   // <3>
        }
        result = result + "]";
        return result;
    }

    // Main method to run and demo methods.
    public static void main (String[] args){
        listNode lastItem = new listNode (null, "last item");
        //ListNode middleItem = new ListNode (lastItem, "middle item");
        //ListNode firstItem = new ListNode (middleItem, "first item");
        //ListNode.join("Frank");
        //ListNode current = firstItem;     // <1>

        /*while (current != null) {         // <2>
            System.out.println (current.getData ());

            current = current.getNext ();   // <3>
        }*/


        listNode myList = lastItem;
        myList.join ("new last item");
        System.out.println ("New list: " + myList);

    }


}
