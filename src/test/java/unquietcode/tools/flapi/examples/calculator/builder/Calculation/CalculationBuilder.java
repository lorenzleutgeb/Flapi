
package unquietcode.tools.flapi.examples.calculator.builder.Calculation;

import unquietcode.tools.flapi.support.MethodInfo;

import javax.annotation.Generated;
import java.util.concurrent.atomic.AtomicReference;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on July 01, 2013 21:53:49 PDT using version 0.4
 */
@Generated(value = "unquietcode.tools.flapi", date = "July 01, 2013 21:53:49 PDT", comments = "generated using Flapi, the fluent API generator for Java")
public interface CalculationBuilder<_ReturnType> {
    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> abs();

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> divide(int value);

    @MethodInfo(checkInvocations = true, checkParentInvocations = true, type = 2, chain = {

    })
    AtomicReference equals();

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> minus(int value);

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> mod(int value);

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> plus(int value);

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> power(int value);

    @MethodInfo(checkInvocations = false, checkParentInvocations = false, type = 0, chain = {

    })
    CalculationBuilder<_ReturnType> times(int value);
}
