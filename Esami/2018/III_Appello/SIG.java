/**
  * Classe SIG
  * rappresenta un segnale campionato
  *
  * NOME E COGNOME CANDIDATO: ____________________________
  * MATRICOLA: ___________________________________________
  * DATA: ________________________________________________
  * POSTAZIONE: __________________________________________
  *
  */ 
import java.io.FileReader;
import java.util.Scanner;
public class SIG implements Dizionario
{
   // parte privata
   private MIS m[] = new MIS[100];
   private int size;
   // parte pubblica
   public SIG(String filename)  {
    try{
      Scanner s = new Scanner(new FileReader(filename));
      while(s.hasNextLine()){
        Scanner u = new Scanner(s.nextLine());
        insert(Integer.parseInt(u.next()),Double.parseDouble(u.next()));
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    
   }
   public MIS[] toSortedArray() {
      MIS[] temp = new MIS[this.size];
      System.arraycopy(this.m,0,temp,0,size);
      for(int i=0; i<this.size; i++){
        for(int j=0; j<this.size-1; j++){
          if(temp[j].compareTo(temp[j+1])>0){
            //System.out.println("entro : "+temp[j].toString()+" --> "+temp[j+1].toString());
            MIS deh = temp[j];
            temp[j] = temp[j+1];
            temp[j+1] = deh;
          }
        }
      }
      return temp;
   }
  public int findMin(int pa){
    int min = m[pa].tempo();
    for(int i=pa+1; i<this.size; i++){
      if(min>m[i].tempo()){
        min = m[i].tempo();
      }
    }
    return min;
  }
 
  public void makeEmpty(){
    this.size = 0;
  }
  public boolean isEmpty(){return (this.size==0);}
  public int size(){return this.size;}
  public void insert(int t, double v){
    int val = trova(t);
    MIS temp = new MIS(t,v);
    if(val!=-1)this.m[val] = temp;
    else{
      this.m[this.size] = temp;
      this.size++;
    }
  }
  public double find(int t) throws java.util.NoSuchElementException{
    int temp = trova(t);
    if(temp!=-1) return m[temp].valore();
    else{throw new java.util.NoSuchElementException();}
  }
  public int trova(int t){
    for(int i=0; i<size; i++){
      if(m[i].tempo()==t) return i;
    }
    return -1;
  }
  public void remove(int t){
    int temp = trova(t);
    if(temp!=-1){
      this.m[temp] = this.m[this.size-1];
      this.size--;
    } 
  }
}