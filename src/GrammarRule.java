import java.util.*;
class GrammarRule{//this class must provide a rule for regular grammar
    private String terminal;
    private String nonterminal;
    
    public GrammarRule (String t, String nt){
        this.terminal=t;
        this.nontermimal=nt;
    }
    
    public String getTerminal(){
        return terminal;
    }
    public String getNonTerminal(){
        return nonterminal;
    }
    
    public boolean isProductive(){
        if (nonterminal.isEmpty())
            return true;
        else
            return false;
    }
    
}
