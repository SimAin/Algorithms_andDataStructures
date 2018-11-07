/*public class genericsPair {
    // set up two private fields for the objects to store
    private Object a;                                               // <1>
    private Object b;

    // our constructor takes two objects to store
    public genericsPair (Object a, Object b) {                              // <2>
        this.a = a;
        this.b = b;
    }

    // accessor to the first object
    public Object getA () {                                         // <3>
        return a;
    }

    // accessor to the second object
    public Object getB () {
        return b;
    }
}*/

public class genericsPair<A, B> {                             // <1>
    private A a;                                        // <2>
    private B b;

    public genericsPair (A a, B b) {                            // <3>
        this.a = a;
        this.b = b;
    }

    public A getA () {                                  // <4>
        return a;
    }

    public B getB () {
        return b;
    }
}


