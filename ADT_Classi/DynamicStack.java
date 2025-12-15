
package ADT_Classi;
import ADT_Interfacce.Stack;
import ADT_Exception.*;
public class DynamicStack extends FixedStack {
    public void push(Object n){
        if(super.getVSize()==super.getVMax()){
            super.setV(resize());
            super.setVMax(super.getVMax()*2);
        } 
        super.push(n);
    }
    public Object[] resize(){
        Object t[] = new Object[this.getVMax()*2];
        System.arraycopy(super.getV(),0,t,0,t.length);
        return t;
    }
    public static void main(String[] agrs){
        DynamicStack s = new DynamicStack();
        s.push("ciao");
        s.push("sono");
        s.push("enrico");
        s.push("cervi");
        s.push("gay");
        while(!s.isEmpty()){
            String h = (String) s.pop();
            System.out.println(h);
        }
        
    }
}