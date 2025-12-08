package Sett_8;
import ArrayAlgs.ArrayAlgs;
public class Es8_VIII_Sett{
    public static void main(String args[]){
        Comparable v[] = ArrayAlgs.randomIntArray(10,0,10);
        System.out.println(ArrayAlgs.printArray(v,10));
        v = recSelectionSort(v,9,0);
        System.out.println(ArrayAlgs.printArray(v,10));
    }
    public static Comparable[] recSelectionSort(Comparable v[], int dim, int index){
        if(dim<=index) return v;

        int min = ArrayAlgs.findMinPos(v,index,dim);
        Comparable p = v[min];
        ArrayAlgs.removeSorted(v,dim,min);
        ArrayAlgs.insert(v,dim,index,p);
        return recSelectionSort(v,dim,index+1);
    }
}