import java.util.Scanner;

public class Es10_III_Sett{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Inserire l'aggettivo: ");
		String aggettivo = in.next();


		// prendo la stringa presa da input, trasformo il primo carattere e lo porto da minuscolo a maiuscolo nel caso già non lo fosse
		String str_changed=""+aggettivo.charAt(0);
		str_changed = str_changed.toUpperCase();
		str_changed += aggettivo.substring(1,aggettivo.length()); 


		// stampo la stringa con la maiuscola
		System.out.println("Primo carattere maiuscolo: "+str_changed);

		String diminutivo ="",superlativo="";

		// faccio uno switch, che differenzia il caso maschile dal femminile
		switch(str_changed.charAt(str_changed.length()-1)){
			case 'a':{
				// metto in 'diminutivo' la stringa elaborata ed estraggo la parte "costante"
				diminutivo = str_changed.substring(0,str_changed.length()-1);
				superlativo = diminutivo;

				// aggiungo il suffisso superlativo femminile e diminutivo femminile
				superlativo+="issima";
				diminutivo+="ina";
				break;
			}
			// commento solo caso femminile, maschile idem
			case 'o':{
				diminutivo = str_changed.substring(0,str_changed.length()-1);
				superlativo = diminutivo;
				superlativo+="issimo";
				diminutivo+="ino";
				break;
			}
			default:{
				break;
			}
		}
		// stampo 
		System.out.println("Stringa diminutiva: "+diminutivo);
		System.out.println("String superlativa: "+superlativo);
		in.close();
		
	}
}