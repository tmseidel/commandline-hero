/*
* generated by Xtext
*/
package org.remus.cmdline;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CommandLineUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.remus.cmdline.ui.internal.CommandLineActivator.getInstance().getInjector("org.remus.cmdline.CommandLine");
	}
	
}