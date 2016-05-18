class GrammarRule{//this class must provide a rule for regular grammar
    private String terminal;
    private String nontermimal;
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
    
    
}
