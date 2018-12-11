package interfaceExample;

public class testPrices {

    //TODO comment and explain

    public static int addPrices (priceable v, priceable t) {
        return v.getPrice () + t.getPrice ();
    }

    public static void main (String[] args){
        toy t = new toy ();
        veg v = new veg();

        int r = addPrices(v,t);

        System.out.println(r);





    }
}
