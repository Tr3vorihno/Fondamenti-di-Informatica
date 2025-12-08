package Sett_8;
public class Es4_VIII_Sett{
    public static void main(String args[]){
        recPali("Madam, I'm Adam",0);
       

    }
    public static void recPali(String s, int index){
        if(index>s.length()-index){
            System.out.println("palindromo");
            return;
        }
        char t =Character.toLowerCase(s.charAt(index));
        char p = Character.toLowerCase(s.charAt(s.length()-index-1));
        if(Character.isLetter(t)==true && Character.isLetter(p)==true && (t != p)){
            System.out.println("NOT palindromo");
            return;
        }
        
        index++;
        recPali(s,index);
    }
}