import java.util.*;
class Grammar{
    private List<GrammarState> states;
    
    
    public Grammar (){
        states=new ArrayList<GrammarState>();
    }
    
    
    public void addState(GrammarState state){
        states.add(state);
    }
    public List<GrammarState> getStates(){
        return states;
    }
    public String[] getBnfToStrArray(){
        String[] outp= new String[states.size()];
        for (int i=0;i<states.size();i++)
            outp[i]=states.get(i).getStateToString();
        return outp;
    }
    
    
    public void setRawInput(List<String> input){
        System.out.println("Nova Gramática reconhecida de tamanho "+input.size());
        for (int i=0;i<input.size();i++){
            //System.out.println(input.get(i));
            states.add(new GrammarState());
            states.get(i).setByRaw(input.get(i).trim());
            
        }
        
    }
    
}
