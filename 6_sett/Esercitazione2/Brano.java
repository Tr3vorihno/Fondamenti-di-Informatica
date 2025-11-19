public class Brano{
    /**
     * @author Enrico Cervi
     * @version 1.0
     * 
     */

    enum Generi{
        ROCK(1970),
        POP(1980),
        GRUNGE(1990);
       
        /**
         * @param anno parametro che descrive l'anno del genere
         * 
         */
        private int anno;
        private Generi(int anno){
            this.anno = anno;
        }
        private int getAnno(){
            return this.anno;
        }
    }
    /**
     * @param titolo titolo canzone
     * @param artista artista canzone
     * @param durata durata canzone
     * @param genere genere canzone
     * @param anno  anno canzone
     * @param bpm  bpm canzone
     */
    private String titolo;
    private String artista;
    private int durata;
    private String genere;
    private int anno;
    private int bpm;
    public Brano(String titolo, String artista, int durata, String genere, int anno, int bpm){
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
        this.genere = genere;
        this.anno = anno;
        this.bpm = bpm;
    }
    public Brano(){
        this.titolo = "";
        this.artista = "";
        this.durata = 0;
        this.genere = "";
        this.anno = 0;
        this.bpm = 0;
    }
    public String toString(){
        return "[Titolo: "+this.titolo+", Artista: "+this.artista+", Durata: "+this.durata+"', Genere: "+this.genere+", Anno: "+this.anno+", Bpm: "+this.bpm+"]";
    }

    public String analizzaBrano(){
        String analisi = "";
        if(this.durata < 3){
            analisi += "Durata breve \n";
        }else{
            if(this.durata >= 3 && this.durata <5){
                analisi += "Durata: media \n";
            }else{
                analisi += "Durata: lunga \n";
            }
        }

        if(this.anno < 1970){
            analisi += "Epoca: classica \n";
        }else{
            if(this.anno >= 1970 && this.anno <1990){
                analisi += "Epoca: moderna \n";
            }else{
                analisi += "Epoca: contemporanea \n";
            }
        }

        if(this.bpm < 80){
            analisi += "Tempo': lenta \n";
            analisi += "Possibili utilizzi: Relax, Meditazione \n";
        }else{
            if(this.bpm >= 80 && this.bpm <120){
                analisi += "Tempo': moderato \n";
                analisi += "Possibili utilizzi: Ascolto casual, sottofondo per lavoro  \n";
            }else{
                if(this.bpm >= 120 && this.bpm <160){
                    analisi += "Tempo': veloce \n";
                    analisi += "Possibili utilizzi: Allenamento, festa  \n";
                }else{
                    analisi += "Tempo': molto veloce \n ";
                    analisi += "Possibili utilizzi: Allenamento, festa  \n";
                }
                
            }
        }
        if((Generi.ROCK.getAnno()>= this.anno ) && Generi.ROCK.toString().equalsIgnoreCase(this.genere)){
            analisi += "Brano coerente con il genere in voga al tempo \n";
        }else{
            if((Generi.POP.getAnno()>= this.anno && Generi.POP.getAnno()<=this.anno) && Generi.POP.toString().equalsIgnoreCase(this.genere)){
                analisi += "Brano coerente con il genere in voga al tempo \n";
            }else{
                if((Generi.GRUNGE.getAnno()<=this.anno) && Generi.GRUNGE.toString().equalsIgnoreCase(this.genere)){
                    analisi += "Brano coerente con il genere in voga al tempo \n";
                }else{
                    analisi += "Brano non coerente con il genere in voga al tempo \n";
                }
            }
        }
        return analisi;
    }



    public String getTitolo(){
        return this.titolo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public String getArtista(){
        return this.artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public int getDurata(){
        return this.durata;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }
    public String getGenere(){
        return this.genere;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public int getAnno(){
        return this.anno;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public int getBpm(){
        return this.bpm;
    }
    public void setBpm(int bpm){
        this.bpm = bpm;
    }
}