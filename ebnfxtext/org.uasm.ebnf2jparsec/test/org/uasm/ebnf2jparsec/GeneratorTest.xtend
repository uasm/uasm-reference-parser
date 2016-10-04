package org.uasm.ebnf2jparsec

import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.uasm.ebnf.tests.EBNFLangInjectorProvider
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
 
import static org.junit.Assert.*
import org.eclipse.xtext.generator.IFileSystemAccess
import org.uasm.ebnf.eBNFLang.EbnfGrammar
import org.uasm.ebnf2jparsec.EBNF2JParsecGenerator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EBNFLangInjectorProvider))

class GeneratorTest {
     
    @Inject EBNF2JParsecGenerator underTest
    @Inject ParseHelper<EbnfGrammar> parseHelper 
     
    @Test
    def void test() {
		val EbnfGrammar grammar = parseHelper.parse('''
			sign = +|-
			digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
			integer = [sign]digit{digit}
		''')
        val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(grammar.eResource, fsa)
        println(fsa.allFiles)
    }
     
}