/*********************************************************************
 Flapi, the fluent API builder for Java.
 Visit the project page at https://github.com/UnquietCode/Flapi

 Flapi is free and open software provided without a license.
 ********************************************************************/

package unquietcode.tools.flapi.generator;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JDefinedClass;
import unquietcode.tools.flapi.graph.components.StateClass;

/**
 * @author Ben Fagin
 * @version 08-06-2012
 */
public interface TypeCreationStrategy {
	JDefinedClass createStrongType(GeneratorContext ctx, StateClass state);
	JClass createWeakType(GeneratorContext ctx, StateClass state);
}