package beverages;

import base.Beverage;

/**
 * This is the class that contains information about "Decaf".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
