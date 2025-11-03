import java.util.Scanner;

public class Es5_IV_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire la data di nascita (giorno e mese): ");
        int amore=(int)(Math.random()*100%5+1), amicizia=(int)(Math.random()*100%5+1), lavoro=(int)(Math.random()*100%5+1);
        int giorno=Integer.parseInt(in.next()),mese=Integer.parseInt(in.next());
        if(mese<=12 && mese >=1 && giorno >=1 && giorno <=31){
            switch(mese){
                case 1:{
                    if(giorno<=20 && giorno>=1) System.out.println("CAPRICORNO");
                    if(giorno>=21 && giorno<=31) System.out.println("AQUARIO");
                    break;
                }
                case 2:{
                    if(giorno<=18 && giorno>=1) System.out.println("AQUARIO");
                    if(giorno>=19 && giorno<=29) System.out.println("PESCI");
                    break;
                }
                case 3:{
                    if(giorno<=20 && giorno>=1) System.out.println("PESCI");
                    if(giorno>=21 && giorno<=31) System.out.println("ARIETE");
                    break;
                }
                case 4:{
                    if(giorno<=19 && giorno>=1) System.out.println("ARIETE");
                    if(giorno>=20 && giorno<=30) System.out.println("TORO");
                    break;
                }
                case 5:{
                    if(giorno<=20 && giorno>=1) System.out.println("TORO");
                    if(giorno>=21 && giorno<=31) System.out.println("GEMELLI");
                    break;
                }
                case 6:{
                    if(giorno<=20 && giorno>=1) System.out.println("GEMELLI");
                    if(giorno>=21 && giorno<=31) System.out.println("CANCRO");
                    break;
                }
                case 7:{
                    if(giorno<=22 && giorno>=1) System.out.println("CANCRO");
                    if(giorno>=23 && giorno<=31) System.out.println("LEONE");
                    break;
                }
                case 8:{
                    if(giorno<=22 && giorno>=1) System.out.println("LEONE");
                    if(giorno>=23 && giorno<=31) System.out.println("VERGINE");
                    break;
                }
                case 9:{
                    if(giorno<=22 && giorno>=1) System.out.println("VERGINE");
                    if(giorno>=23 && giorno<=31) System.out.println("BILANCIA");
                    break;
                }
                case 10:{
                    if(giorno<=22 && giorno>=1) System.out.println("BILANCIA");
                    if(giorno>=23 && giorno<=31) System.out.println("SCORPIONE");
                    break;
                }
                case 11:{
                    if(giorno<=21 && giorno>=1) System.out.println("SCORPIONE");
                    if(giorno>=22 && giorno<=31) System.out.println("SAGITTARIO");
                    break;
                }
                case 12:{
                    if(giorno<=21 && giorno>=1) System.out.println("SAGITTARIO");
                    if(giorno>=22 && giorno<=31) System.out.println("CAPRICORNO");
                    break;
                }
                default:{
                    break;
                }
            }
            System.out.println("Amore: "+amore);
            System.out.println("Amicizia: "+amicizia);
            System.out.println("Lavoro: "+lavoro);
        }else{
            System.out.println("L'input inserito non e' una data!");
        }
    }
}