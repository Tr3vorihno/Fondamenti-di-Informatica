import java.util.Scanner;
/*
Scrivere un programma che definisca un numero razionale positivo n nell'intervallo [0, 32) 
e ne stampi a standard output la codifica binaria in formato a virgola fissa, usando cinque 
cifre binarie per la parte intera e cinque per quella frazionaria. Esempio: 8.5 in base dieci = 01000.10000 in base due.
Suggerimento: si usino gli algoritmi di conversione da decimale a binario della parte intera e della parte frazionaria presentati a lezione.
*/
public class Conversione_bin{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		// inserimento numero appartenente a Z : 0<x<32
		System.out.println("Inserire il numero razionale : ");
		double n = Double.parseDouble(in.next()); // prendo in input il numero da elaborare
		int pIntera = (int)n; // calcolo la parte intera del numero, facendo un cast
		double mantissa = n - Math.floor(n); // calcolo la mantissa del numero
		
		String ris =""; // inserisco in questa stringa il risultato finale 
		// stampo i valori per verificare che siano coerenti con quello che inserisco
		System.out.println("intero: "+pIntera);
		System.out.println("mantissa: "+mantissa);

		// comincio a trasformare in binario la parte intera:

		int temp = 0;
		int dec =0;

		temp = pIntera%2;
		pIntera /=2;

		int temp2 = pIntera%2;
		pIntera /=2;

		int temp3 = pIntera%2;
		pIntera /=2;

		int temp4 = pIntera%2;
		pIntera /=2;

		int temp5 = pIntera%2;
		pIntera /=2;
		
		ris = ""+temp5+temp4+temp3+temp2+temp+"."; 
		
		// calcolo la parte decimale calcolando in continuo la mantissa 

		mantissa *= 2;
		dec = (int) mantissa;
		mantissa -= Math.floor(mantissa);
		ris += dec;

		mantissa *= 2;
		dec = (int) mantissa;
		mantissa -= Math.floor(mantissa);
		ris += dec;

		mantissa *= 2;
		dec = (int) mantissa;
		mantissa -= Math.floor(mantissa);
		ris += dec;

		mantissa *= 2;
		dec = (int) mantissa;
		mantissa -= Math.floor(mantissa);
		ris += dec;

		mantissa *= 2;
		dec = (int) mantissa;
		mantissa -= Math.floor(mantissa);
		ris += dec;

		System.out.println("Numero convertito:  "+ris);
	}
}