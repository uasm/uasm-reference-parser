/*
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TermDslStandaloneSetup extends TermDslStandaloneSetupGenerated {

	def static void doSetup() {
		new TermDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}