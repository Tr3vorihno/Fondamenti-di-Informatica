// inserisco commenti javadoc, per soddisfare anche la cosegna "b"
/**
 * @author Enrico Cervi
 * @version 1.0
 * codice che dato un numero n in binario, ne calcola la cifratura secondo un semplice algoritmo di crittografia
 * e successivamente lo decifra
 */
import java.util.Scanner;

/**
 * @param in oggetto per leggere da tastiera 
 * @param num1 num binario preso da tastiera
 * @param chiave chiave di cifratura
 * @param bin_da_stampare variabile per stampare una stringa
 * 
 */

public class CifraturaBin{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci numero in binario: ");

        int num1 = Integer.parseInt(in.nextLine(),2); // prendo e converto il numero

        System.out.println("Inserire chiave di cifratura: ");

        int chiave = Integer.parseInt(in.nextLine()); // inserisco la chiave di cifratura in decimale

        int num_cifrato = cifrare(num1,chiave); // assegno a num_cifrato il numero cifrato

        String bin_da_stampare = Integer.toBinaryString(num_cifrato); // trasformo il numero decimale in binario e poi in stringa per stamparla

        System.out.println("numero cifrato: "+bin_da_stampare);

        num_cifrato = decifrare(num_cifrato,chiave);// decifro il numero

        bin_da_stampare = Integer.toBinaryString(num_cifrato);
        System.out.println("numero decifrato: "+bin_da_stampare);// stampo il numero decifrato in binario

    }
    
    /**
     * @param num numero preso da input
     * @param chiave chiave di cifratura
     * @return numero cifrato
     */
    public static int cifrare(int num, int chiave){
        num *= 2;
        num += chiave;
        num ^= chiave; 
        return num;
    }
/**
     * @param num numero da decifrare
     * @param chiave chiave di decifratura
     * @return numero decifrato
     */
    public static int decifrare(int num, int chiave){
        num ^= chiave; 
        num -= chiave;
        num /= 2;
        return num;
    }
}