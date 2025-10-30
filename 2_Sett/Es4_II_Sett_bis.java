import java.util.Scanner;

public class DoubleDivider{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Inserire il primo numero reale: \n");

		double n1 = Double.parseDouble(input.nextLine());

		System.out.println("Inserire il secondo numero reale: \n");
		double n2=Double.parseDouble(input.nextLine());
		double n3 = n1/n2;
		System.out.println("Risultato divisione tra reali: "+n3);
	}
}