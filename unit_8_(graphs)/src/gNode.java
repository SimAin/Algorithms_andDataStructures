public class gNode<T> {
    private T value;
    private list<gNode<T>> links;

    public gNode (T value) {
        this.value = value;
        links = new list<gNode<T>> ();
    }

    public void addLink (gNode<T> to) {
        links.join (to);
    }

    public int countNodes (list<gNode<T>> visited) {
        int sum = 0;

        if (!visited.contains(this)) {
            visited.join (this);
            sum += 1;
        }

        for (int i=0; i<links.size(); i += 1) {
            gNode<T> child = links.get(i);
            if (!visited.contains(child)) {
                sum += child.countNodes (visited);
            }
        }

        return sum;
    }

    public boolean isEven() {
        if((links.size() / 2) % 1 == 0 ) {
            return true;
        }
        return false;
    }

}
