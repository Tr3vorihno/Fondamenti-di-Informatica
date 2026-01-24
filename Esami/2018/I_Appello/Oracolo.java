 /**
    Fondamenti di Informatica 1
    Prova pratica di programmazione
    
    Classe Oracolo.
    
    @author S. Canazza
    @version 2018

-----------------------------------------------------
*****************************************************
--- NOME:
--- COGNOME:
--- MATRICOLA: 
--- POSTAZIONE: 
*****************************************************
-----------------------------------------------------

*/
import java.util.Scanner;
import java.util.Random;
import java.io.FileReader;
import java.util.NoSuchElementException;

public class Oracolo extends D
{
  public static final String[] RISPOSTA = { "Naturalmente.",
                                            "Forse.",
                                            "Ne dubito.",
                                            "Assolutamente no.",
                                            "Certamente.",
                                            "Puoi scommetterci.",
                                            "Probabilmente no.",
                                            "Poco ma sicuro."
                                          };
  private static final String STRINGA_VUOTA = "";
  private D diz = new D();
  public Oracolo() {
    try{
      Scanner s = new Scanner(new FileReader("popolamento_oracolo.txt"));
      while(s.hasNextLine()){
        //System.out.println(debug);
        Scanner h = new Scanner(s.nextLine());
        h.useDelimiter("_");
        diz.insert(h.next(),Integer.parseInt(h.next()));
        h.close();
      }
      s.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public String rispondi(String domanda){
    int r = (int)(8*Math.random());
    try{
      r = (int)(diz.find(domanda));
    }catch(Exception e){
      //e.printStackTrace();
    }
    return RISPOSTA[r];
  }
  public static void main(String[] args) {
    Oracolo o = new Oracolo();
    String temp = null;
    Scanner s = new Scanner(System.in);
    boolean fine = false;
    while(!fine){
      temp = s.nextLine();
      if(temp.equals(STRINGA_VUOTA)){
        fine = true;
      }else{
        System.out.println("Domanda: "+temp);
        System.out.println("Risposta: "+o.rispondi(temp)); 
      }
    }
  }
  
}
