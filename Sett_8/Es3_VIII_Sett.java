package Sett_8;
public class Es3_VIII_Sett{
    public static void main(String[] args){
        recSubString("abc");
        System.out.println();
        recSubString2("abc");
    }/*
    if(dim==0) return;
        
        System.out.println(s);
        
        */
    public static void recSubString(String s){
        if(s.length()==0)return; 
        recSubString(s.substring(0,s.length()-1));
        System.out.println(s);
    }
    public static void recSubString2(String s){
        if(s.length()==0)return; 
        
        recSubString(s.substring(1,s.length()));
        System.out.println(s);
        
    }
}