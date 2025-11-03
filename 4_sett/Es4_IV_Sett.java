import java.util.Scanner;

public class Es4_IV_Sett{
    public static void main(String args[]){
        final double EPSILON = 0.1;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire le 3 lunghezze del triangolo: ");
        int a = Integer.parseInt(in.next()),b = Integer.parseInt(in.next()),c = Integer.parseInt(in.next());
        double cos_a=0, cos_b=0, cos_c=0,ang_a=0,ang_b=0,ang_c=0,max_ang=0;
        if(a<(b+c) && b<(a+c) && c<(b+a)){
            if(a==b && b==c){
                System.out.print("Triangolo equilatero ");
            }else{
                // applico legge dei coseni su ogni angolo
                cos_a = ((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2))/(2*b*c));
                cos_b = ((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2))/(2*a*c));
                cos_c = ((Math.pow(b,2) + Math.pow(a,2) - Math.pow(c,2))/(2*b*a));
                ang_a = Math.round(Math.toDegrees(Math.acos(cos_a)));
                ang_b = Math.round(Math.toDegrees(Math.acos(cos_b)));
                ang_c = Math.round(Math.toDegrees(Math.acos(cos_c)));

                if(a==b || b==c){
                    System.out.print("Triangolo isoscele");
                }else{
                    System.out.print("Triangolo scaleno");
                }

                if(ang_a > ang_b && ang_a > ang_c){
                    max_ang = ang_a;
                }else{
                    if(ang_b > ang_a && ang_b > ang_c){
                        max_ang = ang_b;
                    }else{
                        max_ang = ang_c;
                    }
                }
                if(max_ang>90){
                    System.out.print(" ottusangolo");
                }else{
                    if(max_ang<90){
                        System.out.print(" acutangolo");
                    }else{
                        System.out.print(" rettangolo");
                    }
                }
            }
        }else{
            System.out.println("Non e' un triangolo!");
        }
        
        System.out.println();
    }
}