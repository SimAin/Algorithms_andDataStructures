public class sortedTree<T extends Comparable<T>> {
    private sortedNode<T> root;

    public sortedTree () {
        root = null;
    }

    public boolean contains (T searchkey) {
        if (root.getData().equals (searchkey)) {
            return true;
        } else if (root.getData().compareTo (searchkey) > 0) {
            if (root.getLeftChild() == null) {
                //return null;
            } else {
                if(root.getLeftChild().contains(searchkey)) {
                    return true;
                }
                //root.getLeftChild().contains (searchkey);
            }
        } else {
            if (root.getRightChild() == null) {
                //null;
            } else {
                if(root.getRightChild().contains (searchkey)){
                    return true;
                }
            }
        }
        return false;
    }

    public void add (T key) {
        if (root == null) {
            root = new sortedNode<T> (key);
        } else {
            root.insert (key);
        }
    }

    public void showTree () {
        System.out.println ("Node: " + root.getData());   // Pre Order
        if (root.getLeftChild() != null) {
            root.getLeftChild().showTree ();
        }
        //System.out.println ("Node: " + data);   // Order
        if (root.getRightChild() != null) {
            root.getRightChild().showTree ();
        }
        //System.out.println ("Node: " + data);  // Post Order
    }
}
