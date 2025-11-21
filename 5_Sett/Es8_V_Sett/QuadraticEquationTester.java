import java.util.Scanner;

public class QuadraticEquationTester{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire i coefficenti dell'equazione di secondo grado (a,b,c,)");
        double a = Double.parseDouble(in.nextLine()),b = Double.parseDouble(in.nextLine()),c = Double.parseDouble(in.nextLine());

        QuadraticEquation n1 = new QuadraticEquation(a,b,c);
        
        System.out.println(n1.toString());
        
        System.out.println("Sol1 : "+n1.parseSolution(n1.getSolution1()));
        System.out.println("Sol2 : "+n1.parseSolution(n1.getSolution2()));
    }
}