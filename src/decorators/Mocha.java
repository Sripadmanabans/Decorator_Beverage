package decorators;

import base.Beverage;
import base.CondimentDecorator;

/**
 * This is the class that hols the information about the decorator "Mocha".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = "Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
