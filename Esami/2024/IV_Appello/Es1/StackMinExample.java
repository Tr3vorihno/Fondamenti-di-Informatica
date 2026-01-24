
//Nome:
//Cognome:
//Matricola:
//Postazione:
/*
* classe di collaudo
*/


//import Stack;
//import StackMin;


public class StackMinExample {
    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.push(3);
        stackMin.push(5);
       
        System.out.println("Minimo: " + stackMin.getMin());
        stackMin.push(2);
        stackMin.push(1);
        System.out.println("Minimo: " + stackMin.getMin());
        stackMin.pop();
        System.out.println("Minimo: " + stackMin.getMin());
    }
}