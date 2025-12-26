package Sett_10.Es4_X_Sett;

public class Student implements Comparable
{
    public Student(String n, int m){   
        nome = n;
        matricola = m;
    }
    public int getMatricola(){ 
        return matricola; 
    }
    public String getNome(){ 
        return nome; 
    }
    public String toString() 
    { return matricola + ":" + nome; }

    /*
        confronta in base al numero di matricola (in particolare due oggetti di 
        tipo Student sono "uguali" quando hanno la stessa matricola)
        Lancia ClassCastException se s non si riferisce ad un oggetto Student 
    */
    public int compareTo(Object s)
    {   return matricola - ((Student) s).matricola;
    }

    private final String nome;
    private final int matricola;
}
