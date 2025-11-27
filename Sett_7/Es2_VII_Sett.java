package Sett_7;
import ArrayAlgs.ArrayAlgs;
import java.util.Scanner;
public class Es2_VII_Sett{
    public static void main(String args[]){
        int dim = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        dim = Integer.parseInt(r.next());
        boolean[] pri = new boolean[dim];
        for(int i=1; i<dim; i++){
            if(!ArrayAlgs.isPrime(i)) pri[i] = true;
            else{System.out.print(i+" ");}
        }
        System.out.println();
    }
}