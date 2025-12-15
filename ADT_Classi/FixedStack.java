package ADT_Classi;

import ADT_Interfacce.Stack;
import ADT_Exception.*;;

public class FixedStack implements Stack{
    private Object[] v;
    private int vSize; 
    private static int vMax = 100;

    public static void main(String[] agrs){
        FixedStack s = new FixedStack();
        s.push("ciao");
        String h = (String) s.pop();
        System.out.println(h);
        
    }
    public FixedStack(){
        v = new Object[vMax];
        this.makeEmpty();
    }
    public void makeEmpty(){
        vSize = 0;
    }
    public boolean isEmpty(){
        if(vSize == 0) return true;
        else{return false;}
    }
    public void push(Object n){
        if(this.vSize == this.vMax) throw  new FullStackException();
        this.v[this.vSize] = n;
        this.vSize++;
    }
    public Object pop(){
        if(this.isEmpty()) throw new EmptyStackException();
        this.vSize--;
        return this.v[vSize];
    }
    public Object top(){
        if(this.isEmpty()) throw new EmptyStackException();
        return this.v[this.vSize];
    }
    public int getVSize(){
        return this.vSize;
    }
    public int getVMax(){
        return this.vMax;
    }
    public void setVSize(int n){
        this.vSize = n;
    }
    public void setVMax(int n){
        this.vMax = n;
    }
    public void setV(Object[] v){
        this.v = v;
    }
    public Object[] getV(){
        return this.v;
    }
}

