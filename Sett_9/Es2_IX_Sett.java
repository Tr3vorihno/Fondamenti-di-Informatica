package Sett_9;
public class Es2_IX_Sett{
    public static void main(String args[]){
        Comparable[] v = {9,8,7,6,5,4,3,2,1,0};
        v = bubbleSort(v,10);
        System.out.println(printArray(v,10));
    }
    public static Comparable[] bubbleSort(Comparable[] v, int dim){
        for(int i=0; i<dim; i++){
            for(int j=0; j<dim-1; j++){
                if(v[j].compareTo(v[j+1])>0) swap(v,j,j+1);
            }
        }
        return v;
    }
    public static void swap(Comparable[] v, int posA, int posB){
        if(posA!=posB){
            Comparable temp = v[posA];
            v[posA] = v[posB];
            v[posB] = temp;
        }
    }
    public static String printArray(Comparable[] array, int dim){
        String n = "[ ";
        for(int i=0; i<dim; i++){
            n += array[i]+" ";
        }
        n += "]";
        return n;
    }
}