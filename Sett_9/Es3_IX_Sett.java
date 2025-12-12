package Sett_9;
public class Es3_IX_Sett{
    public static void main(String args[]){
        Comparable[] n = {9,8,7,6,5,4,3,2};
        iterativeMergeSort(n,8);
    }
    public static Comparable[] iterativeMergeSort(Comparable v[], int dim){// PRIMA VERSIONE CON DIM POTENZA DI 2
        for(int i = 2 ; i<5; i*=2){
            System.out.println("i: "+i);
            int dimP = (dim/i);
            System.out.println("dimP: "+dimP);
            Comparable n[][] = new Comparable[dimP][i];
            for(int j = 0, y = 2 ; j < dimP ; j++ , y+=2 ){
                Comparable[] k1 = {v[y-1]}, k2 = {v[y-2]};// problema sta qui
                n[j] = merge(k1,k2);
                System.out.println(printArray(n[j],i));
            }
            System.out.println(" ");
        }
        return null;
    }
    public static Comparable[][] toMatrix(Comparable v[], int dimX, int dimY){
        Comparable[][] n = new Comparable[dimX][dimY];
        for(int i=0; i<dimX; i++){
            for(int j=0; j<dimY; i++){
                n[i][j] = v[i];
            }
        }
        return n;
    }
    public static Comparable[] merge(Comparable[] a, Comparable[] b){
        int lA = 0, lB = 0, lC = 0, dim = (a.length+b.length);
        Comparable[] c = new Comparable[dim];
        while(a.length > lA && b.length > lB){
            if(a[lA].compareTo(b[lB])<0){
                c[lC] = a[lA];
                lC++;
                lA++;
            }else{
                c[lC] = b[lB];
                lC++;
                lB++;
            }
        }
        if(a.length > lA){
            System.arraycopy(a,lA,c,lC,(dim-lC));
        }else{
            if(b.length > lB){
                System.arraycopy(b,lB,c,lC,(dim-lC));
            }
        }
        return c;
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