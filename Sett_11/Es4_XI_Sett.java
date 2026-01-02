package Sett_11;
import ADT_Classi.FixedStack;

public class Es4_XI_Sett{
    public static void main(String args[]){
        FixedStack f = new FixedStack();
        f.push(1);
        f.push(1);
        f.push(1);
        f.push(2);
        f.push(2);
        f.push(3);
        f.push(3);
        f.push(3);
        f.push(4);
        f.push(5);
        removeDuplicates(f);
        while(!f.isEmpty()){
            System.out.println(f.pop());
        }
    }
    public static void removeDuplicates(FixedStack f){
        FixedStack t = new FixedStack();
        while(!f.isEmpty()){
            Object obj = f.pop();
            if(!stackSearch(f,obj)) t.push(obj);
        }
        while(!t.isEmpty()){
            f.push(t.pop());
        }
    }
    public static boolean stackSearch(FixedStack t,Object obj){
        boolean ans = false;
        FixedStack u = new FixedStack();
        while(!t.isEmpty()){
            Object you = t.pop();
            if(you.equals(obj)) ans = true;
            u.push(you);
        }
        while(!u.isEmpty()){
            t.push(u.pop());
        }
        return ans;
    }

}
