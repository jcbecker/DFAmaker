import java.io.*;
import java.util.*;

class Dfamaker{
    public static void main (String args[]){
        List<String> rawinput = new ArrayList<String>();
        Grammar test = new Grammar();
        try{
            File f= new File(args[0]);
    		Scanner s= new Scanner(f);
            while(s.hasNext()) {
    			rawinput.add(s.nextLine());
    		}
            System.out.println(rawinput.size());
            for(int i=0;i<rawinput.size();i++){
                if(rawinput.get(i).trim().isEmpty()){
                    System.out.println("Line "+(i+1)+" is empty");
                }else{
                    System.out.println(rawinput.get(i));
                }
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
