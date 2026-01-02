package Sett_10.Es7_X_Sett;
import ADT_Classi.FixedStack;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
public class SortStack{
    public static void main(String agrs[]){
        FixedStack p = new FixedStack();
        int i = 0;
        while(i<10){
            p.push(i);
            i++;
            
        }
        //while(!p.isEmpty()){
          //  System.out.print(p.pop()+ " ");
        //}
        sortStack(p,10);
        //System.out.println("fine prim");
        while(!p.isEmpty()){
            System.out.print(p.pop()+ " ");
        }
        //System.out.println("sec prim");
    }
    public static Comparable findMinStack(FixedStack f){
        Comparable min = null;
        FixedStack t = new FixedStack();
        try{
            min = (Comparable)f.top();
            //System.out.println(min);
            while(!f.isEmpty()){
                t.push(f.pop());
                Comparable temp =(Comparable) t.top();
                //System.out.println("min "+min+" temp: "+temp);
                if(min.compareTo(temp)>0) min = temp;
            }   
            
        }catch(Exception e){}
        
        
        while(!t.isEmpty()){
            f.push(t.pop());
        }
        //System.out.println("f: "+f.getVSize());
        return min;
    }
    public static void sortStack(FixedStack f,int dim){
        FixedStack p = new FixedStack(), sort = new FixedStack();
        //System.out.println("f: "+f.getVSize()+" p: "+p.getVSize()+" sort: "+sort.getVSize());
        while(dim>0){
            Comparable min = findMinStack(f);
            //System.out.println("f: "+f.getVSize()+" p: "+p.getVSize()+" sort: "+sort.getVSize());
            while(!f.isEmpty()){
                //System.out.println("min "+min+" temp: "+temp);
                if(f.top().equals(min)) sort.push(f.pop());
                else{
                    p.push(f.pop());
                }
            }
            while(!p.isEmpty()){
                f.push(p.pop());
            }
            dim--;
        }
        while(!sort.isEmpty()){
            //System.out.println("deh");
            f.push(sort.pop());
        }
        //System.out.println("f: "+f.getVSize()+" p: "+p.getVSize()+" sort: "+sort.getVSize());
    }
}   