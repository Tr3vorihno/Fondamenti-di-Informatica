import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException; 
import java.io.FileWriter;

public class Es2{
    public static void main(String[] args){
        
        
        try{
            FileWriter deh = new FileWriter("vispa_teresa2.txt");
            PrintWriter f = new PrintWriter(deh);
            FileReader r = new FileReader("vispa_teresa.txt");
            Scanner in = new Scanner(r);
            in.useDelimiter("\\s|\'");
            
            while(in.hasNextLine()){
                String b = in.nextLine();
                String h = stringElab(b);
                f.println(h);
            }
            
            in.close();
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String stringElab(String s){
        Scanner r = new Scanner(s);
        String tot = "";
        while(r.hasNext()){
            String p = r.next();
            if(p.length()>0){
                String s2 = p.substring(0,1).toUpperCase();
                String s3 = p.substring(1,p.length()).toLowerCase();
                tot += s2 + s3 + " ";
            }
        }
        

        // parte seconda
        Scanner q = new Scanner(tot);
        q.useDelimiter("'");
        String deh = "";
        while(q.hasNext()){
            String p = q.next();
            if(p.length()>0){
                String s2 = p.substring(0,1).toUpperCase();
                String s3 = p.substring(1,p.length());
                deh += s2 + s3 + "'";
            }
        }
        deh = deh.substring(0,deh.length()-1);
        return deh;
    }
}