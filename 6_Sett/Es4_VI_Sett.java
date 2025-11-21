import java.util.Scanner;

public class Es4_VI_Sett{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        boolean is_substring = false;
        System.out.println("Inserire prima stringa: ");
        String s1 = s.nextLine();
        System.out.println("Inserire seconda stringa: ");
        String s2 = s.nextLine();
        if(checkStrings(s1,s2)){
            System.out.println("Esiste una sottosequenza");
        }else{
            System.out.println("Non esiste una sottosequenza");
        }
    }

    public static boolean checkStrings(String a, String b){// a >>> b
        int k = 0;
        boolean flag = false;
        /**
         * confronto le due stringhe, scorro la piu corta nel ciclo piu esterno, mentre la piu lunga in quello interno
         * se ottengo una corrispondenza mi segno su la variabile k la posizione in cui trovo la corrispondenza 
         * faccio ripartira il ciclo interno dalla posizione k-esima, 
         * il tutto termina o quando k supera la dimensione di a, e quindi non sono riuscito a trovare tutti i caratteri di b in a
         * oppure quando trovo tutti i caratteri e quindi esco per la condizione "i<b.length()"
         * pèr ottimizzare, nel ciclo interno metto la condizione !flag, per uscire dal ciclo interno appena trovo una corrispondenza
         * 
         */
        for(int i = 0 ; i<b.length() && k<a.length() ; i++){
            flag = false;
            for(int j = k; j<a.length() && !flag ; j++){
                if(a.charAt(j) == b.charAt(i)){
                    flag = true;
                    k = j;
                }
            }
            if(!flag) return false;
        }
        return true;
    }
}