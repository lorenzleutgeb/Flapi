
package unquietcode.tools.flapi.builder;



/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 28, 2012 24:33:22 CDT using version 0.2
 * 
 */
public interface BlockChainBuilder<_ReturnType >{


    _ReturnType addBlockReference(String blockName);

    BlockBuilder<_ReturnType> startBlock(String blockName);

}
