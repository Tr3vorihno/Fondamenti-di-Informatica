import java.util.Scanner;

public class Es4_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire i numeri: ");
		double n1=Double.parseDouble(in.next()),n2= Double.parseDouble(in.next()),n3 = Double.parseDouble(in.next());

		double tot =(double) Math.round(n1+n2+n3);
		System.out.println("Summa : "+tot);

	}
}