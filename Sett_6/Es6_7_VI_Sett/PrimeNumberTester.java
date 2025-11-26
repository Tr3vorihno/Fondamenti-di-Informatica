import java.util.Scanner;

public class PrimeNumberTester{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero (isPrimo):");
        int num = scanner.nextInt();
        if(num == 1){
            System.out.println("Numero primo");
        }else{
            FactorGenerator f = new FactorGenerator(num);
            if(f.nextFactor()==num) System.out.println("Numero primo");
            else{
                System.out.println("Numero non primo");
            }
        }
    }
}