package Sett_8;
import java.util.Scanner;
import ArrayAlgs.ArrayAlgs;
public class Es6_VIII_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire dimensione e limite generazione casuale numeri.");
        int dim = Integer.parseInt(in.next()), n = Integer.parseInt(in.next());
        Comparable v[] = ArrayAlgs.randomIntArray(dim,1,n);
        System.out.println(ArrayAlgs.printArray(v,dim)+" \n min:"+recFindMin(v,dim-2,v[dim-1]));
    }
    public static Comparable recFindMin(Comparable[] v, int dim, Comparable min){
        if(v[dim].compareTo(min)<0) min = v[dim];
        if(dim == 0) return min;
        dim--;
        return recFindMin(v,dim,min);
    }
}