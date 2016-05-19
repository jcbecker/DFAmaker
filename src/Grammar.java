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
    
    public void setRawInput(String[] input){
        System.out.println("Nova Gramática reconhecida de tamanho "+input.length);
        for (int i=0;i<input.length;i++){
            System.out.println(input[i]);
        }
        
        
    }
    
}
