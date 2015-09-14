package beverages;

import base.Beverage;

/**
 * This is the class that contains information about "Espresso".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
