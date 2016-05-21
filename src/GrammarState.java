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
    
    public String getAllRulesToString(){
        String outp=new String();
        for(int i=0; i<rules.size();i++){
            if (i!=0)
                outp+=" | ";
            String t=rules.get(i).getTerminal();
            String nt=rules.get(i).getNonTerminal();
            outp+=t+"<"+nt+">";
        }
        return outp;
    }
    
    public String getStateToString(){//build a left regular grammar in BNF
        return "<"+state+">"+" ::= "+this.getAllRulesToString();
    }
    
    
    public void setByRaw(String raw){
        String[] parts =raw.split("::=");
        if (parts.length==2){
            String st =parts[0].trim();
            if(st.startsWith("<") && st.endsWith(">")){//"smiles".substring(1, 5) returns "mile"
                st=st.substring(1, st.length() -1).trim();
                //System.out.println(st);
                this.state=st;
                String[] strRules=parts[1].split("\\|");
                //System.out.println ("Estado "+state+" ::= "+parts[1]);
                //System.out.println("Reconheceu "+strRules.length+" Produções");
                for (int i=0;i<strRules.length;i++){
                    rules.add(new GrammarRule());
                    rules.get(i).setByRaw(strRules[i].trim());
                }
                
                
                
                
                
            }else {
                System.out.println("wtf?");
            }
            
        }else{
            System.out.println("não dividiu em duas pares");
        }
        
    }
}
