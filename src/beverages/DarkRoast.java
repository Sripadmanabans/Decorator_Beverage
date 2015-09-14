package beverages;

import base.Beverage;

/**
 * This is the class that contains information about "Dark Roast".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
