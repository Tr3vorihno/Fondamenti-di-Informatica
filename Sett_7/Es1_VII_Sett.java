package Sett_7;

import ArrayAlgs.ArrayAlgs;
import java.util.Scanner;


public class Es1_VII_Sett{
    public static void main(String args[]){
        int DIM = 10;
        int[] n = ArrayAlgs.randomIntArray(DIM,0,DIM);
        //System.out.println(ArrayAlgs.printArray(n,DIM));
        boolean flag = false;
        Scanner  r = new Scanner(System.in);
        do{
            System.out.println("Inserisci preferenza : (Q,P,m,M,R,I)");
            String ast = r.next();
            switch(ast){
                case "Q":{
                    System.out.println("Arrivederci.");
                    flag = true;
                    break;
                }
                case "P":{
                    System.out.println(ArrayAlgs.printArray(n,DIM));
                    break;
                }
                case "m":{
                    int min = ArrayAlgs.findMin(n,DIM);
                    System.out.println("Min : "+min);
                    break;
                }
                case "M":{
                    int max = ArrayAlgs.findMax(n,DIM);
                     System.out.println("Max : "+max);
                    break;
                }
                case "R":{
                    if(r.hasNext()){
                        int index = Integer.parseInt(r.next());
                        DIM--;
                        ArrayAlgs.removeSorted(n,DIM,index);
                    }
                    break;
                }
                
                case "I":{
                    if(r.hasNext()){
                        int index = Integer.parseInt(r.next());
                        if(r.hasNext()){
                            int value = Integer.parseInt(r.next());
                            ArrayAlgs.insert(n,DIM,index,value);
                            DIM++;
                        }
                    }
                    break;
                }

            }

        }while(!flag);
    }
}