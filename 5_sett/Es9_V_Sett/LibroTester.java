public class LibroTester{
    public static void main(String args[]){

        Libro l1 = new Libro("Il signore degli anelli : la compagnia dell'anello","J.R.R. Tolkien",15,200);
        Libro l2 = new Libro("IT","Stephen King",20,1200);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println("Prezzo primo libro "+l1.calcolaPrezzo());
        System.out.println("Prezzo secondo libro "+l2.calcolaPrezzo());
    }
}