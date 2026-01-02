//package Esami.2025.IV_Appello;
public class QueueEmptyException extends RuntimeException
{
   public QueueEmptyException() {}
   
   public QueueEmptyException(String causa)
   {
      super(causa);
   }
}