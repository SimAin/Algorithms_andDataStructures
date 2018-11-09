public class listString {
    private ListNode head;

    // the constructor simply creates the class with a null value for "head"
    public listString () {
        head = null;
    }

    // the join method creates a new ListNode for the given item of data
    // and appends the new item to the end of the list
    public void join (String data) {
        if (head == null) {                         // <1>
            head = new ListNode (null, data);
            return;                                   // <2>
        }

        ListNode current = head;                    // <3>

        // walk the list to find the last item
        while (current.getNext () != null) {
            current = current.getNext ();
        }

        // make a new node from data and place it in the lastItem
        current.setNext (new ListNode (null, data));
    }

    public String leave () {
        // COMPLETE THIS METHOD
        return "";
    }

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
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

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
        throw new ArrayIndexOutOfBoundsException (i); // <1>
    }

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
            if (currentIndex+1 == index) {                                    // <2>
                ListNode insertedNode = new ListNode (current.getNext(), data); // <3>
                current.setNext(insertedNode);                                    // <4>
                return this.head;                                                    // <5>
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index); // <6>
    }

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

