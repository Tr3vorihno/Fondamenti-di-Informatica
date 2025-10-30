import java.util.Scanner;

public class Es14_II_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire il numero di minuti da convertire: ");

		int minuti = Integer.parseInt(in.next());
		int ore = minuti / 60; // trovo le ore risultanti
		int giorni = ore / 24;// trovo le giorni risultanti
		minuti %= 60; // trovo i minutin residui
		ore %= 24;// trovo le ore residue
		System.out.println("Giorni: "+giorni+ " Ore: "+ore+ " Minuti : "+minuti);

	}
}