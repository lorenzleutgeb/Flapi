
package unquietcode.tools.flapi.examples.pizza.builder.Pizza;

import unquietcode.tools.flapi.examples.pizza.DisappearingPizzaExample.Pizza;
import unquietcode.tools.flapi.examples.pizza.DisappearingPizzaExample.SauceType;
import unquietcode.tools.flapi.examples.pizza.DisappearingPizzaExample.Topping;
import unquietcode.tools.flapi.support.MethodInfo;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on July 01, 2013 21:53:50 PDT using version 0.4
 */
@Generated(value = "unquietcode.tools.flapi", date = "July 01, 2013 21:53:50 PDT", comments = "generated using Flapi, the fluent API generator for Java")
public interface PizzaBuilder_addCheese_addSauce_addTopping<_ReturnType> {
    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 1, chain = {

    })
    PizzaBuilder_addSauce_addTopping<_ReturnType> addCheese();

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 1, chain = {

    })
    PizzaBuilder_addCheese_addTopping<_ReturnType> addSauce(SauceType sauceType);

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 1, chain = {

    })
    PizzaBuilder_addCheese_addSauce<_ReturnType> addTopping(Topping topping);

    @MethodInfo(checkInvocations = true, checkParentInvocations = true, type = 2, chain = {

    })
    Pizza bake();
}
