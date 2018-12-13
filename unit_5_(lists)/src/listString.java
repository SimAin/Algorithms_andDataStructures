public class listString<T> {
    private listNode head;


    public listString () {
        head = null;
    }

    // Take data, create node and place it in last item
    public void join (String data) {
        if (this.head == null) {
            this.head = new listNode (null, data);
            return;
        }

        listNode current = this.head;

        while (current.getNext () != null) {
            current = current.getNext ();
        }

        current.setNext (new listNode (null, data));
    }

    public String toString () {
        String result = "";

        result += "[";
        listNode current = head;

        while (current != null) {
            result += current.getData();
            if (current.getNext() != null) {
                result += ", ";
            }
            current = current.getNext();
        }

        result += "]";

        return result;
    }

    //TODO: Complete method and write test method in testClass
    public String leave () {
        // COMPLETE THIS METHOD
        return "";
    }

    public String get (int i) throws ArrayIndexOutOfBoundsException{
        //listNode current = this.head;
        int currentIndex = 0;

        listNode current = head;

        // walk the list to find the last item
        while (current != null) {
            if(currentIndex == i) {
                return current.getData();
            }
            currentIndex+=1;
            current = current.getNext ();
        }

        throw new ArrayIndexOutOfBoundsException (i);
    }

    public listNode set (int i, String newData) throws ArrayIndexOutOfBoundsException {
        listNode current = this.head;
        int currentIndex = 0;
        if (i < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (i);
        }

        if (i == 0) {   // <1>
            return new listNode (current, newData);
        }

        while (current != null) {
            if (currentIndex+1 == i) {
                listNode insertedNode = new listNode (current.getNext().getNext(), newData);
                current.setNext(insertedNode);
                return this.head;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (i);
    }

    public listNode insert (String data, int index) {
        listNode current = this.head;
        int currentIndex = 0;
        if (index < 0) { // check index is positive
            throw new ArrayIndexOutOfBoundsException (index);
        }

        if (index == 0) {   // <1>
            return new listNode (current, data);
        }

        while (current != null) {
            if (currentIndex+1 == index) {
                listNode insertedNode = new listNode (current.getNext(), data);
                current.setNext(insertedNode);
                return this.head;
            }
            currentIndex += 1;
            current = current.getNext ();
        }
        throw new ArrayIndexOutOfBoundsException (index);
    }

    public listNode delete (int index) {
        listNode current = this.head;
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

        listNode current = head;

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

