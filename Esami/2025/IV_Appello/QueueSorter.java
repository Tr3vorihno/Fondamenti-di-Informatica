/*
* @autore 
* @data
* @matricola
* @postazione
*/

//package Esami.2025.IV_Appello;
public class QueueSorter implements CR{
    public static void sort(CR queue) {
        if (queue.isEmpty()) {
            return;
        }
       
        CR tempQueue = new QueueSorter();
        
        //min = findAndRemoveMin(queue);
        //System.out.println("min "+min);
        

        //min = findAndRemoveMin(queue);
        //System.out.println("min "+min);
        while (!queue.isEmpty()) {
            int min = findAndRemoveMin(queue);
            tempQueue.enqueue(min);
        }
        
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }
    private static void printQueue(CR queue) {
        CR supp = new QueueSorter();
        int size = queue.size();
        while(!queue.isEmpty()){
            Object element = queue.dequeue();
            System.out.print(element + " ");
            supp.enqueue(element);
        }
        while(!supp.isEmpty()){
            Object element = supp.dequeue();
            //System.out.print(element + " ");
            queue.enqueue(element);
        }
        System.out.println();
    }
    private static int findAndRemoveMin(CR queue) {
        //System.out.println("prima");
        //printQueue(queue);
       //System.out.println("deh");
        CR supp = new QueueSorter();
        int min = (int)queue.front(), pos = 0, i = 0;
        while(!queue.isEmpty()){
            int temp = (int)queue.dequeue();
            if(min>temp){
                min = temp;
                pos = i;
                //System.out.println("CAMBIO POS:"+pos+" val:"+temp);
            }
            supp.enqueue(temp);
            i++;
        }
        i=0;
        while(!supp.isEmpty()){
            if(i!=pos){
                queue.enqueue(supp.dequeue());
            }else{
                
                int vuoto =(int) supp.dequeue();
                //System.out.println("POS:"+pos+" I: "+i+" VUOTO:"+vuoto);
            }
            i++;
        }
        //System.out.println("Arrivo alla fine del find min");
        
        return min;
    }

// Implementazione di base della ArrayQueue per il test
    private static final int INITIAL_DIM = 1;
    private Object[] v;
    private int vSize;
    public QueueSorter(){
        v = new Object[INITIAL_DIM];
        vSize = 0;
    }
    public int size (){
        return vSize;
    }
    public boolean isEmpty (){
        if(size()==0) return true;
        else{return false;}
    }
    public Object front () throws QueueEmptyException{
        if(isEmpty()) throw new QueueEmptyException();
        Object k = v[0];
        return k;
    }
    public void enqueue (Object x){
        if(vSize==v.length){
            resize(v.length*2);
        }
        v[vSize] = x;
        vSize++;
    }
    public Object dequeue () throws QueueEmptyException{
        if(isEmpty()) throw new QueueEmptyException();
        vSize--;
        Object k = v[0];
        System.arraycopy(v,1,v,0,vSize);
        return k;
    }
    public void resize(int dim){
        Object[] g = new Object[dim];
        System.arraycopy(v,0,g,0,v.length);
        v = g;
    }

}
