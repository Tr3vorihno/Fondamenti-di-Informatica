import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class Es1{
    public static void main(String args[])throws IOException,Exception{
        double num = 0,media=0,deviazione=0,sommaQuad=0,sommaNorm=0;
        String riceve = "";
        int qua = 0;
        try{
            FileReader r = new FileReader("input_double.txt");
            Scanner in = new Scanner(r);
            while(in.hasNextLine()){
                riceve = in.nextLine();
                //System.out.println(prova);
                try{
                    num = Double.parseDouble(riceve);
                }catch(Exception e){
                    System.out.println("Non avete inserito un numero riprovate");
                }

                if(isDouble(num)){
                    qua++;
                    sommaNorm += num;
                    sommaQuad += Math.pow(num,2);
                }else{
                    System.out.println("Non avete inserito un numero floating point riprovate");
                }
            }// fine while importante
        }catch(IOException e){
            throw new IOException();
        }
        if(qua<2){
            System.out.println("La media è : "+media+" la deviazione è : "+deviazione);
        }else{
            media = sommaNorm/qua; // non ho bisogno di cast perchè sommaNorm è floating point
            deviazione = Math.sqrt((sommaQuad - sommaNorm*sommaNorm/qua)/(qua-1)); 
            System.out.println("La media è : "+media+" la deviazione è : "+deviazione);
        }
        
    }
    public static boolean isDouble(double num){
        int n = (int)Math.round(num);
        if(num-n==0) return false;
        else{return true;}
    }
}