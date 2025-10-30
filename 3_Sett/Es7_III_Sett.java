import java.util.Scanner;

public class Es7_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserisci numeri: ");
		double cat1 = Double.parseDouble(in.next()),cat2 = Double.parseDouble(in.next());

		double hyp = Math.sqrt((double)(Math.pow(cat1,2)+Math.pow(cat2,2)));

		double per = (double)(hyp + cat1 + cat2),area = (double)((cat1*cat2)/2);

		// formule trigonometriche 

		double sinB =(double) cat1/hyp, ang1 = Math.round(Math.toDegrees((double)Math.asin(sinB)));

		double ang2 =Math.round((double) (90-ang1));

		System.out.print("Ipotenusa : ");
		System.out.printf("%.2f",hyp);
		System.out.print(" cm\n");
		System.out.print("Perimetro : ");
		System.out.printf("%.2f",per);
		System.out.print(" cm\n");
		System.out.print("Area : ");
		System.out.printf("%.2f",area);
		System.out.print(" cm^2\n");

		System.out.print("Angolo1 : ");
		System.out.printf("%.2f",ang1);
		System.out.print(" cm°\n");

		System.out.print("Angolo2 : ");
		System.out.printf("%.2f",ang2);
		System.out.print(" cm°\n");

		in.close();
	}
}