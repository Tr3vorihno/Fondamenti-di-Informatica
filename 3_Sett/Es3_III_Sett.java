import java.util.Scanner;

public class Es3_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire la stringa separata da (;)");

		String parole = in.nextLine();
		int num = 0; // siccome non posso utilizzare gli array, utilizzo una variabile che mi tiene conto di quante cvolte trovo il carattere separatore
		String n1="",n2="",n3=""; // dichiaro le stringhe in cui memorizzo le sottostringhe che devo estrarre
		for(int i=0,j=0; i<parole.length(); i++){ // ciclo for, che dichiara i, come variabile di ciclo normale, e j che mi tiene conto delle posizioni in cui trovo il carattere separatore
			if(parole.charAt(i)==';' || i==parole.length()-1){// se trovo il carattere separatore oppure, arrivo a fine stringa, allora procedo ad estrarla
				switch(num){// switch su cui suddivido le varie casistiche 
				case 0:{
					n1 = parole.substring(j,i);
					j=i+1; 
					break;
				}
				case 1:{
					n2 = parole.substring(j,i);
					j=i+1; 
					break;
				}
				case 2:{
					n3 = parole.substring(j,i+1); 
					break;
				}
				default:{
					break;
				}
				}
				num++;
			}
		}

		System.out.println(n3+"\n"+n2+"\n"+n1); // stampo al contrario le stringhe concatenandole
	}
}