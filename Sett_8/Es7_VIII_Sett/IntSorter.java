package Sett_8.Es7_VIII_Sett;
import ArrayAlgs.ArrayAlgs;
import java.io.FileWriter;
import java.io.PrintWriter;
public class IntSorter{
    public static void main(String args[]){
        
        Comparable v[] = new Comparable[10];
        SortedArray s = new SortedArray(0,v,10);
        int max = 10, min = 1;
        for(int i=0; i<10; i++){
            int k =((int)(Math.random()*(max-min)+min));
            
            s.add(k);
        }
        System.out.println(ArrayAlgs.printArray(v,10));

        System.out.println("Media: "+s.avg());
        int pos = s.search(4);
        if(pos==-1){
            System.out.println("Numero non presente");
        }else{
            System.out.println("Numero presente in : "+pos);
        }
        try{
            FileWriter f = new FileWriter(args[0]);
            PrintWriter p = new PrintWriter(f);
            int i = 9;
            while(i >= 0){  
                p.println(s.getNum(i));
                i--;
            }
            p.close();
            f.close();
        }catch(Exception e){}
        
    }
}