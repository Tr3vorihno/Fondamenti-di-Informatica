package Sett_10.Es3_X_Sett;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class SortedContainerTester{
    private static final String f_in = "Sett_10/Es3_X_Sett/studenti.txt";
    private static final String f_out = "Sett_10/Es3_X_Sett/output.txt";
    public static void main(String args[]){
        SortedContainer srtC = new SortedContainer();
        try{
            FileReader r = new FileReader(f_in);
            Scanner s = new Scanner(r);
            
            while(s.hasNextLine()){
                String temp = s.nextLine();
                Scanner s2 = new Scanner(temp);
                s2.useDelimiter(":");
                srtC.add((Comparable)(new Student(s2.next(),Integer.parseInt(s2.next()))));
                s2.close();
            }
            s.close();
            r.close();
            srtC.print();


            PrintWriter p = new PrintWriter(new FileWriter(f_out));
            while(!srtC.isEmpty()){
                Comparable u = srtC.removeMax();
                System.out.println(u);
                p.println(u);
            }
            p.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}