/*
 * generated by Xtext 2.10.0
 */
package org.uasm.ebnf


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EBNFLangStandaloneSetup extends EBNFLangStandaloneSetupGenerated {

	def static void doSetup() {
		new EBNFLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
