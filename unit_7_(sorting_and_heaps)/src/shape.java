public class shape {
    private String colour;

    public shape (String colour) {
        this.colour = colour;
    }

    public String getColour () {
        return colour;
    }
}

public class circle {
    private int radius;

    public circle (String colour, int radius) {
        super (colour);
        this.radius = radius;
    }

    public int getRadius () {
        return radius;
    }
}
