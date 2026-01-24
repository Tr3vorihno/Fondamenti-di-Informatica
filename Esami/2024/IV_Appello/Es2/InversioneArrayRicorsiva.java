/*
 * Cognome:
 * Nome:
 * Numero Postazione:
 * Numero Matricola:
 *
 *
 * =============================================================================
 * Inversione di un Array con Ricorsione
 * Descrizione: Scrivere il metodo Java invertiRicorsivo che inverta l'ordine degli elementi in un array di interi usando la ricorsione. 
 * È vietato l'utilizzo di cicli (for, whlie, ecc.)
 */

public class InversioneArrayRicorsiva {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        invertiRicorsivo(numeri, 0, numeri.length - 1);
        System.out.print("Array invertito: ");
        for (int numero : numeri) {
            System.out.print(numero + " ");
        }
    }

    public static void invertiRicorsivo(int[] array, int start, int end) {
        int temp = 0;
        if(start==end+1){
            return;
        }else{
            temp = array[start];
            invertiRicorsivo(array,start+1,end);
            array[end-start] = temp;
        }
    }
}
