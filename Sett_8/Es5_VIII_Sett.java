package Sett_8;
import ArrayAlgs.*;
import java.util.Scanner;
public class Es5_VIII_Sett{
    public static void main(String args[]){
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        int ini = 0,fine = 0, dim = 0;
        String g = "",l = "";
        while(!flag){
            System.out.println("Inserisci intervallo inizio, fine (q per uscire)");
            g = in.next();
            if(g.equals("q")){
                flag = true;
            }else{
                ini = Integer.parseInt(g);
                fine = Integer.parseInt(in.next());
                System.out.println("Inserisci dimensione");
                dim = Integer.parseInt(in.next());
                Comparable[] v = ArrayAlgs.randomIntArray(dim,ini,fine);
                System.out.println(ArrayAlgs.printArray(v,dim));
                System.out.println("Inserisci algoritmo di sort (S selection, I insertion, M merge)");
                l = in.next();
                switch(l){
                    case "S":{
                        v = ArrayAlgs.selectionSort(v,dim);
                        break;
                    }
                    case "I":{
                        v = ArrayAlgs.insertionSort(v,dim);
                        break;
                    }
                    case "M":{
                        v = ArrayAlgs.mergeSort(v,dim);
                        break;
                    }
                    default:{
                        break;
                    }
                }
                System.out.println(ArrayAlgs.printArray(v,dim));
                System.out.println("Inserisci elemento da cercare: ");
                fine = Integer.parseInt(in.next());
                System.out.println("Inserisci algoritmo di ricerca (L linear, B binary)");
                l = in.next();
                int pos = 0;
                switch(l){
                    case "L":{
                        pos = ArrayAlgs.linearSearch(v,dim,fine);
                        break;
                    }
                    case "B":{

                        pos = ArrayAlgs.binarySearch(v,0,dim,fine);
                        break;
                    }
                    default:{
                        break;
                    }
                }
                System.out.println("Elemento in posizione: "+pos);
            }
            
        }
    }
}