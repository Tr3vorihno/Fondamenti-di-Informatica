import java.util.Scanner;

public class Es8_III_Sett{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci gradi :");
		double gradi = Math.toRadians((Double.parseDouble(in.next()))%360);
		gradi = (double) gradi / Math.PI;
		System.out.print("Angolo = ");
		System.out.printf("%.3f",gradi);
		System.out.println("*π rad");

		System.out.print("sin(");
		System.out.printf("%.3f",gradi);
		System.out.print("*π) = ");
		System.out.printf("%.3f",Math.sin(gradi));
		System.out.println("");

		System.out.print("cos(");
		System.out.printf("%.3f",gradi);
		System.out.print("*π) = ");
		System.out.printf("%.3f",Math.cos(gradi));
		System.out.println("");

		System.out.print("tan(");
		System.out.printf("%.3f",gradi);
		System.out.print("*π) = ");
		System.out.printf("%.3f",Math.tan(gradi));
		System.out.println("");

		in.close();
	}
}