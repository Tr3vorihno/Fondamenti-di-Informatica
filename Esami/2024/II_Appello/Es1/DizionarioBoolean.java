
//Nome:
//Cognome:
//Matricola:
//Postazione:


public class DizionarioBoolean {
	public final static int INITIAL_LENGTH = 4; 
	private Pair[] a;
	private int vSize;
	
	public DizionarioBoolean() {
		a = new Pair[INITIAL_LENGTH];
		vSize = 0;
	}
	
	public boolean isEmpty() { return vSize==0; }
	public void makeEmpty() { vSize=0; }
	
	public void insert(boolean[] ingresso, boolean output)
	// non serve fare il remove, sappiamo che non ci saranno chiavi uguali e tentativi di inserire doppioni
	{
		Pair p = new Pair(ingresso,output);
		a[vSize] = p;
		vSize++;
	}
	
	public String toString()
	{
		String ris = "";
		for(int i=0; i<vSize; i++){
			ris += a[i].toString()+"\n";
		}
		return ris;
	}
	
	
	public Pair[] toArray()
	{
		Pair[] na = new Pair[vSize];
		System.arraycopy(a, 0, na, 0, vSize);
		return na;
	}
	
	class Pair
	{//classe interna
		  //parte privata
		  private boolean[] ingresso;
		  private boolean risultato;
		  // parte pubblica
		  public Pair(boolean[] combinazione, boolean o)
		  {
			ingresso = new boolean[2];
			ingresso[0] = combinazione[0];
			ingresso[1] = combinazione[1];
			risultato = o;
		  }
		  public boolean[] getCombination() { return ingresso; }
		  public boolean getResult() { return risultato; }
		  public String toString() { return "["+ingresso[0]+" : "+ingresso[1]+"] --> ["+risultato+"]"; }
		  
	}
	
}