package interfaceExample;

import interfaceExample.priceable;

public class veg implements priceable {  // <1>
    // all the vegetable class things

    // and implement the Priceable interface
    public int getPrice() {                  // <2>
        return 27;  // return a price for the vegetable
    }
}