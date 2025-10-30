import java.util.Scanner;
/*
Scrivere un programma che

    definisce un numero intero positivo avente al massimo cinque cifre
    visualizza sull'output standard le singole cifre del numero, separandole con uno spazio

Ad esempio, il numero 14356 verrà visualizzato come 1 4 3 5 6. Il numero 367 verrà visualizzato come 0 0 3 6 7. 

Suggerimento: applicare la definizione di notazione posizionale in base 10, studiare le proprietà della divisione intera in Java e del relativo operatore %. Verificare 
il corretto funzionamento del programma in casi diversi (in particolare, con numeri aventi meno di cinque cifre) e verificare il comportamento del programma in caso di valori di ingresso non ammessi

   1. numeri con più di cinque cifre 
   2. numeri negativi
   3. numeri in virgola mobile
   4. valore di ingresso non numerico (ad esempio: Ciao)

	
*/
public class Rap_Numeri{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci numero: ");
		// INSERIMENTO DEL NUMERO DA ANALIZZARE: 
		int n = Integer.parseInt(input.next());
		int f = 10000;
		System.out.print(n/f+" ");
		n = n % f;
		f /= 10;
		System.out.print(n/f+" ");
		n = n % f;
		f /= 10;
		System.out.print(n/f+" ");
		n = n % f;
		f /= 10;
		System.out.print(n/f+" ");
		n = n % f;
		f /= 10;
		System.out.print(n/f+" \n");
		
	}
}