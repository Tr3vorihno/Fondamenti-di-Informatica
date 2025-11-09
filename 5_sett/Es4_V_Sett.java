import java.util.Scanner;

public class Es4_V_Sett{
    public static void main(String agrs[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire stringa: ");
        String s = in.nextLine();
        if(isPalindroma(s)){
            System.out.println("Stringa palindroma");
        }else{
            System.out.println("Stringa non palindroma");
        }
    }
    public static boolean isPalindroma(String s){
        boolean controllo = true;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) controllo = false;
            //System.out.println(s.charAt(i)+" "+s.charAt(s.length()-i));
        }
        return controllo;
    }
}