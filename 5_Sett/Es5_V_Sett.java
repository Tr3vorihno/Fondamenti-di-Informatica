import java.util.Scanner;

public class Es5_V_Sett{
    public static void main(String agrs[]){
        Scanner in = new Scanner(System.in);
        boolean dentro = false;
        int n = 0;
        while(!dentro){
            System.out.println("Inserire il numero : ");
            n = Integer.parseInt(in.nextLine());
            if(n>0){
                dentro = true;
                
            }
        }
        String ris = "";
        for(int i=2; i<=n; i++){
            if(n%i==0){
                ris += ""+i;
                n /= i;
                i = 1; 
                if(i!=n) ris +=" * ";
            }
        }
        System.out.println("Scomposizione: "+ris);
        
    }
}