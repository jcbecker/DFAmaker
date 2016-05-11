import java.io.*;
import java.util.*;

class Dfamaker{
    public static void main (String args[]){
        List<String> linhas = new ArrayList<String>();
        try{
            File f= new File(args[0]);
    		Scanner s= new Scanner(f);
            while(s.hasNext()) {
    			linhas.add(s.nextLine());
    		}
            System.out.println(linhas.size());
            for(int i=0;i<linhas.size();i++){
                System.out.println(linhas.get(i));
            }
            
        }catch(IOException e){
            System.out.println("Hello world!");
        }
        
        
        
		
        
        
        
        
        
    }
}
