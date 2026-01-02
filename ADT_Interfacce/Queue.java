package ADT_Interfacce;
public interface Queue extends Container{
    public void enqueue(Object o);
    public Object dequeue();
    public Object getFront();
}