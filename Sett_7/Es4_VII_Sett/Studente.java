//package Sett_7.Es4_VII_Sett;
public class Studente{
    private String nome;
    private int scritto;
    private int orale;

    public Studente(String nome, int scritto, int orale){
        this.nome = nome;
        this.scritto = scritto;
        this.orale = orale;
    }

    public String getNome(){
        return this.nome;
    }
    public int getScritto(){
        return this.scritto;
    }
    public int getOrale(){
        return this.orale;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setScritto(int scritto){
        this.scritto = scritto;
    }
    public void setOrale(int orale){
        this.orale = orale;
    }
}