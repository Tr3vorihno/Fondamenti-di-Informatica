//package Sett_7.Es4_VII_Sett;
import java.util.Scanner;
//import Sett_7.Es4_VII_Sett.Studente;
public class StudentManager{

    public static final int DIM = 10;
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        Studente s[] = new Studente[DIM];
        boolean flag = false;
        int conta = 0;
        while(!flag){
            System.out.println("Inserisci i dati dello studente in un rigo :");
            String stud = r.nextLine();
            if(stud.equals("")) flag = true;
            else{
                Scanner p = new Scanner(stud);
                while(p.hasNext()){
                    String nome = p.next();
                    int scritto = Integer.parseInt(p.next());
                    int orale = Integer.parseInt(p.next());
                    s[conta++] = new Studente(nome,scritto,orale);
                }
            }
        }
        flag = false;
        while(!flag){
            System.out.println("Inserire Q o S");
            String azione = r.nextLine();
            switch(azione){
                case "Q":{
                    System.out.println("Arrivederci");
                    flag = true;
                    break;
                }
                case "S":{
                    System.out.println("Inserire un cognome di uno studente");
                    String cognome = r.nextLine();
                    int pos = findCognome(cognome,s,conta);
                    if(pos>-1){
                        double media = ((double)(s[pos].getOrale()+s[pos].getScritto())/2);
                        System.out.println("Media finale di : "+cognome+" e': "+media);
                    }else{
                        System.out.println("Cognome sbagliato");
                    }
                    break;
                }
                default:{
                    System.out.println("Errore");
                }
            }
        }

    }
    public static int findCognome(String cognome, Studente[] n, int dim){
        for(int i=0; i<dim ; i++){
            if(cognome.equals(n[i].getNome())) return i;
        }
        return -1;
    }
}