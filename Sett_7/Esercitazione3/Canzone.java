package Sett_7.Esercitazione3;
public class Canzone{
    private int durata;
    private String titolo;
    private String artista;

    public Canzone(int durata, String titolo, String artista){
        this.durata = durata;
        this.titolo = titolo;
        this.artista = artista;
    }
    public int getDurata(){
        return this.durata;
    }
    public String getTitolo(){
        return this.titolo;
    }
    public String getArtista(){
        return this.artista;
    }
    public static Canzone[] mergeSort(Canzone[] c,int dim,int param){// param mi rendere generico questo metodo 1= Durata 2 = Titolo 3 = Artista
        
        int lc = dim;
        int la = lc/2, lb = lc-la; 
        Canzone[] a =new Canzone[la],b= new Canzone[lb];

        System.arraycopy(c,0,a,0,la);
        System.arraycopy(c,la,b,0,lb);
        if(la!=1) a = mergeSort(a,la,param);
        if(lb!=1) b = mergeSort(b,lb,param);
        switch(param){
            case 1:{
                c = mergeD(a,b);
                break;
            }
            case 2:{
                c = mergeT(a,b);
                break;
            }
            case 3:{
                c = mergeA(a,b);
                break;
            }
            default:{
                break;
            }
        }
        
        return c;
    }
    private static Canzone[] mergeT(Canzone[] a, Canzone[] b){
        int la = 0, lb = 0, lc = 0;
        Canzone[] c = new Canzone[a.length+b.length];
        while(la < a.length && lb < b.length){
            if(a[la].getTitolo().compareTo(b[lb].getTitolo())<1){
                c[lc++] = a[la++];
            }else{
                c[lc++] = b[lb++];
            }
        }
        if(la<lb){
            System.arraycopy(a,la,c,lc,(c.length-lc));
        }else{
            if(lb<la){
                System.arraycopy(b,lb,c,lc,(c.length-lc));
            }
        }
        return c;
    }
    private static Canzone[] mergeA(Canzone[] a, Canzone[] b){
        int la = 0, lb = 0, lc = 0;
        Canzone[] c = new Canzone[a.length+b.length];
        while(la < a.length && lb < b.length){
            if(a[la].getArtista().compareTo(b[lb].getArtista())<1){
                c[lc++] = a[la++];
            }else{
                c[lc++] = b[lb++];
            }
        }
        if(la<lb){
            System.arraycopy(a,la,c,lc,(c.length-lc));
        }else{
            if(lb<la){
                System.arraycopy(b,lb,c,lc,(c.length-lc));
            }
        }
        return c;
    }
    private static Canzone[] mergeD(Canzone[] a, Canzone[] b){
        int la = 0, lb = 0, lc = 0;
        Canzone[] c = new Canzone[a.length+b.length];
        while(la < a.length && lb < b.length){
            if(a[la].getDurata() < b[lb].getDurata()){
                c[lc++] = a[la++];
            }else{
                c[lc++] = b[lb++];
            }
        }
        if(la<lb){
            System.arraycopy(a,la,c,lc,(c.length-lc));
        }else{
            if(lb<la){
                System.arraycopy(b,lb,c,lc,(c.length-lc));
            }
        }
        return c;
    }
    public static Canzone[] selectionSort(Canzone a[] , int dim, int param){
        for(int i=0; i<dim-1; i++){
            int n = 0;
            switch(param){
                case 1:{
                    n = minD(a,dim,i);
                    break;
                }
                case 2:{
                    n = minT(a,dim,i);
                    break;
                }
                case 3:{
                    n = minA(a,dim,i);
                    break;
                }
                default:{
                    break;
                }
            }
            a = swap (a,i,n);
        }
        return a;
    }
    private static Canzone[] swap(Canzone a[] , int pos1, int pos2){
        if(pos1 != pos2){
            Canzone b = a[pos1];
            a[pos1] = a[pos2];
            a[pos2] = b;
        }
        return a;
    }
    private static int minD(Canzone a[] , int dim, int start){
        int min = a[start].getDurata(), pos = start;
        for(int i=start+1; i<dim; i++){
            if(a[i].getDurata()<=min){
                min = a[i].getDurata();
                pos = i;
            }
        }
        return pos;
    }
    private static int minT(Canzone a[] , int dim, int start){
        String min = a[start].getTitolo();
        int pos = start;
        for(int i=start+1; i<dim; i++){
            if(min.compareTo(a[i].getTitolo())>=1){
                min = a[i].getTitolo();
                pos = i;
            }
        }
        return pos;
    }
    private static int minA(Canzone a[] , int dim, int start){
        String min = a[start].getArtista();
        int pos = start;
        for(int i=start+1; i<dim; i++){
            if(min.compareTo(a[i].getArtista())>=1){
                min = a[i].getArtista();
                pos = i;
            }
        }
        return pos;
    }

    public static Canzone[] insertionSort(Canzone a[], int dim, int param){
        for(int i = 1 ; i<dim; i++){
            for(int j=i; j>0; j--){
                switch(param){
                    case 1:{
                        if(a[j].getDurata()<a[j-1].getDurata())swap(a,j,j-1);
                        break;
                    }
                    case 2:{
                        if(a[j].getTitolo().compareTo(a[j-1].getTitolo())<=1)swap(a,j,j-1);
                        break;
                    }
                    case 3:{
                        if(a[j].getArtista().compareTo(a[j-1].getArtista())<=1)swap(a,j,j-1);
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        }
        return a;
    }


}