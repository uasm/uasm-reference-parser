/*
 * generated by Xtext 2.10.0
 */
package org.uasm.term.lang.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTermDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.uasm.term.lang.termDsl.TermDslPackage.eINSTANCE);
		return result;
	}
	
}