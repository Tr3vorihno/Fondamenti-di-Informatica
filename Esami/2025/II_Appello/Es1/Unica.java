/*
 * Nome, Cognome:
 * Matricola:
 * Postazione:
 *
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Unica {
    /**
     * Metodo per contare gli elementi unici in una coda doppia.
     * Utilizza solo la coda doppia per memorizzare e confrontare i valori.
     */
    public static int countUniqueElements(CD deque) {
        CD tempDeque = new MiaCD(); // Coda temporanea per il confronto
        int uniqueCount = 1;
        
        tempDeque.addFirst(deque.removeLast());
        
        Object obj = null;
       
        while(!deque.isEmpty()){
            obj = deque.removeLast();
            
            if(!findInDeque(tempDeque,obj)){
                tempDeque.addFirst(obj);
                uniqueCount++;
            }
        }
        while(!tempDeque.isEmpty()){
            deque.addFirst(tempDeque.removeLast());
        }
        
        return uniqueCount;
    }
    public static boolean findInDeque(CD deque, Object obj){
        
        Object temp = null;
        CD tempDeque = new MiaCD();
        boolean flag = false;
       
        while(!deque.isEmpty()){
            temp = deque.removeLast();
            tempDeque.addFirst(temp);
            if(temp.equals(obj)) flag = true;
        }
       
        while(!tempDeque.isEmpty()){
            Object t = tempDeque.removeLast();

            deque.addFirst(t);
        }
        return flag;
    }

    public static void main(String[] args) {
        try{
            Scanner io = new Scanner(new FileReader("rock_bands.txt"));
            String temp = "";
            CD deque = new MiaCD();
            while(io.hasNextLine()){
                temp = io.nextLine();
                
                deque.addFirst(temp);
            }
            io.close();
            
            int conta = countUniqueElements(deque);
            System.out.println("Elementi unici nella lista : "+conta);
            while(!deque.isEmpty()){
                System.out.println(deque.removeLast());
            }
        }catch(Exception e){e.printStackTrace();}
        
    }
}
