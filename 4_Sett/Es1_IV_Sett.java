import java.util.Scanner;

public class Es1_IV_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci prima stringa : ");
        String n1 = in.nextLine();
        System.out.println("Inserisci seconda stringa : ");
        String n2 = in.nextLine();
        System.out.println("Inserisci terza stringa : ");
        String n3 = in.nextLine();

        System.out.println("Ordine lessicografico: ");


        // confronto le varie stringhe con degli if annidati, per capire il loro ordine
        if(n1.compareTo(n2)<0 && n1.compareTo(n3)<0){
            System.out.println(n1);
            if(n2.compareTo(n3)<0 ){
                System.out.println(n2);
                System.out.println(n3);
            }
        }else{
            if(n2.compareTo(n1)<0 && n2.compareTo(n3)<0){
                System.out.println(n2);
                if(n1.compareTo(n3)<0 ){
                    System.out.println(n1);
                    System.out.println(n3);
                }
            }else{
                System.out.println(n3);
                if(n2.compareTo(n1)<0 ){
                    System.out.println(n2);
                    System.out.println(n1);
                }
            }
        }

    }
}