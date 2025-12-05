package Sett_8;
public class Es3_VIII_Sett{
    public static void main(String[] args){
        recSubString("abcdef",6);
    }
    public static void recSubString(String s,int k,){
        
        if(k==0){
            return;
        }else{
            k--;
            recSubString(s.substring(0,k),k);
            System.out.println(s);
        }
        //if(k==)
        k++;
        recSubString(s.substring(k,s.length()),s.length()-k);
    }
}