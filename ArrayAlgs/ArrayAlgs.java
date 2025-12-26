package ArrayAlgs;
public class ArrayAlgs {
    // TODO

    /**
     * testa tutti i metodi di sort ricerca ecc, implementa ricerca dicotomica binaria
     * 
     */
    
    public static void main(String args[])throws Exception{
        Comparable n[] = {9,98,2,3,7};
        //Comparable[] n = {5,4,3,2,1};
        //n = mergeSort(n,5);
        
        System.out.println(printArray(n,5));
        //System.out.println(binarySearch(n,0,5,"z"));
        n = selectionSort(n,5);
        System.out.println(printArray(n,5));
        
    }
    
    
    
    // arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    //------




    public static int binarySearch(Comparable[] v, int ini, int fine, Comparable f){
        int media = (int)(ini+fine)/2;
        if(fine<=ini){
            return -1;
        }else{
            if(v[media].equals(f)){
                return media;
            }else{
                if(v[media].compareTo(f)>0){
                    return binarySearch(v,ini,media,f);
                }else{
                    return binarySearch(v,media,fine,f);
                }
            }
        }
    }
    public static Comparable[] resize(Comparable[] oldArray, int newLength)throws Exception{
        if(newLength < 0 || oldArray == null || newLength < oldArray.length) throw new Exception();
        Comparable[] newArray = new Comparable[newLength];
        System.arraycopy(oldArray,0,newArray,0,oldArray.length);
        return newArray;
    }




    //---------
    public static String printArray(Comparable[] array, int dim){
        String n = "[ ";
        for(int i=0; i<dim; i++){
            n += array[i]+" ";
        }
        n += "]";
        return n;
    }

    //----------------
    //TODO
    //riempimento generico


    public static Comparable[] randomIntArray(int length, int min, int max){// numero casuale tra min e max-1 
        Comparable[] array = new Comparable[length]; 
        for(int i=0 ; i<length; i++){
            array[i] = ((int)(Math.random()*(max-min)+min));
        }
        return array;
    }




    //-------------
    public static void removeSorted(Comparable[] v, int length, int index){// si utilizzano array riempiti a meta', ricordarsi di decrementare la dimensione dei valori dell'array
        for(int i = index ; i < length-1 ; i++){
            v[i] = v[i+1];
        }
    }
   
    public static void insert(Comparable[] v, int length, int index, Comparable value){
        for(int i = length ; i > index ; i--){
            v[i] = v[i-1];
        }
        v[index] = value;
    }
    public static int linearSearch(Comparable[] v, int length, Comparable value){
        for(int i = 0 ; i < length ; i++){
            if(v[i].equals(value)) return i;
        }
        return -1;
    }
    public static Comparable findMax(Comparable[] v, int length){
        Comparable max = v[0];
        for(int i = 1; i < length ; i++){
            if(v[i].compareTo(max)>0) max = v[i];
        }
        return max;
    }
    public static Comparable findMin(Comparable[] v, int length){
        Comparable min = v[0];
        for(int i = 1; i < length ; i++){
            if(v[i].compareTo(min)<0) min = v[i];
        }
        return min;
    }
    public static int findMinPos(Comparable[] v, int ini, int fine){// lavoro con array riempiti a metà e con inizio diverso da 0
        Comparable min = v[ini];
        int pos = ini;
        for(int i = ini+1 ; i < fine ; i++){
            if(min.compareTo(v[i])>0){
                min = v[i];
                pos = i;
            }
        }
        return pos;
    }
    public static int findMaxPos(Comparable[] v, int ini, int fine){// lavoro con array riempiti a metà e con inizio diverso da 0
        Comparable max = v[ini];
        int pos = ini;
        for(int i = ini ; i < fine ; i++){
            if(max.compareTo(v[i])<0){
                max = v[i];
                pos = i;
            }
        }
        return pos;
    }
    public static void swap(Comparable[] v, int posA, int posB){
        if(posA!=posB){
            Comparable temp = v[posA];
            v[posA] = v[posB];
            v[posB] = temp;
        }
    }
    public static Comparable[] selectionSort(Comparable[] v, int length){
        for(int i = 0; i<length; i++){
            int min = findMinPos(v,i,length);
            swap(v,min,i);
        }
        return v;
    }
    public static Comparable[] selectionSortDecre(Comparable[] v, int length){
        for(int i = 0; i<length; i++){
            int max = findMaxPos(v,i,length);
            swap(v,max,i);
        }
        return v;
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
    public static Comparable[] mergeSort(Comparable[] a, int n){
        int n1 = n / 2, n2 = n - n1;
        //if(n1 <= 0) n1 = 1;
        //if(n2 <= 0) n2 = 1;
        Comparable[] a1 = new Comparable[n1], a2 = new Comparable[n2];
        System.arraycopy(a,0,a1,0,n1);
        System.arraycopy(a,n1,a2,0,n2);

        if(n2 != 1) a2 = mergeSort(a2,n2);
        if(n1 != 1) a1 = mergeSort(a1,n1);
        a = merge(a1,a2);
        //System.out.println(printArray(a,n)); stringa debug post merge
        return a;
    }


    public static Comparable[] insertionSort(Comparable[] v, int length){
        for(int i=1; i<length; i++){
            for(int j=i; j>0; j--){
                if(v[j].compareTo(v[j-1])<=0){
                    swap(v,j,j-1);
                }
            }
        }
        return v;
    }
    public static boolean isPrime(int n){
        if(n==0) return false;
        for(int i=2; i<n; i++){
            if(n%i==0)  return false; 
        }
        return true;
    }

    public static int iterativeBinSearch(Comparable[] v, int dim, Comparable ele){
        int ini = 0, fin = dim, middle = 0, lastMiddle = 0;

        do{
            middle = (ini+fin)/2;
            if(lastMiddle==middle)throw new ElementNotFoundException();
            if(v[middle].equals(ele)){
                return middle;
            }else{
                if(v[middle].compareTo(ele)>=0){// ele maggiore di middle
                    fin = middle;
                }else{// ele minore di middle
                    ini = middle;
                }
            }
            lastMiddle = middle;
        }while(ini<=fin);
        throw new ElementNotFoundException();
    }
    public static Comparable[] bubbleSort(Comparable[] v, int dim){
        for(int i=0; i<dim; i++){
            for(int j=0; j<dim-1; j++){
                if(v[j].compareTo(v[j+1])>0) swap(v,j,j+1);
            }
        }
        return v;
    }
    
}

class ElementNotFoundException extends RuntimeException{}