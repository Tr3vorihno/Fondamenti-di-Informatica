import java.util.Scanner;

public class ContaCifre {

    // Metodo ricorsivo per contare le cifre di un numero positivo
    public static int countDigits(int n) {
        if(n==0) return 0;
        n /= 10; 
        return 1 + countDigits(n);
    }

    // Metodo tester per interagire con l'utente
    public static void testCountDigits() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci un numero positivo: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Errore: Il numero deve essere positivo.");
            } else {
                int digitCount = countDigits(number);
                System.out.println("Il numero di cifre in " + number + " è: " + digitCount);
            }
        } catch (Exception e) {
            System.out.println("Errore: Inserire un numero intero valido.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        // Chiama il metodo tester
        testCountDigits();
    }
}
