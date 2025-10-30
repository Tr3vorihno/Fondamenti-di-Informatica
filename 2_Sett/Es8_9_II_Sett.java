import java.awt.Rectangle;

public class Es8_9_II_Sett{
	public static void main(String args[]){
		// es 8 lab
		Rectangle ret = new Rectangle(0,0,5,5);

		System.out.println("Campi dell'oggetto: X: "+ret.getX()+" Y:"+ret.getY()+" Size: "+ret.getSize());

		//ret.add(0,0);

		System.out.println("Campi dell'oggetto: X: "+ret.getX()+" Y:"+ret.getY()+" Size: "+ret.getSize());

		// es 9 lab

		Rectangle ret2 = new Rectangle(10,10,1,1);
		Rectangle ret3 = ret.intersection(ret2);

		System.out.println("Campi dell'oggetto: X: "+ret3.getX()+" Y:"+ret3.getY()+" Size: "+ret3.getSize());

		// nel caso i punti dei due triangoli non appartengano gli uni con gli altri allora mi da una dimensione negativa

		
	}
}