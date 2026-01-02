package Sett_10.Es6_X_Sett;
import ADT_Classi.FixedStack;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Stacktester{
    public static void main(String args[]){
        FixedStack f = new FixedStack();
        try{
            Scanner s = new Scanner(new FileReader("Sett_10/Es6_X_Sett/dante.txt"));
            while(s.hasNext()){
                f.push((Comparable)s.next());
            }
            s.close();
            PrintWriter p = new PrintWriter(new FileWriter("Sett_10/Es6_X_Sett/output.txt"));
            while(!f.isEmpty()){
                p.println(f.pop());
            }
            p.close();
        }catch(Exception e){e.printStackTrace();}
        
    }
}