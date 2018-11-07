/*
public class testPair {
    public static void main (String[] args) {
        genericsPair pair = new genericsPair ("abc", new Integer (2));                  // <1>

        // retrieve the items: (String) and (Integer) are the required 'casts'
        String s = (String)pair.getA ();                                // <2>
        Integer i = (Integer)pair.getB ();                              // <3>

        System.out.println ("Pair contains: " + s + " and " + i);
    }
}
*/

public class testPair {
    public static void main (String[] args) {
        genericsPair<String, Integer> pair = new genericsPair<> ("abc", new Integer (2));   // <1>

        // retrieve the items:
        String s = pair.getA ();                                            // <2>
        Integer i = pair.getB ();

        System.out.println ("Pair contains: " + s + " and " + i);
    }
}

