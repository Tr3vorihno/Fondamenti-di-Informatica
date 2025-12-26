package Sett_10.Es3_X_Sett;
import ADT_Exception.*;
import ADT_Interfacce.Container;
import ArrayAlgs.ArrayAlgs;
public class SortedContainer implements Container{
    
    private Comparable[] s;
    private int dim;
    public SortedContainer(){ 
        this.dim = 0;
        this.s = new Comparable[100];
    } 

    public void makeEmpty(){
        this.dim = 0;
    }
    public boolean isEmpty(){
        if(dim==0) return true;
        return false;
    }
    public void add(Comparable compObj){ 
        try{
            if(this.dim==this.s.length) this.s = ArrayAlgs.resize(this.s,(this.dim*2));
            this.s[dim++] = compObj;
            this.s = ArrayAlgs.insertionSort(this.s,this.dim);
        }catch(Exception e){
            e.printStackTrace();
        }
    } 

    public Comparable removeMax() throws NoSuchElementException{
        if(this.dim==0) throw new NoSuchElementException();
        this.dim--;
        return this.s[dim];
    } //completare
    public void print(){
        System.out.println(ArrayAlgs.printArray(this.s,this.dim));
    }
}

