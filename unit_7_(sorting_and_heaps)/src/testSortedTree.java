public class testSortedTree {
    private sortedTree<String> node;

    public testSortedTree() {
        node = new sortedTree<>();
        node.add("Apple");
        node.add("Branch");
        node.add("Tree");
        System.out.println("All Nodes: " + node.toString() );
    }

    public static sortedNode<Integer> makeTreeIntegers (int n) {
        sortedNode<Integer>[] nodes = new sortedNode[n];

        for (int i=0; i<nodes.length; i+=1) {
            nodes[i]=new sortedNode<Integer> (i+1);
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

    public testSortedTree(int nodeCount, boolean walkTheTree) {
        sortedNode<Integer> node100 = makeTreeIntegers(nodeCount);
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
        sortedNode<Integer> node20 = makeTreeIntegers(TestNode1);
        sortedNode<Integer> node30 = makeTreeIntegers(TestNode2);
        int expectedSum = 210; // 100 * (100+1) / 2
        boolean e = node20.equals(node30);  // calls YOUR method

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
        testSortedTree item = new testSortedTree();

        item.node.showTree();
        System.out.println(item.node.contains("bark"));
        //item.node.add("bark");
        System.out.println(item.node.contains("Tree"));
    }
}
