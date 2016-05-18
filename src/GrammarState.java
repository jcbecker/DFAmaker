import java.util.*;
class GrammarState{
    private String state;
    private List<GrammarRule> rules;
    
    
    public GrammarState(String name){
        this.state=name;
        rules = new ArrayList<GrammarRule>();
    }
    public GrammarState (String name, List<GrammarRule> rules){
        this.state=name;
        this.rules=rules;
    }
    public void addRule(String terminal, String nonterminal){
        GrammarRule aux= new GrammarRule(terminal, nontermimal);
        rules.add(aux);
    }
    public void addRule(GrammarRule rule){
        rules.add(rule);
        
    }
}
