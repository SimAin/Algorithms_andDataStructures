public class circle extends shape{
    private int radius;

    public circle (java.lang.String colour, int radius) {
        super (colour);
        this.radius = radius;
    }
    public int getRadius () {
        return radius;
    }

    public static void main (String[] args){
        circle c = new circle ("Red", 5);

        System.out.println ("The circle has colour: " + c.getColour ());
        System.out.println ("The circle has radius: " + c.getRadius ());

        circle c2 = new circle ("Red", 5);

        System.out.println ("The circle has colour: " + c2.getColour ());
        System.out.println ("The circle has radius: " + c2.getRadius ());

        if(c.equals(c2)) {
            System.out.println("THey are equal");
        } else {
            System.out.println("They are NOT");
        }

        System.out.println(c.toString());

    }
}
