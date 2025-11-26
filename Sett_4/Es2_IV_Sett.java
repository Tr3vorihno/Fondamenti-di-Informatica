import java.util.Scanner;

public class Es2_IV_Sett{
    public static void main(String args[]){
        final double EPSILON = 0.01;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci due reali: ");
        double n1 = Double.parseDouble(in.nextLine());
        double n2 = Double.parseDouble(in.nextLine());

        if(Math.abs(n1-n2)<EPSILON){
            System.out.println("Numeri approssimativamente uguali.");
        }else{
            System.out.println("Numeri non approssimativamente uguali.");
        }
    }
}