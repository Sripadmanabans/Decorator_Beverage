package base;

/**
 * This is the class that is the base for all the drinks.
 * Created by Sripadmanaban on 9/11/2015.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
