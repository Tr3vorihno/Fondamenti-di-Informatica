/*
Scrivere un programma che

    definisce due orari nel formato "24 ore", ciascuno di quattro cifre (ad esempio, 0900 oppure 1730)
    visualizza sull'output standard il numero di ore e di minuti (separatamente) che intercorrono fra i due orari

secondo il seguente esempio:
   primo orario: 0900
   secondo orario: 1730
  Tempo trascorso: 8 ore e 30 minuti

Modificare poi il programma in modo che funzioni correttamente anche se il secondo orario è inferiore al primo (per intervalli di tempo che comprendono la mezzanotte):
   primo orario: 1730
   secondo orario: 0900
  Tempo trascorso: 15 ore e 30 minuti
*/
import java.util.Scanner;
public class Es7_II_Sett{
   public static void main(String args[]){
      final int MIN_IN_A_DAY = 1440; // minuti presenti in un giorno
      Scanner in = new Scanner(System.in);
      String n1 = "",n2 = "";
      System.out.println("Inserisci primo orario da elaborare: ");
      n1 = in.next();
      System.out.println("Inserisci secondo orario da elaborare: ");
      n2 = in.next();

      // trasformo gli orari in minuti

      int ore1 = Integer.parseInt(n1.substring(0,2));
      ore1 *= 60; // trovo il corrispettivo delle ore in minuti
      ore1 += Integer.parseInt(n1.substring(2,4)); // sommo i minuti "rimanenti"
      int test = MIN_IN_A_DAY-ore1; // trovo le ore rimanenti alla fine della giornata, che andro' a sommare con gli altri minuti

      int ore2 = Integer.parseInt(n2.substring(0,2));
      ore2 *= 60; // trovo il corrispettivo delle ore in minuti
      ore2 += Integer.parseInt(n2.substring(2,4)); // sommo i minuti "rimanenti"

      int ore3 = test + ore2; 
      ore3 %= MIN_IN_A_DAY; // per evitare "overflow" quindi avere distanze tra ore di piu' di 24 ore
      int oreFinal = ore3/60; // riconverto i minuti in ore
      int minutiFinal = ore3%60;
      System.out.println("I due orari distano : "+oreFinal+" ore , "+minutiFinal+" minuti");
   }
}