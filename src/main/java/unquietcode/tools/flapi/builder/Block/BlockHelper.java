
package unquietcode.tools.flapi.builder.Block;

import javax.annotation.Generated;
import unquietcode.tools.flapi.builder.Method.MethodHelper;
import unquietcode.tools.flapi.support.ObjectWrapper;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on January 27, 2013 23:00:49 CST using version 0.3
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "January 27, 2013 23:00:49 CST", comments = "generated using Flapi, the fluent API generator for Java")
public interface BlockHelper {


    void addBlockReference(String blockName, String methodSignature, ObjectWrapper<MethodHelper> _helper1);

    void addMethod(String methodSignature, ObjectWrapper<MethodHelper> _helper1);

    void endBlock();

    void startBlock(String blockName, String methodSignature, ObjectWrapper<MethodHelper> _helper1, ObjectWrapper<BlockHelper> _helper2);

    void startBlock(String methodSignature, ObjectWrapper<MethodHelper> _helper1, ObjectWrapper<BlockHelper> _helper2);

}
