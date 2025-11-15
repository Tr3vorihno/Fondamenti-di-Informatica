public class ArrayAlgs{
    /*
    public static void main(String args[]){
        int n[] = randomIntArray(5,5,11);
        System.out.println(printArray(n,5));
        //n = resize(n,5);
        //System.out.println(printArray(n,5));
        removeSorted(n,5,2);
        System.out.println(printArray(n,4));
        insert(n,4,3,67);
        System.out.println(printArray(n,5));
        System.out.println(findMin(n,5));
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
            array[i] = ((int)(Math.random()*100%(max-min)+min));
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
}