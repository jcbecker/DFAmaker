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
        GrammarRule aux= new GrammarRule(terminal, nonterminal);
        rules.add(aux);
    }
    public void addRule(GrammarRule rule){
        rules.add(rule);
        
    }
    
    public String getState(){
        return state;
    }
    
    public GrammarRule[] getRules(){
        GrammarRule[] r = new GrammarRule[rules.size()];
        return rules.toArray(r);
    }
    
    public boolean isFinal(){
        for(int i=0;i<rules.size();i++){
            if(rules.get(i).isProductive()){
                return true;
            }
        }
        return false;
    }
}
