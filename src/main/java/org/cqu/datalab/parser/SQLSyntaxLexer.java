// Generated from SQLSyntax.g4 by ANTLR 4.9.2
package org.cqu.datalab.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLSyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, CREATE=3, TABLE=4, DROP=5, INSERT=6, VALUES=7, UPDATE=8, 
		SET=9, INTO=10, IF=11, NOT=12, EXISTS=13, DATETIME=14, DOUBLE=15, FLOAT=16, 
		INT=17, INTEGER=18, STRING=19, TIMESTAMP=20, LONG=21, BOOLEAN=22, BOOL=23, 
		ID=24, EQUAL=25, OPEN_P=26, CLOSE_P=27, COMMA=28, SEMICOLON=29, STAR=30, 
		METAHEAD=31, INT_T=32, L_S_STRING=33, L_D_STRING=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", "UPDATE", 
			"SET", "INTO", "IF", "NOT", "EXISTS", "DATETIME", "DOUBLE", "FLOAT", 
			"INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", 
			"EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", "METAHEAD", 
			"INT_T", "L_S_STRING", "L_D_STRING", "WS", "DIGITAL", "ID_PART", "L_STR_ESC_D", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", "'('", "')'", "','", "';'", "'*'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "DATETIME", "DOUBLE", 
			"FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", 
			"METAHEAD", "INT_T", "L_S_STRING", "L_D_STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SQLSyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0187\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u0124\n!"+
		"\r!\16!\u0125\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u012e\n\"\f\"\16\"\u0131\13"+
		"\"\3\"\3\"\3#\3#\3#\7#\u0138\n#\f#\16#\u013b\13#\3#\3#\3$\3$\3$\3$\3%"+
		"\3%\3&\3&\3&\3&\7&\u0149\n&\f&\16&\u014c\13&\3\'\3\'\3\'\3\'\5\'\u0152"+
		"\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3\u0139\2B\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\3\2 \3\2))\4\2\13\f\"\"\3\2\62;\4"+
		"\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJ"+
		"jj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u0173\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\3\u0083\3\2\2\2\5\u008a\3\2\2\2\7\u008f\3\2\2\2\t"+
		"\u0096\3\2\2\2\13\u009c\3\2\2\2\r\u00a1\3\2\2\2\17\u00a8\3\2\2\2\21\u00af"+
		"\3\2\2\2\23\u00b6\3\2\2\2\25\u00ba\3\2\2\2\27\u00bf\3\2\2\2\31\u00c2\3"+
		"\2\2\2\33\u00c6\3\2\2\2\35\u00cd\3\2\2\2\37\u00d6\3\2\2\2!\u00dd\3\2\2"+
		"\2#\u00e3\3\2\2\2%\u00e7\3\2\2\2\'\u00ef\3\2\2\2)\u00f6\3\2\2\2+\u0100"+
		"\3\2\2\2-\u0105\3\2\2\2/\u010d\3\2\2\2\61\u0112\3\2\2\2\63\u0114\3\2\2"+
		"\2\65\u0116\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u011e"+
		"\3\2\2\2?\u0120\3\2\2\2A\u0123\3\2\2\2C\u0127\3\2\2\2E\u0134\3\2\2\2G"+
		"\u013e\3\2\2\2I\u0142\3\2\2\2K\u0144\3\2\2\2M\u0151\3\2\2\2O\u0153\3\2"+
		"\2\2Q\u0155\3\2\2\2S\u0157\3\2\2\2U\u0159\3\2\2\2W\u015b\3\2\2\2Y\u015d"+
		"\3\2\2\2[\u015f\3\2\2\2]\u0161\3\2\2\2_\u0163\3\2\2\2a\u0165\3\2\2\2c"+
		"\u0167\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016d\3\2\2\2k\u016f\3\2"+
		"\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0175\3\2\2\2s\u0177\3\2\2\2u\u0179"+
		"\3\2\2\2w\u017b\3\2\2\2y\u017d\3\2\2\2{\u017f\3\2\2\2}\u0181\3\2\2\2\177"+
		"\u0183\3\2\2\2\u0081\u0185\3\2\2\2\u0083\u0084\5s:\2\u0084\u0085\5W,\2"+
		"\u0085\u0086\5e\63\2\u0086\u0087\5W,\2\u0087\u0088\5S*\2\u0088\u0089\5"+
		"u;\2\u0089\4\3\2\2\2\u008a\u008b\5Y-\2\u008b\u008c\5q9\2\u008c\u008d\5"+
		"k\66\2\u008d\u008e\5g\64\2\u008e\6\3\2\2\2\u008f\u0090\5S*\2\u0090\u0091"+
		"\5q9\2\u0091\u0092\5W,\2\u0092\u0093\5O(\2\u0093\u0094\5u;\2\u0094\u0095"+
		"\5W,\2\u0095\b\3\2\2\2\u0096\u0097\5u;\2\u0097\u0098\5O(\2\u0098\u0099"+
		"\5Q)\2\u0099\u009a\5e\63\2\u009a\u009b\5W,\2\u009b\n\3\2\2\2\u009c\u009d"+
		"\5U+\2\u009d\u009e\5q9\2\u009e\u009f\5k\66\2\u009f\u00a0\5m\67\2\u00a0"+
		"\f\3\2\2\2\u00a1\u00a2\5_\60\2\u00a2\u00a3\5i\65\2\u00a3\u00a4\5s:\2\u00a4"+
		"\u00a5\5W,\2\u00a5\u00a6\5q9\2\u00a6\u00a7\5u;\2\u00a7\16\3\2\2\2\u00a8"+
		"\u00a9\5y=\2\u00a9\u00aa\5O(\2\u00aa\u00ab\5e\63\2\u00ab\u00ac\5w<\2\u00ac"+
		"\u00ad\5W,\2\u00ad\u00ae\5s:\2\u00ae\20\3\2\2\2\u00af\u00b0\5w<\2\u00b0"+
		"\u00b1\5m\67\2\u00b1\u00b2\5U+\2\u00b2\u00b3\5O(\2\u00b3\u00b4\5u;\2\u00b4"+
		"\u00b5\5W,\2\u00b5\22\3\2\2\2\u00b6\u00b7\5s:\2\u00b7\u00b8\5W,\2\u00b8"+
		"\u00b9\5u;\2\u00b9\24\3\2\2\2\u00ba\u00bb\5_\60\2\u00bb\u00bc\5i\65\2"+
		"\u00bc\u00bd\5u;\2\u00bd\u00be\5k\66\2\u00be\26\3\2\2\2\u00bf\u00c0\5"+
		"_\60\2\u00c0\u00c1\5Y-\2\u00c1\30\3\2\2\2\u00c2\u00c3\5i\65\2\u00c3\u00c4"+
		"\5k\66\2\u00c4\u00c5\5u;\2\u00c5\32\3\2\2\2\u00c6\u00c7\5W,\2\u00c7\u00c8"+
		"\5}?\2\u00c8\u00c9\5_\60\2\u00c9\u00ca\5s:\2\u00ca\u00cb\5u;\2\u00cb\u00cc"+
		"\5s:\2\u00cc\34\3\2\2\2\u00cd\u00ce\5U+\2\u00ce\u00cf\5O(\2\u00cf\u00d0"+
		"\5u;\2\u00d0\u00d1\5W,\2\u00d1\u00d2\5u;\2\u00d2\u00d3\5_\60\2\u00d3\u00d4"+
		"\5g\64\2\u00d4\u00d5\5W,\2\u00d5\36\3\2\2\2\u00d6\u00d7\5U+\2\u00d7\u00d8"+
		"\5k\66\2\u00d8\u00d9\5w<\2\u00d9\u00da\5Q)\2\u00da\u00db\5e\63\2\u00db"+
		"\u00dc\5W,\2\u00dc \3\2\2\2\u00dd\u00de\5Y-\2\u00de\u00df\5e\63\2\u00df"+
		"\u00e0\5k\66\2\u00e0\u00e1\5O(\2\u00e1\u00e2\5u;\2\u00e2\"\3\2\2\2\u00e3"+
		"\u00e4\5_\60\2\u00e4\u00e5\5i\65\2\u00e5\u00e6\5u;\2\u00e6$\3\2\2\2\u00e7"+
		"\u00e8\5_\60\2\u00e8\u00e9\5i\65\2\u00e9\u00ea\5u;\2\u00ea\u00eb\5W,\2"+
		"\u00eb\u00ec\5[.\2\u00ec\u00ed\5W,\2\u00ed\u00ee\5q9\2\u00ee&\3\2\2\2"+
		"\u00ef\u00f0\5s:\2\u00f0\u00f1\5u;\2\u00f1\u00f2\5q9\2\u00f2\u00f3\5_"+
		"\60\2\u00f3\u00f4\5i\65\2\u00f4\u00f5\5[.\2\u00f5(\3\2\2\2\u00f6\u00f7"+
		"\5u;\2\u00f7\u00f8\5_\60\2\u00f8\u00f9\5g\64\2\u00f9\u00fa\5W,\2\u00fa"+
		"\u00fb\5s:\2\u00fb\u00fc\5u;\2\u00fc\u00fd\5O(\2\u00fd\u00fe\5g\64\2\u00fe"+
		"\u00ff\5m\67\2\u00ff*\3\2\2\2\u0100\u0101\5e\63\2\u0101\u0102\5k\66\2"+
		"\u0102\u0103\5i\65\2\u0103\u0104\5[.\2\u0104,\3\2\2\2\u0105\u0106\5Q)"+
		"\2\u0106\u0107\5k\66\2\u0107\u0108\5k\66\2\u0108\u0109\5e\63\2\u0109\u010a"+
		"\5W,\2\u010a\u010b\5O(\2\u010b\u010c\5i\65\2\u010c.\3\2\2\2\u010d\u010e"+
		"\5Q)\2\u010e\u010f\5k\66\2\u010f\u0110\5k\66\2\u0110\u0111\5e\63\2\u0111"+
		"\60\3\2\2\2\u0112\u0113\5K&\2\u0113\62\3\2\2\2\u0114\u0115\7?\2\2\u0115"+
		"\64\3\2\2\2\u0116\u0117\7*\2\2\u0117\66\3\2\2\2\u0118\u0119\7+\2\2\u0119"+
		"8\3\2\2\2\u011a\u011b\7.\2\2\u011b:\3\2\2\2\u011c\u011d\7=\2\2\u011d<"+
		"\3\2\2\2\u011e\u011f\7,\2\2\u011f>\3\2\2\2\u0120\u0121\7#\2\2\u0121@\3"+
		"\2\2\2\u0122\u0124\5I%\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126B\3\2\2\2\u0127\u012f\7)\2\2\u0128"+
		"\u0129\7)\2\2\u0129\u012e\7)\2\2\u012a\u012b\7^\2\2\u012b\u012e\7)\2\2"+
		"\u012c\u012e\n\2\2\2\u012d\u0128\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7)\2\2\u0133D\3\2\2\2\u0134"+
		"\u0139\7$\2\2\u0135\u0138\5M\'\2\u0136\u0138\13\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013dF\3\2\2\2\u013e\u013f\t\3\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\b$\2\2\u0141H\3\2\2\2\u0142\u0143\t\4\2\2\u0143J\3\2\2\2\u0144\u014a"+
		"\t\5\2\2\u0145\u0149\t\5\2\2\u0146\u0149\5I%\2\u0147\u0149\7a\2\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bL\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014e\7$\2\2\u014e\u0152\7$\2\2\u014f\u0150\7^\2\2\u0150"+
		"\u0152\7$\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2\2\2\u0152N\3\2\2\2\u0153"+
		"\u0154\t\6\2\2\u0154P\3\2\2\2\u0155\u0156\t\7\2\2\u0156R\3\2\2\2\u0157"+
		"\u0158\t\b\2\2\u0158T\3\2\2\2\u0159\u015a\t\t\2\2\u015aV\3\2\2\2\u015b"+
		"\u015c\t\n\2\2\u015cX\3\2\2\2\u015d\u015e\t\13\2\2\u015eZ\3\2\2\2\u015f"+
		"\u0160\t\f\2\2\u0160\\\3\2\2\2\u0161\u0162\t\r\2\2\u0162^\3\2\2\2\u0163"+
		"\u0164\t\16\2\2\u0164`\3\2\2\2\u0165\u0166\t\17\2\2\u0166b\3\2\2\2\u0167"+
		"\u0168\t\20\2\2\u0168d\3\2\2\2\u0169\u016a\t\21\2\2\u016af\3\2\2\2\u016b"+
		"\u016c\t\22\2\2\u016ch\3\2\2\2\u016d\u016e\t\23\2\2\u016ej\3\2\2\2\u016f"+
		"\u0170\t\24\2\2\u0170l\3\2\2\2\u0171\u0172\t\25\2\2\u0172n\3\2\2\2\u0173"+
		"\u0174\t\26\2\2\u0174p\3\2\2\2\u0175\u0176\t\27\2\2\u0176r\3\2\2\2\u0177"+
		"\u0178\t\30\2\2\u0178t\3\2\2\2\u0179\u017a\t\31\2\2\u017av\3\2\2\2\u017b"+
		"\u017c\t\32\2\2\u017cx\3\2\2\2\u017d\u017e\t\33\2\2\u017ez\3\2\2\2\u017f"+
		"\u0180\t\34\2\2\u0180|\3\2\2\2\u0181\u0182\t\35\2\2\u0182~\3\2\2\2\u0183"+
		"\u0184\t\36\2\2\u0184\u0080\3\2\2\2\u0185\u0186\t\37\2\2\u0186\u0082\3"+
		"\2\2\2\13\2\u0125\u012d\u012f\u0137\u0139\u0148\u014a\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}