package Sett_8;
public class Es2_VIII_Sett{
    public static void main(String args[]){
        int n1=Integer.parseInt(args[0]);

        System.out.println(recFibonacci(n1));
        System.out.println(iterativeFib(n1));
    }

    public static int recFibonacci(int n){
        if(n==1) return 1;
        if(n==2) return 1;
        return recFibonacci(n-1) + recFibonacci(n-2);
    }
    public static int iterativeFib(int n){
        int[] v = {1,1};
        int i=2;
        while(i<n){
            int temp = v[0]+v[1];
            v[0] = v[1];
            v[1] = temp;
            i++;
        }
        return v[1];
    }
}