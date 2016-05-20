import java.util.*;

class GrammarState{
    private String state;
    private List<GrammarRule> rules;
    
    public GrammarState (){
        rules = new ArrayList<GrammarRule>();
    }
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
    
    public List<GrammarRule> getRules(){
        return rules;
    }
    
    public boolean isFinal(){
        for(int i=0;i<rules.size();i++){
            if(rules.get(i).isProductive()){
                return true;
            }
        }
        return false;
    }
    
    public void setByRaw(String raw){
        String[] parts =raw.split("::=");
        if (parts.length==2){
            String st =parts[0].trim();
            if(st.startsWith("<") && st.endsWith(">")){//"smiles".substring(1, 5) returns "mile"
                st=st.substring(1, st.length() -1).trim();
                //System.out.println(st);
                this.state=st;
            }else {
                System.out.println("wtf?");
            }
            
            
            
        }else{
            System.out.println("não dividiu em duas pares");
        }
        
    }
}
