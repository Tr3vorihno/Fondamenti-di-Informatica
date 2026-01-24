/*
 * 
 * =============================================================================
 *
 * Separazione numeri pari e dispari in un array di interi
 *
 * Realizzare il metodo:
 * public static int[] separaPariDispari(int[] array)
 *
 * Il metodo deve restituire un nuovo array che contiene prima tutti i valori
 * pari e poi tutti i valori dispari dell’array in ingresso, mantenendo lo
 * stesso ordine con cui i valori pari e i valori dispari sono disposti nell'array originale.
 * Il metodo dovra' restituire un nuovo array dal nome: risultato
 */

public class Pari_e_dispari {
    public static void main(String[] args) {
        System.out.println("Separa numeri pari e dispari in un array int[]");
        prova(new int[] { 9, 5, 42, 8, 42 });
        prova(new int[] { 3, 42, 7, 9, 42, 8, 5 });
    }

    private static void prova(int[] array) {
        String strArray = toString(array);
        int[] risultato = separaPariDispari(array);
        String strArrayRis = toString(risultato);

        System.out.println(strArray + "  --->  " + strArrayRis);
    }

    public static int[] separaPariDispari(int[] array) {
        int[] pari = new int[array.length], dispari = new int[array.length], ris = new int[array.length];
        int pDim = 0, dDim = 0;

        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                pari[pDim++] = array[i];
            }else{
                dispari[dDim++] = array[i];
            }
        }
        System.arraycopy(pari,0,ris,0,pDim);
        System.arraycopy(dispari,0,ris,pDim,dDim);
        return ris;
    }

public static String toString(int[] array) {
        if (array == null) {
            return "null";
        } else {
            StringBuffer buf = new StringBuffer("{");

            for (int i = 0; i < array.length; i++) {
                buf.append(i == 0 ? " " : ", ").append(array[i]);
            }

            return buf.append(" }").toString();
        }
    }

}
