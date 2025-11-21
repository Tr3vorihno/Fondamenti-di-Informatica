import java.util.Scanner;

public class Es3_V_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean dentro = false;
        int ins = 0;
        while(!dentro){
            System.out.println("Inserire il numero : ");
            ins = Integer.parseInt(in.nextLine());
            if(ins>0)dentro = true;
        }
        
        for(int j = 1; j<=ins ; j++){
            if(isPrimo(j))System.out.println(j);
        }
        
        
    }
    public static boolean isPrimo(int num){
        int lim = ((int)Math.round(Math.sqrt(num)));
        boolean prime = true;
        for(int i = 2; i<lim+1; i++){
            if(num%i==0)prime = false;
        }
        return prime;
    }
}