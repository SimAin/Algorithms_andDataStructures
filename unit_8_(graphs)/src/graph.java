public class graph<T> {
    list<gNode<T>> nodes;

    public graph () {
        nodes = new list<gNode<T>>();
    }

    public gNode<T> addNode (T value) {
        gNode<T> newNode = new gNode<> (value);
        nodes.join (newNode);
        return newNode;
    }

    public void addUndirectedLink (gNode<T> from, gNode<T> to) {
        from.addLink (to);
        to.addLink (from);
    }

    public int size () {
        if (nodes.size () > 0) { // <1>
            return nodes.get(0).countNodes (new list<gNode<T>> ());
        } else {
            return 0;
        }
    }


}
