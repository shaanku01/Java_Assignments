package shanker.assignment.data;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try{
           Map<Character,Integer> map = new HashMap<Character,Integer>();
            PrintWriter fw = new PrintWriter("output.txt");
            Scanner ob = new Scanner(new File("raw_data.txt"));
            while(ob.hasNext()){
                String c =  ob.next();
                for(int i=0;i<c.length();i++){
                    char a = c.charAt(i);
                    if(map.containsKey(a)){
                        int prevCount = map.get(a);
                        map.put(a,prevCount+1);

                    }else {
                        map.put(a,1);
                    }


                }


            }
            for (Map.Entry<Character,Integer> e : map.entrySet())
                fw.println("Key: " + e.getKey() + " Value: " + e.getValue());

            fw.close();
            ob.close();

        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }






    }
}
