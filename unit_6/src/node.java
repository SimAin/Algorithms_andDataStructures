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

    public void setLeftChild(node<T> leftChild) {
        this.leftChild = leftChild;
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
        String topresult = "Data: " + data;
        String leftresult = "";
        String rightresult = "";
                         // <1>
        if (leftChild != null) {
            leftresult = leftresult + leftChild.toString(leftChild.getData());   // <3>
            leftChild.toString();   // <3>
        }
        if (rightChild != null) {           // <4>
            rightresult = rightresult + rightChild.toString(rightChild.getData());   // <3>
            rightChild.toString();
        }

        System.out.println(topresult + leftresult + rightresult + "  123");
        return topresult;
    }

    public int countNodes () {
        int sum = 0;

        sum += 1;                           // <1>
        if (leftChild != null) {            // <2>
            sum += leftChild.countNodes ();   // <3>
        }
        if (rightChild != null) {           // <4>
            sum += rightChild.countNodes ();  // <5>
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
}
