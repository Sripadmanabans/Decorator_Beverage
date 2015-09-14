import base.Beverage;
import beverages.Espresso;
import decorators.Mocha;
import decorators.Soy;
import decorators.Whip;

/**
 * This is the class that is the store for picking up coffee.
 * Created by Sripadmanaban on 9/14/2015.
 */
public class Kaffein {

    public static void main(String args[]) {
        Beverage espresso = new Espresso();
        espresso = new Soy(espresso);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + " : " + espresso.cost());
    }

}
