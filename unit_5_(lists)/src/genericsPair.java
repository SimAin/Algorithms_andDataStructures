// Class to demonstrate using generics
public class genericsPair<A, B> {
    private A a;
    private B b;

    // Constructor takes two objects to store
    public genericsPair (A a, B b) {
        this.a = a;
        this.b = b;
    }

    // Gets the first object
    public A getA () {
        return a;
    }

    // Gets the second object
    public B getB () {
        return b;
    }
}