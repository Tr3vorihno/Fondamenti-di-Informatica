/*
 * 
 * =============================================================================
 *
 * quadrato di un numero intero
 *
 * Realizzare il metodo:
 * public static n quadrato(int n)
 *
 * Dato un quadrato di lato n (intero positivo), calcolarne l’area A(n) ricorsivamente. È vietato l'utilizzo di cicli (for, whlie, ecc.)
 *
 * Nome:
 * Cognome:
 * Matricola:
 * Postazione:
 */

import java.util.Scanner;

public class AreaQuadratoRic {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire il lato (numero intero)");
        int n = in.nextInt();
        System.out.println("Il quadrato di " + n + " è " + quadrato(n));
        
    }        
        
    public static int quadrato(int n)
    { 
        if(n==1) return 1;
        return ((n*2)-1) + quadrato(n-1);
    }
}