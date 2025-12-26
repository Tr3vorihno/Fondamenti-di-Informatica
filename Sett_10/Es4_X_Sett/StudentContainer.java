package Sett_10.Es4_X_Sett;
import ArrayAlgs.ArrayAlgs;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class StudentContainer extends SortedContainer{
    public StudentContainer(){ 
      super();
    }
    public StudentContainer(String filename) throws IOException{
      super();
        try{
            FileReader r = new FileReader(filename);
            Scanner s = new Scanner(r);
            
            while(s.hasNextLine()){
                String temp = s.nextLine();
                Scanner s2 = new Scanner(temp);
                s2.useDelimiter(":");
                this.add((Comparable)(new Student(s2.next(),Integer.parseInt(s2.next()))));
                s2.close();
            }
            s.close();
            r.close();
            //srtC.print();
            /*PrintWriter p = new PrintWriter(new FileWriter(f_out));
            while(!srtC.isEmpty()){
                Comparable u = srtC.removeMax();
                System.out.println(u);
                p.println(u);
            }
            p.close();*/
        }catch(Exception e){
            e.printStackTrace();
        }
    } 

    /*
        Inserisce il nuovo oggetto compObj di tipo Student nel contenitore. 
        Questo metodo sovrascrive il metodo omonimo di SortedContainer. Se  
        l'oggetto compObj non e` di tipo Student il metodo deve lanciare
        IllegalArgumentException. Per il resto il comportamento del metodo e` 
        identico a quello del metodo omonimo di SortedContainer
    */
    public void add(Comparable compObj){
      if(!(compObj instanceof Student)) throw new IllegalArgumentException();
      super.add(compObj);
    } //completare

    public void add(String n, int m){
      this.add((Comparable)(new Student(n,m)));
    } //completare

    /*
        ATTENZIONE: i metodi pubblici isEmpty(), makeEmpty(), removeMax() 
        sono ereditati dalla superclasse SortedContainer
    */
}

