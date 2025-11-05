import java.util.Scanner;
enum Pianeti{

    Mercurio(0.38),
    Venere(0.91),
    Marte(0.38),
    Giove(2.34),
    Saturno(1.06),
    Urano(0.92),
    Nettuno(1.19);

    private final double g;
    Pianeti(double g){
        this.g = g;
    }
    public double getG(){
        return this.g;
    }
    public double getPeso(double peso){
        return (peso*this.getG());
    }
}

public class Es10_IV_Sett{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci peso sulla terra: ");
        double peso = Double.parseDouble(in.nextLine());

        System.out.println("Scegli un pianeta: ");
        String piane = in.nextLine();
        Pianeti n = Pianeti.valueOf(piane);
        System.out.println("Nel pianeta : "+piane+" pesi: "+n.getPeso(peso)+" kg");
        sborra

    }
}