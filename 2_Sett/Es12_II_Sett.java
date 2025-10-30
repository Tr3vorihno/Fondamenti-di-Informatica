import java.util.Scanner;
public class ConvertiGioToSett{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire i giorni da convertine in settimane e giorni");

		int giorni = Integer.parseInt(in.next());

		int settimane = giorni / 7;
		giorni %= 7;

		System.out.println("Settimane : "+settimane+ " Giorni: "+giorni)
;	}
}