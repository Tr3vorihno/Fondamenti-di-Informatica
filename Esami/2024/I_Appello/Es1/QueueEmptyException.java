
public class QueueEmptyException extends RuntimeException
{
   public QueueEmptyException() {}
   
   public QueueEmptyException(String causa)
   {
      super(causa);
   }
}