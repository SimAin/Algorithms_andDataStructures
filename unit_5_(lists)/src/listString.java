public class listString {
    private ListNode head;


    public listString () {
        head = null;
    }


    public void join (String data) {
        if (head == null) {
            head = new ListNode (null, data);
            return;
        }

        ListNode current = head;

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode (null, data));
    }

    //TODO: Complete method and write check into main method to demo size
    //TODO: write test method in testClass
    public String leave () {
        // COMPLETE THIS METHOD
        return "";
    }

    //TODO: write check into main method to demo get
    //TODO: write test method in testClass
    public String get (int i) {
        ListNode current = this.head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                return current.getData ();
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i);
    }

    //TODO: write check into main method to demo set
    //TODO: write test method in testClass
    public void set (int i, String newData) {
        ListNode current = this.head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == i) {
                current.set(i, newData);
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i);
    }

    //TODO: write test method in testClass
    public ListNode insert (String data, int index) {
        ListNode current = this.head;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // <1>
            return new ListNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                ListNode insertedNode = new ListNode (current.getNext(), data);
                current.setNext(insertedNode);
                return this.head;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    //TODO: write check into main method to demo delete
    //TODO: write test method in testClass
    public ListNode delete (int index) {
        ListNode current = this.head;
        int currentIndex = 0;

        if (index == 0) {
            return head.getNext();
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                current.setNext ( current.getNext().getNext());

                return this.head; // remember, the delete method was called on the first item
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    public void clear() {
        this.head = null;
    }

    //TODO: write check into main method to demo size
    //TODO: write test method in testClass
    public int size () {
        int result = 0;

        ListNode current = head;

        // walk the list to find the last item
        while (current != null) {
            result += 1;
            current = current.getNext(); // Uses the Coding Hint with an inner class
        }

        return result;
    }

    // Main method to run and demo methods.
    public static void main (String[] args){
        listString ls = new listString ();

        //System.out.println ("Empty list: " + ls.head.toString());

        ls.join ("first item");
        ls.join ("middle item");
        ls.join ("last item");

        System.out.println ("Full list: " + ls.head.toString());

        ls.insert ("second item", 1);

        System.out.println ("Revised list: " + ls.head.toString());
        ls.clear();
    }


}

