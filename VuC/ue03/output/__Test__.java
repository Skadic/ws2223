import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MGPLLexer lex = new MGPLLexer(new ANTLRFileStream("D:\\etiet\\Documents\\Uni\\ws2223\\VuC\\ue03\\games\\Pong.mgpl", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MGPLParser g = new MGPLParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}