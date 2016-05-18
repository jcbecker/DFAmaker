import java.io.*;
import java.util.*;

class Dfamaker{
    public static void main (String args[]){
        List<String> rawinput = new ArrayList<String>();
        List<Integer> spacer= new ArrayList<Integer>();
        List<Grammar> grammars = new ArrayList<Grammar>();
        try{
            File f= new File(args[0]);
    		Scanner s= new Scanner(f);
            while(s.hasNext()) {
    			rawinput.add(s.nextLine());
    		}
            System.out.println(rawinput.size());
            for(int i=0;i<rawinput.size();i++){
                if(rawinput.get(i).trim().isEmpty()){
                    //System.out.println("Line "+(i+1)+" is empty");
                    spacer.add(i);  
                }else{
                    System.out.println(rawinput.get(i));
                }
            }
            for(int i=0;i<spacer.size();i++){
                System.out.println(spacer.get(i));
            }
            String[] strinput = new String [spacer.get(0)]; 
            strinput=rawinput.subList(0,spacer.get(0)).toArray(strinput);
            System.out.println(strinput.length);
            for (int i = 0;i<strinput.length; i++){
                System.out.println(strinput[i]);
            }
            
            
            
            
            
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
