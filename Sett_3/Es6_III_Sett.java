import java.util.Scanner;

public class Es6_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il raggio del cerchio: ");
		Double rag = Double.parseDouble(in.next());

		double perimetro = (double)(rag * 2 * Math.PI),area = (double)(rag*rag*Math.PI);
		System.out.println("Area cerchio : "+area+" Perimetro cerchio: "+perimetro);
	}
}