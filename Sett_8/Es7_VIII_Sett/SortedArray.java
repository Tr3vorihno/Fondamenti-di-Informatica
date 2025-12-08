package Sett_8.Es7_VIII_Sett;
import ArrayAlgs.ArrayAlgs;
public class SortedArray{

    private int dim;
    private Comparable v[];
    private int max;
    public SortedArray(int dim, Comparable v[],int max){ // completare 
        this.dim = dim;
        this.v = v;
        this.max = max;
    }
    /*
        verifica se l'array e` vuoto. Prestazioni O(1)
    */
    public boolean isEmpty(){ // completare 
        if(v[0]==null) return true;
        else{return false;}
    }
    public Comparable getNum(int pos){
        return this.v[pos];
    }
    /*
        Aggiunge il valore value all'array ordinato, conservando l'ordinamento.
        Prestazioni O( n) (prima dell'inserimento l'array e' ordinato!)
    */
    public void add(Comparable l){ // completare 
        System.out.println(l+" dim: "+this.dim);
        if(dim == 0) this.v[0] = l;
        if(dim == 1 && this.v[0].compareTo(l)<=0) ArrayAlgs.insert(this.v,this.dim,1,l);
        else{if(dim==1)ArrayAlgs.insert(this.v,this.dim,0,l);}
        int i;
        for(i=0; i<this.dim; i++){
            
            if(this.v[i].compareTo(l)>0 ){
                ArrayAlgs.insert(this.v,this.dim,i,l);
                
                System.out.println(ArrayAlgs.printArray(v,dim));
                break;
            } 
        }
        if(v[i] == null) v[i] = l;
        this.dim++;
    }

    /*
        Cancella il valore massimo dall'array, e lo restituisce.
        Prestazioni O(1). Lancia NoSuchElementException se l'array e' vuoto
    */
    public Comparable removeMax() throws Exception{ // completare 
        if(isEmpty()) throw new Exception();
        this.dim--;
        return this.v[dim+1];
    }

    /*
        Restituisce la media (average) dei valori dell'array
        Prestazioni O( n)
    */
    public double avg(){ // completare
        int n = 0;
        for(int i=0; i<this.dim; i++){
            n += (int)v[i];
        }
        return ((double)n/dim);
    }

    /*
        Cerca un numero value nell'array ordinato (ricerca binaria).
        Prestazioni O(log n). Restituisce l'indice nell'array dell'intero 
        value se questo viene trovato, altrimenti restituisce il valore -1
    */
    public int search(Comparable value){ // completare 
        return (ArrayAlgs.binarySearch(this.v,0,this.dim,value));
    }

}
