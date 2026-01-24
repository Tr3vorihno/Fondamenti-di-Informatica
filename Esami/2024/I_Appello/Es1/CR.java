/**
  *   
  */

 public interface CR
 { int size ();
   boolean isEmpty ();
   Object front () throws QueueEmptyException;
   void enqueue (Object x);
   Object dequeue () throws QueueEmptyException;
   void reverse();
 }