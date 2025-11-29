package Sett_7.Esercitazione3;
import ArrayAlgs.ArrayAlgs;
public class Tester{
    public static void main(String[] args){
        Canzone[] c = new Canzone[4];
        c[0] = new Canzone(4,"Stairway to Heaven","Led Zeppelin");
        c[1] = new Canzone(3,"Money","Pink Floyd");
        c[2] = new Canzone(3,"Time","Pink Floyd");
        c[3] = new Canzone(2,"Aspettando il sole","Neffa");
        Playlist p = new Playlist(4,c);
        p.insertionSort(1);
        p.printPlaylist();
        System.out.println();
        p.mergeSort(2);
        p.printPlaylist();
        System.out.println();
        p.selectionSort(3);
        p.printPlaylist();
        System.out.println();

        System.out.println("Durata totale canzoni: "+p.recDurata(3)+" minuti");
        System.out.println("Cerco canzoni di : Pink Floyd ");
        p.stampaCanzoniArt("Pink Floyd",3);


    }
}