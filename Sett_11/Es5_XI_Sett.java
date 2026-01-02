package Sett_11;
import ADT_Classi.FixedStack;
public class Es5_XI_Sett{
    public static void main(String args[]){
        FixedStack f = new FixedStack();
        String h = "[[[[[[{1[2(3)}]]";
        char o = ' ';
        boolean j = false;
        for(int i=0; i<h.length(); i++){
            switch(h.charAt(i)){
                case '{':{
                    f.push(h.charAt(i));
                    break;
                }
                case '[':{
                    f.push(h.charAt(i));
                    break;
                }
                case '(':{
                    f.push(h.charAt(i));
                    break;
                }
                
                case '}':{
                    if(!f.isEmpty()){
                        o =(char) f.pop();
                        if(o!='{') j = true;
                        break;
                    }else{
                        j = true;
                    }
                }
                case ']':{
                    if(!f.isEmpty()){
                        o =(char) f.pop();
                        if(o!='[') j = true;
                        break;
                    }else{
                        j = true;
                    }
                }
                case ')':{
                    if(!f.isEmpty()){
                        o =(char) f.pop();
                        if(o!='(') j = true;
                        break;
                    }else{
                        j = true;
                    }
                }
            }
        }
        if(!j) System.out.println("Apposto");
        else{System.out.println("No Apposto");}
    }
}