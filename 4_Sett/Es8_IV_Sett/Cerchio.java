public class Cerchio{

   /*
      CAMPI ESEMPLARE E VARI METODI UTILI ALLA RISOLUZIONE DELL'ESERCIZIO
   */
   public static final double EPSILON = 0.0000001; // precisione uguaglianza java
   private Punto p;
   private double radius;
   
   public Cerchio (Punto p, double radius){
      this.p = p;
      this.radius = radius;
   }
   // creo un cerchio unitario (x,y)=(0,0) e raggio 1
   public Cerchio (){
      this.p = new Punto(0,0);
      this.radius = 1;
   }

   public double getRadius(){
      return this.radius;
   }
   public Punto getPunto(){
      return this.p;
   }
   /*
       Verifica se questo cerchio e il cerchio c sono coincidenti, 
       ovvero se hanno tutti i punti in comune
   */

   public boolean isCoincident(Cerchio c){
      if((this.getRadius() == c.getRadius()) && ((this.getPunto().getX() == c.getPunto().getX()) && (this.getPunto().getY() == c.getPunto().getY()))){
         return true;
      }else{
         return false;
      }
   }


   /*
       verifica se questo cerchio e' interno al cerchio c o se
       il cerchio c e' interno a questo cerchio
   */
   public boolean isEncircled(Cerchio c){// prendo l'ipotesi che il parametro esplicito sia più grande di quello esplicito
      double dist1 = this.p.distanzaTraDuePunti(c.getPunto());
      if(((dist1-EPSILON)<this.radius) && (c.getRadius()<(Math.abs(dist1-this.radius-EPSILON)))){// cerchio c interno a cerchio implicito
         return true;
      }else{
         return false;
      }
   }

   /*
      verifica se questo cerchio e il cerchio c sono esterni, ovvero non
      sono contenuti uno nell'altro e non hanno alcun punto in comune
   */
   public boolean isExternal(Cerchio c){
      double dist1 = this.p.distanzaTraDuePunti(c.getPunto());
      if((dist1-EPSILON) > this.radius+c.getRadius()){
         return true;
      }else{
         return false;
      }
   }
   /*
      verifica se questo cerchio e il cerchio c sono secanti, 
      ovvero se hanno almeno un punto in comune.
   */
   public boolean isSecant(Cerchio c){ // "complementare" della funzione isExternal
   if(this.isEncircled(c)==true){
      return false;
   }else{
      double dist1 = this.p.distanzaTraDuePunti(c.getPunto());
      if((dist1+EPSILON) <= this.radius+c.getRadius()){
         return true;
      }else{
         return false;
      }
   }
      
   }
   /*
      Verifica se questo cerchio e il cerchio c sono tangenti,
      ovvero se hanno un solo punto in comune
   */
   public boolean isTangential(Cerchio c){// caso "speciale" della funzione isExternal, quando le distanze dai centri dei punti coincidono con la somma dei raggi dei cerchi
	   double dist1 = this.p.distanzaTraDuePunti(c.getPunto());
      // siccome utilizzo floating point, potrebbe essere che le distanze non coincidano precisamente: utilizzo un'approssimazione della distanza
      //System.out.println("dist : "+(dist1+EPSILON)+" r:"+(this.radius+c.getRadius()));
      //System.out.println("dist : "+(dist1-EPSILON)+" r:"+(this.radius+c.getRadius()));
      if(((dist1+EPSILON) >= this.radius+c.getRadius()) && ((dist1-EPSILON) <= this.radius+c.getRadius())){
         return true;
      }else{
         return false;
      }
   }

}
