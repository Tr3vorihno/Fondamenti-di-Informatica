package Sett_11;
import ADT_Classi.FixedQueue;
import ADT_Classi.DynamicStack;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Es1_XI_Sett{
    public static void main(String args[]){
        DynamicStack s = new DynamicStack();
        FixedQueue q = new FixedQueue();
        try{
            Scanner in = new Scanner(new FileReader("Sett_11/dante.txt"));

            while(in.hasNext()){
                String temp = in.next();
                s.push(temp);
                q.enqueue(temp);
            }
            System.out.println("Stack: ");
            while(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
            System.out.println("\nQueue: ");
            while(!q.isEmpty()){
                System.out.print(q.dequeue()+" ");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}