import java.util.Scanner;

public class PrimeNumberTester{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero da fattorizzare :");
        int num = scanner.nextInt();
        FactorGenerator f = new FactorGenerator(num);

        
    }
}