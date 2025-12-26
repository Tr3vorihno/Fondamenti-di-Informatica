package Sett_10.Es2_X_Sett;
import ADT_Interfacce.Container;
import ADT_Exception.NoSuchElementException;
import ArrayAlgs.ArrayAlgs;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class Text implements Container
{
    /*
        costruisce un contenitore di testo vuoto
    */
    public static void main(String[] args){
        try{
            FileReader f = new FileReader("Sett_10/Es2_X_Sett/alberi.txt");
            Scanner s = new Scanner(f);
            s.useDelimiter("[\\p{javaWhitespace}\\p{Punct}]+");
            Text t = new Text();
            while(s.hasNext()){
                String p = s.next();
                t.add(p);
            }
            s.close();
            f.close();
            t.print();
            t = t.removeDuplicates();
            t.print();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    private Comparable[] txt;
    private int dim;
    public Text(){
        this.dim = 0;
        this.txt = new Comparable[100]; 
    }

    public void makeEmpty(){
        this.dim = 0;
    }
    public boolean isEmpty(){
        if(this.dim>0) return false;
        else{return true;}
    }
    public int size(){
        return this.dim; 
    } 
    public void print(){
        System.out.println(ArrayAlgs.printArray(this.txt,this.dim));
    }
    public void add(Comparable aWord){
        if(this.dim == this.txt.length){
            try{
                this.txt = ArrayAlgs.resize(this.txt,(dim*2));
            }catch(Exception e){}
        }
        this.txt[dim++] = aWord;
    }
    public void sort(){ 
        this.txt = ArrayAlgs.mergeSort(this.txt,this.dim);
    } 
    public String removeLast() throws NoSuchElementException{
        if(this.dim==0) throw new NoSuchElementException();
        else{
            dim--;
            return (String)this.txt[dim];
        }
    } 
    public Text removeDuplicates(){
        sort();
        Text t = new Text();
        for(int i=0; i<this.dim-1; i++){
            if(!this.txt[i].equals(this.txt[i+1]))t.add(this.txt[i]);
        }
        t.add(this.txt[this.dim-1]);
        return t;
    }
}

