public class testNode {
    private node<String> node;

   /* public testNode () {

        node<String> nodeA = new node<String>("A");
        node<String> nodeB = new node<String>("B");
        node<String> nodeC = new node<String>("C");

        node<String> nodeD = new node<String>("D");
        node<String> nodeE = new node<String>("E");
        node<String> nodeF = new node<String>("F");

        node<String> nodeG = new node<String>("G");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeB.setLeftChild(nodeD);
        nodeB.setRightChild(nodeE);
        nodeC.setLeftChild(nodeF);
        nodeC.setRightChild(nodeG);

        node = nodeA;
        node.toString();
     *//*   node.toString(nodeB.getData());
        node.toString(nodeC.getData());*//*
    }*/



    public static node<Integer> makeTreeIntegers (int n) {
        node<Integer>[] nodes = new node[n];

        for (int i=0; i<nodes.length; i+=1) {
            nodes[i]=new node<Integer> (i+1);
        }
        for (int i=0; i<nodes.length; i+=1) {
            if (2*i+1 < nodes.length) {
                nodes[i].setLeftChild ( nodes[2*i+1] );
            }
            if (2*i+2 < nodes.length) {
                nodes[i].setRightChild ( nodes[2*i+2] );
            }
        }
        return nodes[0];
    }



    public testNode () {
        node<Integer> node100 = makeTreeIntegers (20);
        int expectedSum = 210; // 100 * (100+1) / 2
        int actualSum = node100.sumNodes();  // calls YOUR method

        // check that expectedSum == actualSum
        if (expectedSum == actualSum) {
            System.out.println("WORKED");
        } else  {
            System.out.println("Actual " + actualSum);
            System.out.println("Expected " + expectedSum);
        }
        node100.showTree();
    }



    public static void main (String[] args){
        testNode item = new testNode ();

        //System.out.println(item.node.countNodes());

    }
}
