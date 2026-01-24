import java.util.NoSuchElementException;
public class D implements Dictionary{

    private int size;
    private Pair[] ar = new Pair[100];

    public D(){
        makeEmpty();
    }

    public void insert(Comparable key, Object attribute){
        Pair n = new Pair(key,attribute);
        this.ar[this.size] = n;
        this.size++;
    }
	
	/** Restituisce l'attributo associato alla chiave key nel dizionario. 
	* Se la chiave non e' presente, genera l'eccezione java.util.NoSuchElementException
	*/
	public Object find(Comparable key){
        for(int i=0; i<this.size; i++){
            if(ar[i].getKey().equals(key)){
                return ar[i].getAttribute();
            }
        }
        throw new NoSuchElementException();
    }
	/** Elimina la coppia (key, attribute) dal dizionario 
	* e restituisce l'attributo associato alla chiave se questa e' presente.
	* Se la chiave non e' presente genera l'eccezione java.util.NoSuchElementException 
    */
	public Object remove(Comparable key){
        Pair temp = null; 
        for(int i=0; i<this.size; i++){
            if(ar[i].getKey().equals(key)){
                temp = ar[this.size-1];
                ar[i] = temp;
                this.size--;
            }
        }
        throw new NoSuchElementException();
    }
    public boolean isEmpty(){
        return (this.size==0);
    }
	
	/** Rende vuoto il contenitore. */
	public void makeEmpty(){
        this.size=0;
    }
	
	/** Restituisce il numero di elementi inseriti nel contenitore. */
	public int size(){
        return this.size;
    }
    class Pair{
        private Comparable key;
        private Object attribute;
        public Pair(Comparable key, Object attribute){
            this.key = key;
            this.attribute = attribute;
        }
        public Comparable getKey(){
            return this.key;
        }
        public Object getAttribute(){
            return this.attribute;
        }
    }
}