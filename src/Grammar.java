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
    
    public void setRawInput(List<String> input){
        System.out.println("Nova Gramática reconhecida de tamanho "+input.size());
        for (int i=0;i<input.size();i++){
            System.out.println(input.get(i));
            GrammarState myst;
            myst= new GrammarState();
            myst.setByRaw(input.get(i).trim());
        }
        
        
        
    }
    
}
