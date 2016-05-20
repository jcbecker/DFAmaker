import java.util.*;
class Grammar{
    private List<GrammarState> s;
    
    
    public Grammar (){
        s=new ArrayList<GrammarState>();
    }
    
    
    public void addState(GrammarState state){
        this.s.add(state);
    }
    public GrammarState[] getStates(){
        GrammarState[] r= new GrammarState[s.size()];
        r=s.toArray(r);
        return r;
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
