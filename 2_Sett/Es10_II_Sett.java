import java.util.Scanner;

public class Es10_II_Sett{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero di secondi da covertire in ore: ");
		int numSec = Integer.parseInt(in.next());

		int ore=0,minuti=0,secondi=0;

		minuti = numSec/60;
		secondi = numSec%60;

		ore = minuti/60;
		minuti %= 60;

		System.out.println("Ore: "+ore+" Minuti: "+minuti+" Secondi: "+secondi);
	}	
}