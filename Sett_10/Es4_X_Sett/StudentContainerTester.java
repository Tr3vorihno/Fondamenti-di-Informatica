package Sett_10.Es4_X_Sett;
import ArrayAlgs.ArrayAlgs;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class StudentContainerTester{
    private static final String f_in = "Sett_10/Es4_X_Sett/studenti.txt";
    private static final String f_out = "Sett_10/Es4_X_Sett/output.txt";
    public static void main(String args[]){
        try{
            StudentContainer s = new StudentContainer(f_in);
            PrintWriter p = new PrintWriter(new FileWriter(f_out));
                while(!s.isEmpty()){
                    Comparable u = s.removeMax();
                    System.out.println(u);
                    p.println(u);
                }
            p.close();
        }catch(Exception e){e.printStackTrace();}
        
    }
}