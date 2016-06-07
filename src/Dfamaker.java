import java.io.*;
import java.util.*;

class Dfamaker{
    public static void main (String args[]){
        List<String> rawinput = new ArrayList<String>();
        List<Integer> spacer= new ArrayList<Integer>();
        List<Grammar> grammars = new ArrayList<Grammar>();
        List<String> strtokens = new ArrayList<String>();
        try{
            File f= new File(args[0]);
    		Scanner s= new Scanner(f);
            while(s.hasNext()) {
    			rawinput.add(s.nextLine());
    		}
            System.out.println("Number of lines in file "+rawinput.size());
            for(int i=0;i<rawinput.size();i++){//percore toda entrada bruta para saber o que á nela
                if(rawinput.get(i).trim().isEmpty()){
                    //System.out.println("Line "+(i+1)+" is empty");
                    spacer.add(i);//seta quais são as bordas, para saber onde começa e termina cada gramática
                }else{
                    //System.out.println(rawinput.get(i));
                }
            }
            System.out.println("List of white spaces");
            for(int i=0;i<spacer.size();i++){//teste para ver se spacer está funcionand
                System.out.println((spacer.get(i)+1));
            }
             
            strtokens=rawinput.subList(0,spacer.get(0));
            System.out.println("List with "+strtokens.size()+" Tokens in String format");
            for (int i = 0;i<strtokens.size(); i++){//teste para ver se a entrada por cadeias está onde deveria
                System.out.println(strtokens.get(i));
            }
            
            spacer.add(rawinput.size());
            
            for (int i=1;i<spacer.size();i++){
                if((spacer.get(i)-1) - (spacer.get(i-1)) > 0){//o intervalo precisa ter pelo menos uma linha
                    System.out.println("Gramática da linha "+(spacer.get(i-1)+2)+" até "+spacer.get(i));//índices para imprimir as gramaticas (spacer.get(i-1)+2)+" até "+spacer.get(i)
                    Grammar grammar =new Grammar();
                    grammar.setRawInput(rawinput.subList(spacer.get(i-1)+1, spacer.get(i)));
                    grammars.add(grammar);
                }
            }
            
            System.out.println("Grammars read "+grammars.size());
            for (int i=0; i<grammars.size();i++){
                System.out.println("\nGrammar "+i);
                String []aux =grammars.get(i).getBnfToStrArray();
                for (int j=0;j<aux.length;j++){
                    System.out.println(aux[j]);
                }
                
            }
            
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
