public class node<T> {
    private T data;
    private node<T> leftChild;
    private node<T> rightChild;

    public node (T data) {     // <1>
        this.data = data;

        this.leftChild = null;
        this.rightChild = null;
    }

    public T getData() {
        return data;
    }

    public node getLeftChild() {
        return this.leftChild;
    }
    public void setLeftChild(node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public node getRightChild() {
        return this.rightChild ;
    }
    public void setRightChild(node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public String toString(T data) {
        //String result = "Data: " + data;
        String result = "" + data;
        //System.out.println(result);
        return result;
    }

    public String toString() {
        String topResult = "" + data;
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
        int sum = (Integer)data;
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

        System.out.println ("Node: " + data);   // Pre Order
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
        if (o instanceof node) {

            node n = (node)o;                                                       // <1>

            if (!data.equals (n.getData ())) { return false; }                      // <2>

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
}
