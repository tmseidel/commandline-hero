/*
* generated by Xtext
*/
package org.remus.cmdline;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CommandLineStandaloneSetup extends CommandLineStandaloneSetupGenerated{

	public static void doSetup() {
		new CommandLineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

