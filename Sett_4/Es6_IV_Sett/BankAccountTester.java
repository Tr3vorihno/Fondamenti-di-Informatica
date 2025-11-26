import java.util.Scanner;

public class BankAccountTester{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int prelievo = 0;
        double saldo = 0,interesse = 0;

        System.out.println("Inserire il quanti soldi ci sono nel conto: ");
        saldo = Double.parseDouble(in.next());
        System.out.println("Inserire il tasso d'interesse: ");
        interesse = Double.parseDouble(in.next());

        BankAccount b1 = new BankAccount(saldo);

        for(int i=0; i<2; i++){
            b1.addInterest(interesse);
        }

        System.out.println("Saldo del conto dopo due anni di accredito di interessi: "+b1.getAmount());

        System.out.println("Inserire quanto si vuole prelevare: ");
        prelievo = Integer.parseInt(in.next());

        b1.withdraw(prelievo);
        System.out.println("Saldo del conto dopo prelievo: "+b1.getAmount());
        
        /*TEST VARI PER PRELIEVI NEGATIVI ECC ECC ECC
        BankAccount b1 = new BankAccount(2000);
        double interesse = 2;
        System.out.println("Numero conto: "+b1.getNumConto());
        System.out.println("Saldo: "+b1.getAmount());
        b1.addInterest(interesse);
        System.out.println("Interesse del "+interesse+" % ; saldo :"+b1.getAmount());
        b1.withdraw(1000);
        System.out.println("Saldo dopo aver prelevato :"+b1.getAmount());

        BankAccount b2 = new BankAccount();
        System.out.println("Numero conto: "+b2.getNumConto());
        System.out.println("Saldo: "+b2.getAmount());
        b1.addInterest(interesse);
        System.out.println("Interesse del "+interesse+" % ; saldo :"+b2.getAmount());
        b2.withdraw(1000);
        System.out.println("Saldo dopo aver prelevato :"+b2.getAmount());
        */
    }
}