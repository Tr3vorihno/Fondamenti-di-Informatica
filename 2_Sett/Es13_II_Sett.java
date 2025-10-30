import java.util.Scanner;

public class Es13_II_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire il numero di righe : ");
		int pag = Integer.parseInt(in.next());
		System.out.println("Inserire quante righe sono presenti in una pagina: ");
		final int pagMax = Integer.parseInt(in.next());

		int pagineTot = pag / pagMax;

		pag %= pagMax;
		System.out.println("Pagine totali: "+pagineTot+" pagine extra: "+pag);
	}
}