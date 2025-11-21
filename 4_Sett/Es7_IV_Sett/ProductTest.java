import java.util.Scanner;

public class ProductTest{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("1- Inserisci nome prodotto: ");
        String nome1 = in.nextLine();

        System.out.println("1- Inserisci prezzo prodotto: ");
        double prezzo1 = Double.parseDouble(in.nextLine());

        System.out.println("2- Inserisci nome prodotto: ");
        String nome2 = in.nextLine();

        System.out.println("2- Inserisci prezzo prodotto: ");
        double prezzo2 = Double.parseDouble(in.nextLine());

        Product p1 = new Product(nome1,prezzo1);
        Product p2 = new Product(nome2,prezzo2);

        System.out.println("Inserisci sconto da applicare: ");
        double sconto = Double.parseDouble(in.nextLine());
        
        if(p1.getPrice()>p2.getPrice()){
            System.out.println("Prodotto 2: "+p2.getName()+" "+p2.getPrice());
            System.out.println("Prodotto 1: "+p1.getName()+" "+p1.getPrice());
            p1.reducePrice(sconto);
        }else{
            System.out.println("Prodotto 1: "+p1.getName()+" "+p1.getPrice());
            System.out.println("Prodotto 2: "+p2.getName()+" "+p2.getPrice());
            p2.reducePrice(sconto);
        }

        if(p1.getPrice()>p2.getPrice()){
            System.out.println("Prodotto 2: "+p2.getName()+" "+p2.getPrice());
            System.out.println("Prodotto 1: "+p1.getName()+" "+p1.getPrice());
        }else{
            System.out.println("Prodotto 1: "+p1.getName()+" "+p1.getPrice());
            System.out.println("Prodotto 2: "+p2.getName()+" "+p2.getPrice());
        }

    }
}