import java.util.Scanner;

public class FactorGeneratorTester{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero da fattorizzare :");
        int num = scanner.nextInt();
        FactorGenerator f = new FactorGenerator(num);
        while(f.hasNextFactor()){
            System.out.print(""+f.nextFactor());
            f.setNum((f.getNum()/f.nextFactor()));
            if(f.hasNextFactor())  System.out.print(" * ");
        }
        System.out.println();
    }
}