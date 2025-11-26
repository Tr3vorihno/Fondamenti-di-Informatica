import java.util.Scanner;

/*
	 Che cosa succede se il divisore è zero?
	 Se il divisore è zero, viene lanciata una eccezzione del tipo arithmetic exception
*/
public class Es4_II_Sett{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire primo numero da dividere: \n");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Inserire secondo numero da dividere: \n");
		int n2 = Integer.parseInt(input.nextLine());
		int n3 = n1/n2;
		int resto = n1%n2;
		System.out.println("IL risultato della divisione e' :"+n3+" , mentre il resto e' : "+resto);
	}
}