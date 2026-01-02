package ADT_Classi;
import ADT_Exception.*;
import ADT_Interfacce.Queue;
public class FixedQueue implements Queue{
    
    private int vSize;
    private Object v[];
    private int vMax=100;
    private int fine;
    private int ini;

    public FixedQueue(){
        this.v = new Object[vMax];
        makeEmpty();
    } 
    public void makeEmpty(){
        ini = fine = 0;
    }
    public boolean isEmpty(){
        if(ini==fine) return true;
        return false;
    }
    public void enqueue(Object o){
        if(increment(fine)==ini){
            v = resize(2*v.length);
            if(fine<ini){
                System.arraycopy(v,0,v,(v.length/2),fine);
                fine += (v.length/2);
            }
        }
        v[fine] =(Comparable) o;
        fine = increment(fine);
    }
    
    public Object dequeue(){
        Object obj = getFront();
        ini = increment(ini);
        return obj;
    }
    public Object getFront(){
        if(!isEmpty()) return v[ini];
        else{throw new EmptyQueueException();}
    }
    public int increment(int index){
        return ((index+1)%vMax);
    }
    public Object[] resize(int dim){
        Object k[] = new Object[dim];
        if (dim <v.length) throw new IllegalArgumentException();
        System.arraycopy(v,0,k,0,v.length);
        return k;
    }
    public int getVsize(){
        return this.vSize;
    }
}