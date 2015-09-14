package beverages;

import base.Beverage;

/**
 * This is the class that holds information about "House Blend".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
