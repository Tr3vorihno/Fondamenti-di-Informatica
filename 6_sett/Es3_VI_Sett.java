import java.util.Scanner;

public class Es3_VI_Sett{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean is_substring = false;
        System.out.println("Inserire prima stringa: ");
        String s1 = s.nextLine();
        System.out.println("Inserire seconda stringa: ");
        String s2 = s.nextLine();
        if(checkStrings(s1,s2)){
            System.out.println("Esiste una sottostringa");
        }else{
            System.out.println("Non esiste una sottostringa");
        }

    }

    public static boolean checkStrings(String a, String b){// a.length >>> b.length
    /*
        vado a valutare le sottostringhe tramite charAt, confronto i primi b.length() caratteri con tutta la stringa b
        se non trovo corrispondenze, controllo i carattere di a da una posizione in più per b.length caratteri
        appena trovo b.length caratteri uguali restituisco true: esiste quindi sottostringa
        esempio: a = abcde ; b = bc
        confronto  a con b esco
        confronto b con b
        confronto c con c
        restituisco true

     */
        for(int i = 0 ; (i<a.length()-b.length()); i++){ 
            boolean k = true;
            for(int j=0; j<b.length() && k ; j++){
                if(a.charAt(i+j) != b.charAt(j)) k = false;
            }
            if(k) return true;
        }
        return false;
    }
}