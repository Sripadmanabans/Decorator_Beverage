package base;

/**
 * This is the class that will be the base for all the decorators.
 * Created by Sripadmanaban on 9/11/2015.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

}