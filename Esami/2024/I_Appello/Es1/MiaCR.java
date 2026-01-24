/**
*
* @autore 
* @data
* @matricola
* @postazione
*
  *   classe MiaCR
  *   realizzazione con array riempito parzialmente ridimensionabile
  *
  *
  *   
  */

public class MiaCR implements CR
{
   private static final int INITIAL_DIM = 1;

   private Object[] v;
   private int vSize;

   public MiaCR()
   {
      v = new Object[INITIAL_DIM];
      vSize = 0;
   }
   
   /*
      O(1)
   */
   public int size()
   {
      return vSize;
   }
   
   /*
      O(1)
   */
   public boolean isEmpty()
   {
      return vSize == 0;
   }
   
   /*
      O(1)
   */
   public Object front() throws QueueEmptyException
   {
      if (isEmpty())
         throw new QueueEmptyException();
         
      return v[0];
   }
   
   
   public void enqueue(Object x)
   {
      if(vSize == v.length) v = resize(v.length*2);
      v[vSize] = x;
      vSize++;
   /*
      Complessità: O(n) 
   */
   }
   public Object[] resize(int dim){
      Object[] obj = new Object[dim];
      System.arraycopy(v,0,obj,0,(dim/2));
      return obj;
   }

   public Object dequeue()  throws QueueEmptyException
   {
      Object x = front();
      
      for (int i = 0; i < vSize - 1; i++)
         v[i] = v[i + 1];
      
      vSize --;
      
      return x;
   
   /*
      O(n)
   */

   }

   
   public void reverse()
   {
      CR temp = new MiaCR();
      while(!this.isEmpty()){
         temp.enqueue(lastElement());
      }
      while(!temp.isEmpty()){
         this.enqueue(temp.dequeue());
      }
   /*
      Complessità: O(???) 
   */
   }

   public Object lastElement(){// mi restituisce sempre l'ultimo oggetto, manda indietro la queue senza ultimo oggetto
      CR temp = new MiaCR();
      Object tempObj = null;
      while(!this.isEmpty()){
         tempObj = this.dequeue();
         if(!this.isEmpty())temp.enqueue(tempObj);
      }
      while(!temp.isEmpty()){
         this.enqueue(temp.dequeue());
      }
      return tempObj;
   }
}