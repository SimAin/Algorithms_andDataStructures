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
}
