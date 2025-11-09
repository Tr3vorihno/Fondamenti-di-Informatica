import java.util.Scanner;

public class Es1_V_Sett{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean dentro = false;
        double num = 0,media=0,deviazione=0,sommaQuad=0,sommaNorm=0;
        String riceve = "";
        int qua = 0;
        while(!dentro){
            System.out.println("( premere q per uscire ) Inserire il numero: ");
            riceve = in.nextLine();
            if(!riceve.equalsIgnoreCase("q")){
                num = Double.parseDouble(riceve);
                qua++;
                sommaNorm += num;
                sommaQuad += Math.pow(num,2);
            }else{
                dentro = true;
            }
        }
        if(qua<2){
            System.out.println("La media è : "+media+" la deviazione è : "+deviazione);
        }else{
            media = sommaNorm/qua; // non ho bisogno di cast perchè sommaNorm è floating point
            deviazione = Math.sqrt((sommaQuad - sommaNorm*sommaNorm/qua)/(qua-1)); 
            System.out.println("La media è : "+media+" la deviazione è : "+deviazione);
        }
    }
}