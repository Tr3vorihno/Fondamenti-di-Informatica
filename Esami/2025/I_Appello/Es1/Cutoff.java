/*
 * Questa classe Cutoff implementa un'applicazione per lavorare con coppie chiave-valore
 * memorizzate in un dizionario personalizzato. Le principali funzionalità includono:
 *
 * 1. Caricamento di coppie chiave-valore da un file di testo.
 *    - Ogni riga del file deve contenere una coppia chiave e valore separata da una virgola.
 *    - Gli spazi bianchi vengono ignorati durante il parsing della chiave e del valore.
 *    - Il file viene letto linea per linea e ogni coppia viene aggiunta a un'istanza di "Dizionario".
 *
 * 2. Filtraggio delle coppie chiave-valore.
 *    - È possibile rimuovere tutte le coppie con chiavi inferiori a una soglia specificata.
 *    - Il filtraggio restituisce un nuovo dizionario contenente solo le coppie valide.
 *
 * 3. Esecuzione tramite il metodo main.
 *    - Accetta due argomenti: il file di input e la soglia per il filtro.
 *    - Stampa il dizionario caricato e il dizionario filtrato su terminale.
 *
 * La classe utilizza un file di supporto "Dizionario", un'ADT personalizzata che permette
 * di memorizzare e manipolare coppie chiave-valore.
 */
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

public class Cutoff {

    // Metodo per caricare coppie chiave-valore da un file di testo
    public static Dizionario loadFromFile(String fileName) {
        String temp = "";
        Dizionario d = new Dizionario();
        try{
            Scanner io = new Scanner(new FileReader(fileName));
            while(io.hasNextLine()){
                temp = io.nextLine();
                Scanner sTemp = new Scanner(temp);
                sTemp.useDelimiter(",");
                d.insert(Integer.parseInt(sTemp.next()),sTemp.next());
            }
            io.close();
        }catch(Exception e){e.printStackTrace();}
        return d;
    }

    // Metodo per rimuovere coppie con chiavi al di sotto di una soglia
    public static Dizionario removePairsBelowThreshold(Dizionario dizionario, int threshold) {
        Dizionario.Pair obj[] = dizionario.toArray();
        Dizionario tempDizionario = new Dizionario();
        int tempKey = 0;
        for(int i=0; i<obj.length; i++){
            tempKey = (int) obj[i].getKey();
            if(tempKey>=threshold) tempDizionario.insert(((int)obj[i].getKey()),((String)obj[i].getValue()));
        }
        return tempDizionario;
    }

    public static void main(String[] args) {
        // Controlla che i parametri siano sufficienti
        if (args.length < 2) {
            System.err.println("Usage: java Cutoff <filePath> <threshold>");
            return;
        }

        String filePath = args[0]; // Percorso del file di input
        int threshold = Integer.parseInt(args[1]); // Soglia per il filtro

        // Carica il dizionario dal file
        Dizionario dizionario = loadFromFile(filePath);
        System.out.println("Dizionario caricato:\n" + dizionario);

        // Filtra il dizionario in base alla soglia
        Dizionario filteredDizionario = removePairsBelowThreshold(dizionario, threshold);
        System.out.println("Dizionario filtrato:\n" + filteredDizionario);
        
       //Dizionario d = loadFromFile("dictionary_example.txt");
       //System.out.println(d.toString());
    }
}
