/*******************************************************************************
 Copyright 2012 Benjamin Fagin

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.


     Read the included LICENSE.TXT for more information.
 ******************************************************************************/

package unquietcode.tools.flapi;

import org.junit.Test;
import unquietcode.tools.flapi.builder.DescriptorGenerator;
import unquietcode.tools.flapi.builder.MinimumInvocationsException;

/**
 * @author Ben Fagin
 * @version 04-28-2012
 */
public class AtLeast_T {

	/*
		A small test to ensure that exceptions are thrown when a minimum invocation
		is not reached.
	 */
	@Test(expected = MinimumInvocationsException.class)
	public void testAtLeast() {
		DescriptorGenerator.create(new DescriptorHelperImpl())
			.setPackage("some.package")
			.setStartingMethodName("create")
			.setDescriptorName("something")
			//.setReturnType(Void.class)  // should trigger a failure
			.addMethod("done()").last()
		.build();
	}
}
