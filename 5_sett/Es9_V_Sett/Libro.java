public class Libro{
    
    private String titolo;
    private String autore;
    private double prezzo;
    private int pagine;

    public Libro(String titolo, String autore, double prezzo, int pagine){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.pagine = pagine;
    }
    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public int getPagine(){
        return this.pagine;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public void setPagine(int pagine){
        this.pagine = pagine;
    }

    public double calcolaPrezzo(){
        double mag = this.prezzo;
        if(this.pagine>300){
            mag += ((this.prezzo /100)*10);
        }
        return mag;
    }
    public String toString(){
        return "Libro : [Titolo: "+this.getTitolo()+" Autore: "+this.getAutore()+" Prezzo: "+this.getPrezzo()+" Pagine: "+this.getPagine()+" ]";
    }
}