package Sett_9;

public class Es1_IX_Sett{
    public static void main(String args[]){
        Comparable[] v = {"a","b","c"};
        System.out.println(iterativeBinSearch(v,3,"@"));

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
    
}
class ElementNotFoundException extends RuntimeException{}