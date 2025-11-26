import java.util.Scanner;
import java.util.Locale;

public class Es5_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//in.useLocale(Locale.ITALY); 
		

		System.out.println("Inserire i numeri: ");
		double n1=Double.parseDouble(in.next()),n2=Double.parseDouble(in.next()),n3=Double.parseDouble(in.next());
		// versione uno prende i floating point con carattere divisore il "."

		// nel mio sistema, di default è presente il punto quindi non modifico
		System.out.println("Numeri inseriti : ");
		System.out.printf(Locale.ITALY,"%.2f",n1);
		System.out.print(" ");
		System.out.printf(Locale.ITALY,"%.2f",n2);
		System.out.print(" ");
		System.out.printf(Locale.ITALY,"%.2f",n3);


	}
}