/*
 * generated by Xtext 2.29.0
 */
package fr.n7.simplePDL.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TextSimplePDLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProcessElementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProcessElementProcessElementParserRuleCall_3_0 = (RuleCall)cProcessElementAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Process : 'process' name=ID '{'
		//    processElement+=ProcessElement*
		//'}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		// 'process' name=ID '{'
		//    processElement+=ProcessElement*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'process'
		public Keyword getProcessKeyword_0() { return cProcessKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//processElement+=ProcessElement*
		public Assignment getProcessElementAssignment_3() { return cProcessElementAssignment_3; }
		
		//ProcessElement
		public RuleCall getProcessElementProcessElementParserRuleCall_3_0() { return cProcessElementProcessElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.WorkDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNeedsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNeedsNeedParserRuleCall_3_0 = (RuleCall)cNeedsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//WorkDefinition:
		//     'wd'  name=ID '{'
		//      (needs+=Need)?
		//     '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'wd'  name=ID '{'
		// (needs+=Need)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'wd'
		public Keyword getWdKeyword_0() { return cWdKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(needs+=Need)?
		public Assignment getNeedsAssignment_3() { return cNeedsAssignment_3; }
		
		//Need
		public RuleCall getNeedsNeedParserRuleCall_3_0() { return cNeedsNeedParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPredecessorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPredecessorWorkDefinitionCrossReference_2_0 = (CrossReference)cPredecessorAssignment_2.eContents().get(0);
		private final RuleCall cPredecessorWorkDefinitionIDTerminalRuleCall_2_0_1 = (RuleCall)cPredecessorWorkDefinitionCrossReference_2_0.eContents().get(1);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSuccessorAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSuccessorWorkDefinitionCrossReference_4_0 = (CrossReference)cSuccessorAssignment_4.eContents().get(0);
		private final RuleCall cSuccessorWorkDefinitionIDTerminalRuleCall_4_0_1 = (RuleCall)cSuccessorWorkDefinitionCrossReference_4_0.eContents().get(1);
		
		//WorkSequence : 'ws'
		//    'from' predecessor=[WorkDefinition]
		//    'to' successor=[WorkDefinition]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'ws'
		//   'from' predecessor=[WorkDefinition]
		//   'to' successor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//'ws'
		public Keyword getWsKeyword_0() { return cWsKeyword_0; }
		
		//'from'
		public Keyword getFromKeyword_1() { return cFromKeyword_1; }
		
		//predecessor=[WorkDefinition]
		public Assignment getPredecessorAssignment_2() { return cPredecessorAssignment_2; }
		
		//[WorkDefinition]
		public CrossReference getPredecessorWorkDefinitionCrossReference_2_0() { return cPredecessorWorkDefinitionCrossReference_2_0; }
		
		//ID
		public RuleCall getPredecessorWorkDefinitionIDTerminalRuleCall_2_0_1() { return cPredecessorWorkDefinitionIDTerminalRuleCall_2_0_1; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//successor=[WorkDefinition]
		public Assignment getSuccessorAssignment_4() { return cSuccessorAssignment_4; }
		
		//[WorkDefinition]
		public CrossReference getSuccessorWorkDefinitionCrossReference_4_0() { return cSuccessorWorkDefinitionCrossReference_4_0; }
		
		//ID
		public RuleCall getSuccessorWorkDefinitionIDTerminalRuleCall_4_0_1() { return cSuccessorWorkDefinitionIDTerminalRuleCall_4_0_1; }
	}
	public class ProcessElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.ProcessElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWorkDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWorkSequenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGuidanceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cResourceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ProcessElement:
		//    WorkDefinition | WorkSequence | Guidance | Resource
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//WorkDefinition | WorkSequence | Guidance | Resource
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_0() { return cWorkDefinitionParserRuleCall_0; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_1() { return cWorkSequenceParserRuleCall_1; }
		
		//Guidance
		public RuleCall getGuidanceParserRuleCall_2() { return cGuidanceParserRuleCall_2; }
		
		//Resource
		public RuleCall getResourceParserRuleCall_3() { return cResourceParserRuleCall_3; }
	}
	public class GuidanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.Guidance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNoteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cForKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cElementsProcessElementCrossReference_2_1_0 = (CrossReference)cElementsAssignment_2_1.eContents().get(0);
		private final RuleCall cElementsProcessElementIDTerminalRuleCall_2_1_0_1 = (RuleCall)cElementsProcessElementCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cElementsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cElementsProcessElementCrossReference_2_2_1_0 = (CrossReference)cElementsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cElementsProcessElementIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cElementsProcessElementCrossReference_2_2_1_0.eContents().get(1);
		
		//Guidance: 'note' text=STRING ('for' elements+=[ProcessElement] ( "," elements+=[ProcessElement])* )?;
		@Override public ParserRule getRule() { return rule; }
		
		//'note' text=STRING ('for' elements+=[ProcessElement] ( "," elements+=[ProcessElement])* )?
		public Group getGroup() { return cGroup; }
		
		//'note'
		public Keyword getNoteKeyword_0() { return cNoteKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
		
		//('for' elements+=[ProcessElement] ( "," elements+=[ProcessElement])* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//'for'
		public Keyword getForKeyword_2_0() { return cForKeyword_2_0; }
		
		//elements+=[ProcessElement]
		public Assignment getElementsAssignment_2_1() { return cElementsAssignment_2_1; }
		
		//[ProcessElement]
		public CrossReference getElementsProcessElementCrossReference_2_1_0() { return cElementsProcessElementCrossReference_2_1_0; }
		
		//ID
		public RuleCall getElementsProcessElementIDTerminalRuleCall_2_1_0_1() { return cElementsProcessElementIDTerminalRuleCall_2_1_0_1; }
		
		//( "," elements+=[ProcessElement])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//elements+=[ProcessElement]
		public Assignment getElementsAssignment_2_2_1() { return cElementsAssignment_2_2_1; }
		
		//[ProcessElement]
		public CrossReference getElementsProcessElementCrossReference_2_2_1_0() { return cElementsProcessElementCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getElementsProcessElementIDTerminalRuleCall_2_2_1_0_1() { return cElementsProcessElementIDTerminalRuleCall_2_2_1_0_1; }
	}
	public class NeedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.Need");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNeedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNbResourcesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNbResourcesINTTerminalRuleCall_1_0 = (RuleCall)cNbResourcesAssignment_1.eContents().get(0);
		private final Keyword cOfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cResourceResourceCrossReference_3_0 = (CrossReference)cResourceAssignment_3.eContents().get(0);
		private final RuleCall cResourceResourceIDTerminalRuleCall_3_0_1 = (RuleCall)cResourceResourceCrossReference_3_0.eContents().get(1);
		
		//Need : 'need' nbResources=INT 'of' resource=[Resource];
		@Override public ParserRule getRule() { return rule; }
		
		//'need' nbResources=INT 'of' resource=[Resource]
		public Group getGroup() { return cGroup; }
		
		//'need'
		public Keyword getNeedKeyword_0() { return cNeedKeyword_0; }
		
		//nbResources=INT
		public Assignment getNbResourcesAssignment_1() { return cNbResourcesAssignment_1; }
		
		//INT
		public RuleCall getNbResourcesINTTerminalRuleCall_1_0() { return cNbResourcesINTTerminalRuleCall_1_0; }
		
		//'of'
		public Keyword getOfKeyword_2() { return cOfKeyword_2; }
		
		//resource=[Resource]
		public Assignment getResourceAssignment_3() { return cResourceAssignment_3; }
		
		//[Resource]
		public CrossReference getResourceResourceCrossReference_3_0() { return cResourceResourceCrossReference_3_0; }
		
		//ID
		public RuleCall getResourceResourceIDTerminalRuleCall_3_0_1() { return cResourceResourceIDTerminalRuleCall_3_0_1; }
	}
	public class ResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.Resource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCreateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNbAvailableResourcesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNbAvailableResourcesINTTerminalRuleCall_1_0 = (RuleCall)cNbAvailableResourcesAssignment_1.eContents().get(0);
		private final Keyword cOfKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Resource : 'create' nbAvailableResources=INT 'of' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'create' nbAvailableResources=INT 'of' name=ID
		public Group getGroup() { return cGroup; }
		
		//'create'
		public Keyword getCreateKeyword_0() { return cCreateKeyword_0; }
		
		//nbAvailableResources=INT
		public Assignment getNbAvailableResourcesAssignment_1() { return cNbAvailableResourcesAssignment_1; }
		
		//INT
		public RuleCall getNbAvailableResourcesINTTerminalRuleCall_1_0() { return cNbAvailableResourcesINTTerminalRuleCall_1_0; }
		
		//'of'
		public Keyword getOfKeyword_2() { return cOfKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
	}
	
	public class WorkSequenceTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplePDL.TextSimplePDL.WorkSequenceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStartToStartEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStartToStartStartToStartKeyword_0_0 = (Keyword)cStartToStartEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToStartEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinishToStartFinishToStartKeyword_1_0 = (Keyword)cFinishToStartEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStartToFinishEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStartToFinishStartToFinishKeyword_2_0 = (Keyword)cStartToFinishEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToFinishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFinishToFinishFinishToFinishKeyword_3_0 = (Keyword)cFinishToFinishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceType : startToStart = 'startToStart'
		//    | finishToStart = 'finishToStart'
		//    | startToFinish = 'startToFinish'
		//    | finishToFinish = 'finishToFinish';
		public EnumRule getRule() { return rule; }
		
		//startToStart = 'startToStart'
		//   | finishToStart = 'finishToStart'
		//   | startToFinish = 'startToFinish'
		//   | finishToFinish = 'finishToFinish'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//startToStart = 'startToStart'
		public EnumLiteralDeclaration getStartToStartEnumLiteralDeclaration_0() { return cStartToStartEnumLiteralDeclaration_0; }
		
		//'startToStart'
		public Keyword getStartToStartStartToStartKeyword_0_0() { return cStartToStartStartToStartKeyword_0_0; }
		
		//finishToStart = 'finishToStart'
		public EnumLiteralDeclaration getFinishToStartEnumLiteralDeclaration_1() { return cFinishToStartEnumLiteralDeclaration_1; }
		
		//'finishToStart'
		public Keyword getFinishToStartFinishToStartKeyword_1_0() { return cFinishToStartFinishToStartKeyword_1_0; }
		
		//startToFinish = 'startToFinish'
		public EnumLiteralDeclaration getStartToFinishEnumLiteralDeclaration_2() { return cStartToFinishEnumLiteralDeclaration_2; }
		
		//'startToFinish'
		public Keyword getStartToFinishStartToFinishKeyword_2_0() { return cStartToFinishStartToFinishKeyword_2_0; }
		
		//finishToFinish = 'finishToFinish'
		public EnumLiteralDeclaration getFinishToFinishEnumLiteralDeclaration_3() { return cFinishToFinishEnumLiteralDeclaration_3; }
		
		//'finishToFinish'
		public Keyword getFinishToFinishFinishToFinishKeyword_3_0() { return cFinishToFinishFinishToFinishKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequenceElements pWorkSequence;
	private final WorkSequenceTypeElements eWorkSequenceType;
	private final ProcessElementElements pProcessElement;
	private final GuidanceElements pGuidance;
	private final NeedElements pNeed;
	private final ResourceElements pResource;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TextSimplePDLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.eWorkSequenceType = new WorkSequenceTypeElements();
		this.pProcessElement = new ProcessElementElements();
		this.pGuidance = new GuidanceElements();
		this.pNeed = new NeedElements();
		this.pResource = new ResourceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.simplePDL.TextSimplePDL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Process : 'process' name=ID '{'
	//    processElement+=ProcessElement*
	//'}'
	//;
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//WorkDefinition:
	//     'wd'  name=ID '{'
	//      (needs+=Need)?
	//     '}'
	//;
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequence : 'ws'
	//    'from' predecessor=[WorkDefinition]
	//    'to' successor=[WorkDefinition]
	//;
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//enum WorkSequenceType : startToStart = 'startToStart'
	//    | finishToStart = 'finishToStart'
	//    | startToFinish = 'startToFinish'
	//    | finishToFinish = 'finishToFinish';
	public WorkSequenceTypeElements getWorkSequenceTypeAccess() {
		return eWorkSequenceType;
	}
	
	public EnumRule getWorkSequenceTypeRule() {
		return getWorkSequenceTypeAccess().getRule();
	}
	
	//ProcessElement:
	//    WorkDefinition | WorkSequence | Guidance | Resource
	//;
	public ProcessElementElements getProcessElementAccess() {
		return pProcessElement;
	}
	
	public ParserRule getProcessElementRule() {
		return getProcessElementAccess().getRule();
	}
	
	//Guidance: 'note' text=STRING ('for' elements+=[ProcessElement] ( "," elements+=[ProcessElement])* )?;
	public GuidanceElements getGuidanceAccess() {
		return pGuidance;
	}
	
	public ParserRule getGuidanceRule() {
		return getGuidanceAccess().getRule();
	}
	
	//Need : 'need' nbResources=INT 'of' resource=[Resource];
	public NeedElements getNeedAccess() {
		return pNeed;
	}
	
	public ParserRule getNeedRule() {
		return getNeedAccess().getRule();
	}
	
	//Resource : 'create' nbAvailableResources=INT 'of' name=ID;
	public ResourceElements getResourceAccess() {
		return pResource;
	}
	
	public ParserRule getResourceRule() {
		return getResourceAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
