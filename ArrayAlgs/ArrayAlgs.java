public class ArrayAlgs{
    
    /*public static void main(String args[]){
        int n[] = randomIntArray(100000,0,10000);
        //int[] n = {5,4,3,2,1};
        System.out.println(printArray(n,100000));
        n = mergeSort(n,100000);
        System.out.println(printArray(n,100000));
        //selectionSort(n,100);
        
    }
    */
    // arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
    public static int[] resize(int[] oldArray, int newLength)throws Exception{
        if(newLength < 0 || oldArray == null || newLength < oldArray.length) throw new Exception();
        int[] newArray = new int[newLength];
        System.arraycopy(oldArray,0,newArray,0,3);
        return newArray;
    }
    public static String printArray(int[] array, int dim){
        String n = "[ ";
        for(int i=0; i<dim; i++){
            n += array[i]+" ";
        }
        n += "]";
        return n;
    }
    public static int[] randomIntArray(int length, int min, int max){// numero casuale tra min e max-1 
        int[] array = new int[length]; 
        for(int i=0 ; i<length; i++){
            array[i] = ((int)(Math.random()*(max-min)+min));
        }
        return array;
    }
    public static void removeSorted(int[] v, int length, int index){// si utilizzano array riempiti a meta', ricordarsi di decrementare la dimensione dei valori dell'array
        for(int i = index ; i < length-1 ; i++){
            v[i] = v[i+1];
        }
    }
    public static void insert(int[] v, int length, int index, int value){
        for(int i = length ; i > index ; i--){
            v[i] = v[i-1];
        }
        v[index] = value;
    }
    public static int linearSearch(int[] v, int length, int value){
        for(int i = 0 ; i < length ; i++){
            if(v[i]==value) return i;
        }
        return -1;
    }
    public static int findMax(int[] v, int length){
        int max = v[0];
        for(int i = 1; i < length ; i++){
            if(v[i]>max) max = v[i];
        }
        return max;
    }
    public static int findMin(int[] v, int length){
        int min = v[0];
        for(int i = 1; i < length ; i++){
            if(v[i]<min) min = v[i];
        }
        return min;
    }
    public static int findMinPos(int[] v, int ini, int fine){// lavoro con array riempiti a metà e con inizio diverso da 0
        int min = v[ini];
        int pos = ini;
        for(int i = ini ; i < fine ; i++){
            if(min>v[i]){
                min = v[i];
                pos = i;
            }
        }
        return pos;
    }
    public static int findMaxPos(int[] v, int ini, int fine){// lavoro con array riempiti a metà e con inizio diverso da 0
        int max = v[ini];
        int pos = ini;
        for(int i = ini ; i < fine ; i++){
            if(max<v[i]){
                max = v[i];
                pos = i;
            }
        }
        return pos;
    }
    public static void swap(int[] v, int posA, int posB){
        if(posA!=posB){
            int temp = v[posA];
            v[posA] = v[posB];
            v[posB] = temp;
        }
    }
    public static void selectionSort(int[] v, int length){
        for(int i = 0; i<length; i++){
            int min = findMinPos(v,i,length);
            swap(v,min,i);
        }
    }
    public static int[] merge(int[] a, int[] b){
        int lA = 0, lB = 0, lC = 0, dim = (a.length+b.length);
        int[] c = new int[dim];
        while(a.length > lA && b.length > lB){
            if(a[lA] < b[lB]){
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
    public static int[] mergeSort(int[] a, int n){
        int n1 = n / 2, n2 = n - n1;
        //if(n1 <= 0) n1 = 1;
        //if(n2 <= 0) n2 = 1;
        int[] a1 = new int[n1], a2 = new int[n2];
        System.arraycopy(a,0,a1,0,n1);
        System.arraycopy(a,n1,a2,0,n2);

        if(n2 != 1) a2 = mergeSort(a2,n2);
        if(n1 != 1) a1 = mergeSort(a1,n1);
        a = merge(a1,a2);
        //System.out.println(printArray(a,n)); stringa debug post merge
        return a;
    }
}