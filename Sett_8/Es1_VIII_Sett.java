package Sett_8;
public class Es1_VIII_Sett{
    public static void main(String args[]){
        int m = Integer.parseInt(args[0]), n = Integer.parseInt(args[1]);
        System.out.println(mcd(m,n));

    }
    public static int mcd(int m, int n){
        int k =0;
        if(m%n==0) return n;
        else{
            return mcd(n,m%n);
        }
    }
}