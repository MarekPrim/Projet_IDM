/*
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.parser.antlr;

import com.google.inject.Inject;
import fr.n7.simplePDL.parser.antlr.internal.InternalTextSimplePDLParser;
import fr.n7.simplePDL.services.TextSimplePDLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TextSimplePDLParser extends AbstractAntlrParser {

	@Inject
	private TextSimplePDLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTextSimplePDLParser createParser(XtextTokenStream stream) {
		return new InternalTextSimplePDLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}

	public TextSimplePDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TextSimplePDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
