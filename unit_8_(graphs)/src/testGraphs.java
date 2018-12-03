public class testGraphs {
    public static void main (String[] args){

        //TODO: write more comprehensive tests to cover all elements of the classes
        graph<Integer> graph = new graph<> ();

        gNode<Integer> node1 = graph.addNode (1);
        gNode<Integer> node2 = graph.addNode (2);
        gNode<Integer> node3 = graph.addNode (3);
        gNode<Integer> node4 = graph.addNode (4);

        graph.addUndirectedLink (node1, node2);
        graph.addUndirectedLink (node1, node4);
        graph.addUndirectedLink (node2, node4);
        graph.addUndirectedLink (node2, node3);
        graph.addUndirectedLink (node3, node4);

        System.out.println(graph.size());
    }
}
