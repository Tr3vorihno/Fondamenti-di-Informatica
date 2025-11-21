import java.util.Scanner;

public class Es9_IV_Sett{

    enum Emozioni{
        FELICE,
        TRISTE,
        ARRABBIATO,
        SORPRESO,
        ANNOIATO
    }
    public  static String emoToEmoji(Emozioni emozione){
        String n="";
        switch(emozione){
            case Emozioni.FELICE:{
                n="😃";
                break;
            }
            case Emozioni.TRISTE:{
                n="😢";
                break;
            }
            case Emozioni.ARRABBIATO:{
                n="😠";
                break;
            }
            case Emozioni.SORPRESO:{
                n="😲";
                break;
            }
            case Emozioni.ANNOIATO:{
                n="🥱";
                break;
            }
            default:{
                break;
            }
        }
        return n;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire l'emozione: ");
        Emozioni n;
        try{
            n = Emozioni.valueOf(in.nextLine());
            System.out.println(emoToEmoji(n));
        }catch(Exception e){};
    }
}