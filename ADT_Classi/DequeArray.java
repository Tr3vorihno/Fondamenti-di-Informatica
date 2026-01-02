package ADT_Classi;
import ADT_Interfacce.Deque;
import ADT_Exception.*;
public class DequeArray implements Deque{
    private int front,back, fine, ini;
    Object v[];
    private int size;
    public DequeArray(){
        v = new Object[100];
        makeEmpty();
    }
    public void makeEmpty(){
        back = size = front = 0;
    }
    public boolean isEmpty(){
        if(size==0) return true;
        return false;
    }

    public int increment(int index){
        return ((index+1)%v.length);
    }
    public int decrement (int index){
        if(index==0) return v.length-1;
        else{return index-1;}
    }


    public void addFirst(Object obj){
        if(size==v.length){
            resize(v.length*2);
        }
        front = decrement(front);
        v[front] = obj;
        
        size++;
    }
    public void addLast(Object obj){
        if(size==v.length){
            resize(v.length*2);
        }
        v[back] = obj;
        back = increment(back);
        size++;
    }
    
    
    /* Rimuove l'oggetto che si trova all'inizio e lo restituisce. 
        Lancia EmptyDequeException se la coda doppia e` vuota */
    public Object removeFirst(){
        if(isEmpty()) throw new EmptyDequeException();
        Object t = v[front];
        front = increment(front);
        size--;
        return t;
    }

    /* Rimuove l'oggetto che si trova alla fine e lo restituisce. 
        Lancia EmptyDequeException se la coda doppia e` vuota */
    public Object removeLast(){
        if(size()==0) throw new EmptyDequeException();
        back = decrement(back);
        Object t = v[back];
        size--;
        return t;
    }

    public void resize(int dim){
        Object f[] = new Object[dim];
        
        if(back<front){
            System.arraycopy(v,front,f,0,v.length-front);
            System.arraycopy(v,0,f,v.length-front,back);
        }else{
            System.arraycopy(v, front, f, 0, size);
        }
        
        back = size();
        front = 0;
        v = f;
    }

    /* Ispeziona l'oggetto che si trova all'inizio e lo restituisce, ma non
        lo rimuove. 
        Lancia EmptyDequeException se la coda doppia e` vuota */
    public Object getFirst(){
        if(size()==0) throw new EmptyDequeException();
        Object t = v[front];
        return t;
    }

    /* Rimuove l'oggetto che si trova alla fine e lo restituisce, ma non
        lo rimuove.  
        Lancia EmptyDequeException se la coda doppia e` vuota */
    public Object getLast(){
        if(size()==0) throw new EmptyDequeException();
        Object t = v[decrement(back)];
        return t;
    }

    /* Restituisce la dimensione della coda doppia, ovvero il numero di  
        oggetti contenuti nella coda doppia */
    public int size(){
        return size;
    }
}   