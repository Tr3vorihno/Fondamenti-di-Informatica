package Sett_7.Es5_VII_Sett;
import java.util.Scanner;
import ArrayAlgs.ArrayAlgs;
public class TextContainer
{
    private int dim;
    private int limit;
    private String[] txt;
    /*
    costruttore di un contenitore di testo vuoto
    */
    public TextContainer(String[] txt,int dim,int limit){
        this.dim = dim;
        this.txt = new String[limit];
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
            //if((this.dim)==(this.dim)){
                //expandVector();
            //}
            this.txt[dim] = stringa;
            this.dim++;
        }
    }
    private void expandVector(){
        String[] n = new String[this.limit*2];
        System.arraycopy(this.txt,0,n,0,this.dim);
        setTxt(n);
        this.limit *= 2;
    }
    private void setTxt(String[] p){
        this.txt = p;
    }
    public int count(int p){  //completare   
        Scanner r = new Scanner(this.txt[p]);
        int i = 0;
        for(i=0; i<this.txt[p].length() && r.hasNext(); i++){
            String l = r.next();
        }
        return i;
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
            int le = 10000;
            String[] par = new String[le]; 
            while(r.hasNext()){
                String ris = r.next();
                par[i++] = ris;
            }
            return new TextContainer(par,i,i); 
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
            return new TextContainer(par,i,this.limit); 
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
    public void remove(String stringa,int p){  //completare   
        if(stringa == null) throw new IllegalArgumentException();
        while(hasNextSubstring(this.txt[p],stringa)){
            this.txt[p]=subStringRemover(this.txt[p],stringa);
        }
    }
    private String subStringRemover(String s, String sub){
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
    public int frequency(String stringa, int p){  //completare   
        int count = 0;
        for(int i=0; i<this.txt[p].length()-stringa.length(); i++){
            if(this.txt[p].substring(i,stringa.length()+i).equals(stringa)){
                count++;
            }
        }
        return count;
    }

    /*
      restituisce la stringa che compare piu` volte nel testo (frequenza massima).
      Se piu` stringhe hanno frequenza massima, ne restituisce una qualsiasi.
      Se il testo e` vuoto restituisce null.
    */
    
    public String[] maxFrequency(int p, int qua){ 
        if(this.isEmpty())return null;
        TextContainer t4 = this.splitWords(p);
        int v[] = new int[t4.getDim()];
        String v2[] = new String[qua];
        for(int i=0; i<t4.getDim(); i++){
            v[i] = this.frequency(t4.getTxt(i),p);
        } 
        for(int i=0; i<qua; i++){
            int op = ArrayAlgs.findMaxPos(v,0,t4.getDim());
            ArrayAlgs.removeSorted(v,t4.getDim(),op);
            v2[i] = t4.getTxt(op);
        }
        return v2;
    }
    public static int maxInt(int v[]){
        int max = v[0];
        int pos = 0;
        for(int i=1; i<v.length; i++){
            if(max<v[i]){
                max = v[i];
                pos = i;
            }
        }
        return pos;
    }

    /*
      restituisce la prima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String min(int p){
        if(isEmpty()) return null;
        TextContainer t1 = this.splitWords(p);
        String min = t1.getTxt(0);

        for(int i=1; i<t1.dim; i++){
            if(min.compareTo(t1.getTxt(i))>1){
                min = t1.getTxt(i);
            }
        }
        return min;
    }

    /*
      restituisce l'ultima stringa del testo in ordine lessicografico.
      Se il testo e` vuoto restituisce null.
    */
    public String max(int p){  //completare   
        if(isEmpty()) return null;
        TextContainer t1 = this.splitWords(p);
        String max = t1.getTxt(0);

        for(int i=1; i<t1.dim; i++){
            if(max.compareTo(t1.getTxt(i))<1){
                max = t1.getTxt(i);
            }
        }
        return max;
    }
    public String getTxt(int p){
        return this.txt[p];
    }

    /*
      trasforma il testo in stringa. Viene inserito un carattere di nuova riga (\n)
      fra le stringhe. Se il testo e` vuoto restituisce la stringa vuota "".
    */
    public String toString(){  //completare
        String ris = "";
        for(int i=0; i<this.dim; i++){
            ris += (this.txt[i]+"\n");
        }
        return ris;
    }

    /*
      crea un nuovo oggetto di tipo TextContainer in cui tutti i caratteri non
      alfabetici sono stati eliminati dalle stringhe del testo. Ad esempo elimina
      la punteggiatura, i numeri, le parentesi. Usa il metodo
      java.lang.Character.isLetter(char c)
    */
    public TextContainer onlyLetters(){ 
        String y[] = new String[this.dim]; 
        for(int i=0; i<this.dim; i++){
            y[i] = "";
            for(int j=0; j<this.txt[i].length(); j++){
                if(Character.isLetter(this.txt[i].charAt(j))  || (this.txt[i].charAt(j)=='\n') || (this.txt[i].charAt(j)==' ') ){
                    y[i] += (""+this.txt[i].charAt(j));
                }
            }
        }
        return new TextContainer(y,this.dim,this.dim);    
    }
    public int getDim(){
        return this.dim;
    }
    /*
     crea un nuovo oggetto di tipo TextContainer nel quale tutti i caratteri
     maiuscoli sono stati convertiti in minuscoli. 
     String[] txt,int dim,int limit
    */
    public TextContainer toLowerCase(){
        String[] y = new String[this.dim];
        
        for(int i=0; i<this.dim; i++){
            y[i] = this.txt[i].toLowerCase();
        }
        return new TextContainer(y,this.dim,this.dim); 
    }

    /*
     crea una copia dell'oggetto TextContainer, e ne restituisce il riferimento
    */
    public TextContainer copy(){ 
        String y[] = new String[this.dim];
        for(int i=0; i<this.dim; i++){
            y[i] = this.txt[i];
        }
        return new TextContainer(y,this.dim,this.limit);
    }

}

