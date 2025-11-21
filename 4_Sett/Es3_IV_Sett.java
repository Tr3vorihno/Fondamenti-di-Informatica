import java.util.Scanner;

public class Es3_IV_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire anno: ");
        int annoBis = Integer.parseInt(in.next());

        

        if(annoBis%4==0){
            if(annoBis%100==0 &&  annoBis%400!=0){
                 System.out.println("Non bisestile!");
            }else{
                System.out.println("Bisestile!");
            }
        }

    }
}