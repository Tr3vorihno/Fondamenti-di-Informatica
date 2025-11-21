import java.util.Scanner;

public class Es2_V_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire i due numeri su cui effetturare MCD: ");
        int n1=Integer.parseInt(in.nextLine()),n2=Integer.parseInt(in.nextLine());

        if(n1<n2){
            int temp = n2;
            n2 = n1; 
            n1 = temp;
        }
        System.out.print("L'MCD di "+n1+" e "+n2+" e' : ");
        while(n1%n2!=0){
            int resto = n1%n2;
            n1 = n2;
            n2 = resto;
        }
        System.out.print(n2+"\n");
    }
}