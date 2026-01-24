/*
* @autore 
* @data
* @matricola
* @postazione
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	MiaCR mia = new MiaCR();
	
	//while (in.hasNextLine()) {
		//String riga = in.nextLine();
		mia.enqueue("C");
		mia.enqueue("I");
		mia.enqueue("A");
		mia.enqueue("O");
	//}
	
	
	mia.reverse();
	
	/*MiaCR mia2 = new MiaCR();
	
	
	while (!mia.isEmpty()) {
		mia2.enqueue(mia.dequeue());
	}
	
	//mia2.reverse();
	
	*/
	try {
			while (!mia.isEmpty()) {
			out.println(mia.dequeue() + " "); }
		}
	catch (QueueEmptyException e) { out.println("UFFA"); }
			
		
		
	} // chiude main
	
}// chiude classe pubblica
