public class testNode {
    private node<String> node;

   public testNode () {
        node<String> nodeA = new node<>("A");
        node<String> nodeB = new node<>("B");
        node<String> nodeC = new node<>("C");

        node<String> nodeD = new node<>("D");
        node<String> nodeE = new node<>("E");
        node<String> nodeF = new node<>("F");

        node<String> nodeG = new node<>("G");

        nodeA.setLeftChild(nodeB);
        nodeA.setRightChild(nodeC);
        nodeB.setLeftChild(nodeD);
        nodeB.setRightChild(nodeE);
        nodeC.setLeftChild(nodeF);
        nodeC.setRightChild(nodeG);

        node = nodeA;
        System.out.println("All Nodes: " + node.toString() );
        System.out.println("Single Node (B): " + node.toString(nodeB.getData()));
    }

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

   public testNode (int nodeCount, boolean walkTheTree) {
        node<Integer> node100 = makeTreeIntegers(nodeCount);
        int expectedSum = 210; // 100 * (100+1) / 2
        int actualSum = node100.sumNodes();  // calls YOUR method

        // check that expectedSum == actualSum
        if (expectedSum == actualSum) {
            System.out.println("Node has expected sum.");
        } else {
            System.out.println("Actual " + actualSum);
            System.out.println("Expected " + expectedSum);
        }
        if (walkTheTree) {
            node100.showTree();
        }
    }

   public static void testNodesAreEqual (int TestNode1, int TestNode2){
        node<Integer> node20 = makeTreeIntegers(TestNode1);
        node<Integer> node30 = makeTreeIntegers(TestNode2);
        boolean e = node20.equals(node30);

        // check that expectedSum == actualSum
        if (e) {
            System.out.println("Nodes were equal.");
        } else {
            System.out.println("Error: Nodes are not equal. See the follow:");
            System.out.println("20 ... " + node20.countNodes());
            System.out.println("30 ... " + node30.countNodes());
        }
    }

    public static void main (String[] args){
        testNode item = new testNode (20, false);
        testNode stringer = new testNode();

        testNodesAreEqual(20, 30);
        testNodesAreEqual(20, 20);
    }
}
