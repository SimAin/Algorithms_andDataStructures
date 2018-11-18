public class sortedNode<T extends Comparable> {
    private T key;
    private sortedNode<T> leftChild;
    private sortedNode<T> rightChild;

    public sortedNode(T key) {
        this.key = key;

        this.leftChild = null;
        this.rightChild = null;
    }

    public T getData() {
        return key;
    }

    public sortedNode getLeftChild() {
        return this.leftChild;
    }
    public void setLeftChild(sortedNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public sortedNode getRightChild() {
        return this.rightChild ;
    }
    public void setRightChild(sortedNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public String toString(T data) {
        //String result = "Data: " + data;
        String result = "" + data;
        //System.out.println(result);
        return result;
    }

    public String toString() {
        String topResult = "" + key;
        String leftResult = "";
        String rightResult = "";
        if (leftChild != null) {
            leftResult = leftResult + leftChild.toString();
        }
        if (rightChild != null) {
            rightResult = rightResult + rightChild.toString();
        }
        topResult = topResult + leftResult + rightResult;
        return topResult;
    }

    public int countNodes () {
        int sum = 0;

        sum += 1;
        if (leftChild != null) {
            sum += leftChild.countNodes ();
        }
        if (rightChild != null) {
            sum += rightChild.countNodes ();
        }

        return sum;
    }

    public int sumNodes () {
        int sum = (Integer)key;
        int leftSum = 0;
        int rightSum = 0;

        if (leftChild != null) {
            leftSum += leftChild.sumNodes ();
        }
        if (rightChild != null) {
            rightSum += rightChild.sumNodes ();
        }

        sum = sum + leftSum + rightSum;

        return sum;
    }

    public void showTree () {

        System.out.println ("Node: " + key);   // Pre Order
        if (leftChild != null) {
            leftChild.showTree ();
        }
        //System.out.println ("Node: " + data);   // Order
        if (rightChild != null) {
            rightChild.showTree ();
        }
        //System.out.println ("Node: " + data);  // Post Order
    }

    public boolean equals (Object o) {
        if (o == null) { return false; }
        if (o instanceof sortedNode) {

            sortedNode n = (sortedNode)o;                                                       // <1>

            if (!key.equals (n.getData ())) { return false; }                      // <2>

            if (leftChild == null && n.getLeftChild () != null) { return false; }   // <3>
            if (!(leftChild == null && n.getLeftChild () == null)) {
                if (!leftChild.equals (n.getLeftChild ())) { return false; }        // <4>
            }

            if (rightChild == null && n.getRightChild () != null) { return false; } // <5>
            if (!(rightChild == null && n.getRightChild () == null)) {
                if (!rightChild.equals(n.getRightChild())) {
                    return false;
                }          // <6>
            }

            return true;                                                            // <7>

        } else {  // given object is not a Node, so return false
            return false;
        }
    }

    public sortedNode<T> find (T searchkey) {
        if (key.equals (searchkey)) {
            return this;
        } else if (key.compareTo (searchkey) > 0) {
            if (leftChild == null) {
                return null;
            } else {
                return leftChild.find (searchkey);
            }
        } else {
            if (rightChild == null) {
                return null;
            } else {
                return rightChild.find (searchkey);
            }
        }
    }

    public boolean contains(T searchkey) {
        if (key.equals (searchkey)) {
            return true;
        } else if (key.compareTo (searchkey) > 0) {
            if (leftChild == null) {
                //return null;
            } else {
                if(leftChild.contains(searchkey)) {
                    return true;
                }
                leftChild.contains (searchkey);
            }
        } else {
            if (rightChild == null) {
                //null;
            } else {
                if(rightChild.contains (searchkey)){
                    return true;
                }
            }
        }
        return false;
    }

    public void insert (T insertkey) {
        if (key.equals (insertkey)) {
            return;
        } else if (key.compareTo (insertkey) > 0) {
            if (leftChild == null) {
                leftChild = new sortedNode<T>(insertkey);

            } else {
                leftChild.insert (insertkey);
            }
        } else {
            if (rightChild == null) {
                rightChild = new sortedNode<T>(insertkey);
            } else {
                rightChild.insert (insertkey);
            }
        }
    }
}
