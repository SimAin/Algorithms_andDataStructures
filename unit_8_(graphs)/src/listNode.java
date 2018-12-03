public class listNode<T> {
    listNode<T> next;
    T data;

    listNode (listNode<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    public T getData () {
        return data;
    }

    public listNode<T> getNext () {
        return next;
    }

    public void setNext (listNode<T> next) {
        this.next = next;
    }
}
