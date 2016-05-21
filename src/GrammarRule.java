import java.util.*;
class GrammarRule{//this class must provide a rule for regular grammar
    private String terminal;
    private String nonterminal;
    
    public GrammarRule (String t, String nt){
        terminal=t;
        nonterminal=nt;
    }
    public GrammarRule (){
        terminal =new String();
        nonterminal =new String();
    }
    
    public String getTerminal(){
        return terminal;
    }
    public String getNonTerminal(){
        return nonterminal;
    }
    public String[] getRule(){
        return new String[]{terminal,nonterminal};
    }
    
    public boolean isProductive(){
        if (nonterminal.isEmpty())
            return true;
        else
            return false;
    }
    
    public void setByRaw(String rinput){
        if(rinput.endsWith(">") && rinput.startsWith("<")){//have just one nonterminal
            nonterminal=rinput.substring(1, rinput.length() -1).trim();
        }else if (rinput.endsWith(">")){//left regular grammar
            String[] aux =rinput.split("<");
            if (aux.length==2){
                terminal=aux[0].trim();
                nonterminal=aux[1].trim().substring(0,aux[1].length() -1);
            }else{
                System.out.println("ERROR: split in < return a number diferent from 2");
            }
        }else if(rinput.startsWith("<")){//right regular grammar
            
        }
        else if (!rinput.contains(">")  && !rinput.contains("<")  && !rinput.isEmpty()){//have just one terminal
            terminal=rinput;
        }
    }
}
