package Sett_7.Esercitazione3;
import ArrayAlgs.ArrayAlgs;
public class Playlist{

    private Canzone[] c;
    private int dim;

    public Playlist(int dim, Canzone[] c){
        this.dim = dim;
        this.c = new Canzone[dim];
        for(int i = 0; i<dim ; i++){
            this.c[i] = c[i];
        }
    }

    public void mergeSort(int param){
        this.c = Canzone.mergeSort(this.c,this.dim,param);
    }
    public void selectionSort(int param){
        this.c = Canzone.selectionSort(this.c,this.dim,param);
    }
    public void insertionSort(int param){
        this.c = Canzone.insertionSort(this.c,this.dim,param);
    }
    
    public void printPlaylist(){
        for(int i=0; i<this.dim; i++){
            System.out.println("[Durata: "+this.c[i].getDurata()+" , Titolo: "+this.c[i].getTitolo()+" , Artista: "+this.c[i].getArtista()+"]");
        }
    }

    public int recDurata(int index){
        if(index == 0){
            return  c[0].getDurata();
        }else{
            return  c[index].getDurata() + recDurata(index-1);
        }
    }

    public void stampaCanzoniArt(String art, int index){
        if(index == -1){
            return;
        }else{
            if(art.equals(c[index].getArtista())) System.out.println(c[index].getTitolo());
            stampaCanzoniArt(art,index-1);
        }  

    }
    
}