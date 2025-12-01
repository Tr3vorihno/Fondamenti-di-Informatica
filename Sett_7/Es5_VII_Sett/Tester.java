package Sett_7.Es5_VII_Sett;
import Sett_7.Es5_VII_Sett.TextContainer;
import ArrayAlgs.ArrayAlgs;
public class Tester{
    public static void main(String args[]){
        String[] n = new String[5];
        n[0] ="1------\nDaddy's home cross the 34 Ocean.\nLeaving just a memory77.\nThe snapshot in the Family album.\nDaddy what else did you leave for me?\nDamn It! What did you leave behind for me?\nAll in all it was just 239a brick in the wall.\nAll in all it was all just bricks in the waLL11.\n";
        n[1] ="2------\nWe don't need no education.\nWe don't need no thought control.\nNo dark sarcasm in the 3.2classroom.\nTeacher leave the kids alone.\nHey, teacher leave the <$ kids alone!\nAll in all it's just another **** brick in the wall.\nAll in all you're just another brick in the wall \n\n!&%$\n";
        n[2] ="3------\nWe don't need no education.\nWe don't need no thought control.\nNo dark sarcasm in the classroom.\nTeachers leave those kids alone.\n";
        n[3] ="4------\nHey, Teacher leave those kids alone!\nAll in all you're just another brick in the wall.\nAll in all you're just another brick in the wall.\n\n";
        n[4] ="5------\n%I don't need no arms around me33.\n%And I don't need no drugs to calm me.\n%I have seen the writing On !! the wall.\n%Don't think I'll need anything at all.\n%No, don't think I'll need anything at all.\n%All in all it was just bricks in the WALL.\n%All in all it was just bricks in the Wall.\n===============================================\n";


        TextContainer t = new TextContainer(n,5,10), t1 = t.splitWords(0), t2=t.onlyLetters(),t3 = t.toLowerCase(),t4 =t2.splitWords(0);

        //System.out.println(t1.toString()); // divide le parole
        //System.out.println(t2.toString()); // toglie i non caratteri --> testo originale
        //System.out.println(t3.toString()); // to lower case

        //System.out.println("Numero di parole contenute nel testo 1: "+t.count(0));
        //System.out.println("Testo 1: Prima parola lessicografica : "+t.min(0)+" Ultima parola lessicografica : "+t.max(0));
        //int v[] = new int[t4.getDim()];
        String v2[] = t2.maxFrequency(0,5);
        
        System.out.println("Le parole maggiormente presenti nel testo 1 sono: ");
        for(int i=0; i<5; i++){
            System.out.print(""+v2[i]+" ");
        }
        System.out.println();

            
    }
}