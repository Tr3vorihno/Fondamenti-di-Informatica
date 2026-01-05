/*
 * Nome, Cognome:
 * Matricola:
 * Postazione:
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static int findLongestIncreasingSubsequence(int[] arr) {
        int pre = arr[0];
        int[] records = new int[20];
        int dimRec=0;
        int temp = 1;
        
        for(int i=1; i<arr.length; i++){
            
            if(arr[i]>pre){
                temp++;
            }else{
                records[dimRec] = temp;
                temp = 1;
                dimRec++;
            }
            pre = arr[i];
        }
        records[dimRec] = temp;
        dimRec++;
        
        int max = records[0];
        for(int i=1; i<dimRec; i++){
            if(max<records[i]) max = records[i];
        }
        return max;
    }   
    public static void main(String args[]){
        int v[] = new int[24];
        int dim = 0;
        String temp = "";
        try{
            Scanner io = new Scanner(new FileReader("numbers.txt"));
            while(io.hasNext()){
                temp = io.next();
                v[dim] = Integer.parseInt(temp);
                dim++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        printArr(v,dim);

        System.out.println("Sottosequenza massima : "+findLongestIncreasingSubsequence(v));
       
    }
    public static void printArr(int v[], int dim){
        System.out.println();
        for(int i=0; i<dim; i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
    }

}