package Sett_11;
import java.io.FileReader;
import java.util.Scanner;
import ADT_Classi.FixedStack;
public class Es6_XI_Sett{
    public static void main(String agrs[]){
        FixedStack t = new FixedStack();
        FixedStack h = new FixedStack();
        int dim=0;
        try{
            Scanner s = new Scanner(new FileReader("Sett_11/bimbi.txt"));
            while(s.hasNext()){
                t.push(s.next());
                dim++;
            }
            s.close();
            t = riavvolgi(t);
        }catch(Exception e){e.printStackTrace();}
        //while(!t.isEmpty())h.push(t.pop());

        int num_parole = 17;
        Object obj = null;
        while(!t.isEmpty() || !h.isEmpty()){
            for(int i=0; i < num_parole; i++){
                //System.out.print(i+" ");
                if(t.isEmpty()){
                    t = riavvolgi(h);
                    i--;
                    //System.out.println("\n---- CAMBIO------\n");
                }else{
                    obj = t.pop();
                    if(i!=num_parole-1)
                    h.push(obj);
                }
            }
            System.out.println("Ris: "+obj);
        }
         System.out.println("Fine");
    }
    public static FixedStack riavvolgi(FixedStack t){ // copio t in h
        FixedStack h = new FixedStack();
        while(!t.isEmpty()){
            Object k = t.pop();
            //System.out.println(k);
            h.push(k);
        }
        return h;
    }
}