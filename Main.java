import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
public static void main(String[] args) {
    try { 
        CharStream cs = fromFileName("Test.ts");
        var lexer = new TypeScriptLexer(cs);  //instantiate a lexer
        var tokens = new CommonTokenStream(lexer); //scan stream for tokens
        var parser = new TypeScriptParser(tokens);  //parse the tokens

        ParseTree tree = parser.program(); // parse the content and get the tree
        var listener = new TypeScriptListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
        System.out.println(listener.result());

    } catch(Exception e) {}  //load the file
    
}}
