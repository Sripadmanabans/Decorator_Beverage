package decorators;

import base.Beverage;
import base.CondimentDecorator;

/**
 * This is the class that contains the information about the decorator "Whip".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        description = "Whip";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
