package decorators;

import base.Beverage;
import base.CondimentDecorator;

/**
 * This is the class that holds information about the decorator "Soy".
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        description = "Soy";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
