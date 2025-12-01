package Sett_7.Es6_VII_Sett;
import Sett_7.Es6_VII_Sett.Tris;
import java.util.Scanner;
public class Tester{
    public static void main(String args[]){
        Tris t = new Tris();
        Scanner s = new Scanner(System.in);
        
        char p1='+', p2='+';
        boolean partita = false, partitaIsRunning = false, turn = false, checkRightMove = true;
        String giocata ="",again="";
        int vittoria = 0;
        int[] v = new int[2];
        while(!partita){
            if(!partitaIsRunning){
                System.out.println("--- TRIS ---");
                partitaIsRunning = true;
                System.out.println("Inserire simbolo per player 1");
                p1 = s.next().charAt(0);
                System.out.println("Inserire simbolo per player 2");
                p2 = s.next().charAt(0);
                if(p1 == p2){
                    System.out.println("I caratteri devono essere differenti.");
                    partitaIsRunning = false;
                }
            }else{
                Scanner in = new Scanner(System.in);
                pulisciSchermo();
                System.out.println(t.toString());
                if(!turn){// player 1 è false, player 2 è true
                    turn = !turn;
                    System.out.println("Inserire coordinate player 1");
                    v = splitCoordinates(in.nextLine());
                    checkRightMove = t.setCharInPosition(v[0],v[1],p1);
                    vittoria = t.isWinning(p1);
                }else{
                    turn = !turn;
                    System.out.println("Inserire coordinate player 2");
                    v = splitCoordinates(in.nextLine());
                    checkRightMove = t.setCharInPosition(v[0],v[1],p2);
                    vittoria = t.isWinning(p2);
                }
                if(!checkRightMove){
                    System.out.println("Errore nell'inserimento della mossa, ripetere.");
                    turn = !turn;
                }
                if(vittoria == 1 || vittoria == 2){
                    pulisciSchermo();
                    System.out.println(t.toString());
                    t = new Tris();
                    partitaIsRunning = false;
                    if(vittoria == 1){
                        System.out.print("Vince il giocatore ");
                        if(turn) System.out.print("player 1\n");
                        else{System.out.print("player 2\n");}
                    }else{
                        System.out.println("Partita finita in pareggio.");
                    }
                    System.out.println("Si vuole giocare ancora ? (S/N)");
                    again = s.next();
                    if(again.equals("N")) partita = true;
                }
            }
        }
        
    }
    public static int[] splitCoordinates(String h){
        Scanner s = new Scanner(h);
        int[] v= new int[2];
        int i=0;
        while(s.hasNext()){
            v[i] = Integer.parseInt(s.next());
            i++;
        }
        return v;
    }
    public static void pulisciSchermo() {
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println("Errore durante la pulizia dello schermo.");
        e.printStackTrace();
    }
}
}