import java.util.Scanner;

public class Es11_II_Sett{
	public static void main(String args[]){
		// inserire solo numeri interi: 
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci i soldi da convertire: ");
		int money = Integer.parseInt(in.next());

		int mon2eur = 0, mon1eur = 0;

		mon2eur = money/2;
		mon1eur = money%2;
		System.out.println("Servono : "+mon2eur+" monete da 2 euro e : "+mon1eur+" monete da 1 euro");
	}
}