import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Es1_bis{
    public static void main(String args[]) throws Exception{
        boolean flag = true;
        try{
            FileReader r = new FileReader("input_years.txt");
            Scanner in = new Scanner(r);
            String str = "";
            int anno = 0;
            while(in.hasNextLine() && flag){
                str = in.nextLine();
                if(parseNumber(str)){
                    anno = Integer.parseInt(str);
                    if(anno == 0) flag = false;
                    else{
                        if(isBisesto(anno)){
                        System.out.println("ANNO BISESTILE");
                        }else{
                            System.out.println("ANNO NON BISESTILE");
                        }
                    }
                }
            }
        }catch(Exception e){}
    }

    public static boolean isBisesto(int annoBis){
        boolean n = true;
        if(annoBis%4==0){
            if(annoBis%100==0 &&  annoBis%400!=0){
                n = false;
            }
        }else{n = false;}
        return n;
    }
    public static boolean parseNumber(String n) throws Exception{
        double a = 0;
        int b = 0;
        boolean flag = true;
        try{    
            a = Double.parseDouble(n);
        }catch(Exception e){
            System.out.println("Inserire un numero!");
            flag = false;
        }
        if(flag){
            b = (int) Math.round(a);
            if(b-a!=0 || b < 0){// il numero è per forza errato, quindi minore di zero o floating point
                System.out.println("Numero inserito non valido, solo numeri interi e positivi");
                flag = false;
            }
        }
        return flag;
    }       
}