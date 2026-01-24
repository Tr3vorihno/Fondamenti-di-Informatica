/**
  * Classe MIS
  * rappresenta un campione di una misura
  *
  * NOME E COGNOME CANDIDATO: ____________________________
  * MATRICOLA: ___________________________________________
  * DATA: ________________________________________________
  * POSTAZIONE: __________________________________________
  *
  */
public class MIS implements Comparable
{
   //parte privata
   private int t;
   private double v;
   // parte pubblica
   public MIS(int t, double v){
    this.t = t;
    this.v = v;
   }
   
   public int tempo() {return this.t;}
   public double valore() {return this.v;}
   public String toString() {return "("+this.t+" -> "+this.v+")";}
   public int compareTo(Object temp){
    if(temp instanceof MIS){
      MIS j = (MIS)temp;
      if(this.t>j.tempo()) return 1;
      return -1;
    }
    return 0;
   }
}