package Sett_7;
import java.util.Scanner;

public class TextContainer
{
    public static void main(){
        String n = "p p p p ciao";
       
        while(hasNextSubstring(n,"p")){
             n=subStringRemover(n,"p");
            System.out.println(n);
        }
    }
    
    private int dim;
    private String[] txt;
    /*
    costruttore di un contenitore di testo vuoto
    */
    public TextContainer(String[] txt,int dim){
        this.dim = dim;
        this.txt = new String[this.dim];
        for(int i=0; i<dim; i++){
            this.txt[i] = txt[i];
        }
    }
    public boolean isEmpty(){  
        if(this.txt[0]==null) return true;
        return false;
    }
    public void add(String stringa){
        if(stringa != null){
            //if((this.dim)==(this.txt.length())){
                //expandVector();
            //}
            this.txt[dim] = stringa;
            this.dim++;
        }
    }
    private void expandVector(){
        String[] n = new String[this.dim*2];
        System.arraycopy(this.txt,0,n,0,this.dim);
        setTxt(n);
        this.dim *= 2;
    }
    private void setTxt(String[] p){
        this.txt = p;
    }
    public int count(){  //completare   
        return this.dim;
    }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori di default di Scanner, ovvero
     "\p{JavaWhitespace" (si veda la documentazione di Scanner, in particolare
     dei metodi delimiter e useDelimiter, e la documentazione della classe
     Pattern)
    */
    public TextContainer splitWords(int p){  //passo il numero di testo da spezzare
        if(p>=0){
            int i = 0;
            Scanner r = new Scanner(this.txt[p]);
            int le = 1000;
            String[] par = new String[le]; 
            while(r.hasNext()){
                String ris = r.next();
                par[i++] = ris;
            }
            return new TextContainer(par,i); 
        }else{
            return null;
        }
    }

    /*
     separa le stringhe del testo in parole. Crea un nuovo oggetto di classe
     TextContainer in cui tutte le parole sono separate, e ne restituisce il
     riferimento. Usa l'insieme di delimitatori specificato dalla stringa delim
     (si veda la documentazione di Scanner, in particolare dei metodi delimiter
     e useDelimiter, e la documentazione della classe Pattern)
    */
    public TextContainer splitWords(String delim,int p){  //completare   
        if(p>=0){
            int i = 0;
            Scanner r = new Scanner(this.txt[p]);
            r.useDelimiter(delim);
            int le = 1000;
            String[] par = new String[le]; 
            while(r.hasNext()){
                String ris = r.next();
                par[i++] = ris;
            }
            return new TextContainer(par,i); 
        }else{
            return null;
        }
    }

    /*
     Crea un nuovo oggetto di di tipo TextContainer in cui tutte le occorrenze
     della stringa "stringa" sono state eliminate.
     - Se la stringa compare piu` volte vengono eliminate tutte le occorrenze.
     - Lancia IllegalArgumentException se il parametro esplicito e` null.
     Attenzione: si devono scandire tutte le stringhe del testo perche`
     la parola da cancellare puo` comparire piu` volte nel testo.
    */
    public TextContainer remove(String stringa,int p){  //completare   
        if(stringa == null) thrown new IllegalArgumentException();
        while(hasNextSubstring(this.txt[p],stringa){
            this.txt[p]=subStringRemover(n,"p");
        }
    }
    public static String subStringRemover(String s, String sub){
        boolean flag = false;
        for(int i = 0; i< s.length()-sub.length()+1 && !flag; i++){
            String app = s.substring(i,i+sub.length());
            if(app.equals(sub)){
                s ="" + s.substring(0,i)+s.substring(i+sub.length(),s.length());
                flag = true;
            }
        }
        return s;
    }
    public static boolean hasNextSubstring(String s, String sub){
        for(int i = 0; i< s.length()-sub.length()+1; i++){
            String app = s.substring(i,i+sub.length());
            if(app.equals(sub)){
                return true;
            }
        }
        return false;
    }
    /*
      Restituisce il numero di occorrenze nel testo della stringa "stringa".
      Lancia IllegalArgumentException se il parametro esplicito e` null.
    */
    public int frequency(String stringa){  //completare   }

    /*
      restituisce la stringa che compare piu` volte nel testo (frequenza massima).
      Se piu` stringhe hanno frequenza massima, ne restituisce una qualsiasi.
      Se il testo e` vuoto restituisce null.
    */
        return 0;
    }
    public String maxFrequency(){  //completare   
        return null;
    }

    /*
      restituisce la prima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String min(){  //completare   
            return null;

    }

    /*
      restituisce l'ultima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String max(){  //completare   
            return null;

    }

    /*
      trasforma il testo in stringa. Viene inserito un carattere di nuova riga (\n)
      fra le stringhe. Se il testo e` vuoto restituisce la stringa vuota "".
    */
    public String toString(){  //completare
            return null;
   
    }

    /*
      crea un nuovo oggetto di tipo TextContainer in cui tutti i caratteri non
      alfabetici sono stati eliminati dalle stringhe del testo. Ad esempo elimina
      la punteggiatura, i numeri, le parentesi. Usa il metodo
      java.lang.Character.isLetter(char c)
    */
    public TextContainer onlyLetters(){  
                return null;
//completare   
    }

    /*
     crea un nuovo oggetto di tipo TextContainer nel quale tutti i caratteri
     maiuscoli sono stati convertiti in minuscoli.
    */
    public TextContainer toLowerCase(){ 
                return null;
 //completare   
    }

    /*
     crea una copia dell'oggetto TextContainer, e ne restituisce il riferimento
    */
    public TextContainer copy(){ 
                return null;
 //completare   
    }

}

