
package unquietcode.tools.flapi.builder.Method;

import javax.annotation.Generated;
import unquietcode.tools.flapi.builder.BlockChain.BlockChainBuilder_m11_m24_m25_m10;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit https://github.com/UnquietCode/Flapi for more information.
 * 
 * 
 * Generated on February 02, 2013 13:11:40 CST using version 0.3
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "February 02, 2013 13:11:40 CST", comments = "generated using Flapi, the fluent API generator for Java")
public interface MethodBuilder_m11_m12_m13_m14_m15_m16_m17_m18_m19_m20_m21 <_ReturnType >{


    /**
     * Add a BlockChain, which is a block which must be passed through
     * before the current method returns.
     * 
     */
    BlockChainBuilder_m11_m24_m25_m10 <MethodBuilder_m12_m13_m14_m15_m16_m17_m18_m19_m20_m21 <_ReturnType>> addBlockChain();

    /**
     * expect the method [0, inf) times
     * 
     */
    _ReturnType any();

    /**
     * expect the method [0, inf) times, and assign a group number
     * 
     */
    _ReturnType any(int group);

    /**
     * expect the method [X, inf) times
     * 
     */
    _ReturnType atLeast(int num);

    /**
     * expect the method [0, X] times
     * 
     */
    _ReturnType atMost(int num);

    /**
     * expect the method [0, X] times, and assign a group number
     * 
     */
    _ReturnType atMost(int num, int group);

    /**
     * expect the method [atLeast, atMost] times
     * 
     */
    _ReturnType between(int atLeast, int atMost);

    /**
     * expect the method [X, X] times
     * 
     */
    _ReturnType exactly(int num);

    /**
     * mark the method as terminal, exiting the block when called
     * 
     */
    _ReturnType last();

    /**
     * mark the method as terminal, returning an object of the given type when called
     * 
     */
    _ReturnType last(Class returnType);

    /**
     * Marks this method with a Deprecated annotation.
     * Also adds a note to the Javadocs.
     * 
     */
    MethodBuilder_m11_m12_m13_m14_m15_m16_m17_m18_m19_m20 <_ReturnType> markAsDeprecated(String reason);

}