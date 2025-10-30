import java.util.Scanner;

public class Es2_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire la stringa con i caratteri separatore ( ; )");

		String parole = in.nextLine();
		parole = parole.replaceAll(";","\n");
		System.out.println("");
		System.out.println(parole);
		
	}
}