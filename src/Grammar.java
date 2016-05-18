import java.util.*;
class Grammar{
    private List<GrammarState> s;
    
    
    public Grammar (){
        s=new ArrayList<GrammarState>();
    }
    public void addState(GrammarState state){
        s.add(state);
    }
    
    
}
