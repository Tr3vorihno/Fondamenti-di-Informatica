import java.util.Scanner;

public class BankAccountTester{
    public static void main(String args[]){
        BankAccount b = new BankAccount(1000);
        
        
        Scanner in = new Scanner(System.in);
        int prelievo = 0;
        double saldo = 0,interesse = 0;
        boolean flag = true;
        

        do{
            System.out.println("Comando ? : [Q, B, D, W, A]");
            String s = in.nextLine();
            String[] f = {"",""};
            Scanner sc = new Scanner(s);
            int i;
            for(i = 0; sc.hasNext(); i++){
                f[i] = sc.next();
            }
            switch(f[0]){
                case "q":
                case "Q":{
                    System.out.println("Arrivederci!");
                    flag = false;
                    break;
                }
                case "b":
                case "B":{
                    System.out.println("Saldo attuale : "+b.getAmount());
                    break;
                }
                case "d":
                case "D":{
                    try{
                        double val = Double.parseDouble(f[1]);
                        if(!b.deposit(val)){
                            System.out.println("Versamento non corretto");
                        }else{
                            System.out.println("Versamento effettuato: "+val);
                        }
                    }catch(Exception e){};
                    
                    break;
                }
                case "w":
                case "W":{
                    try{
                    double val = Double.parseDouble(f[1]);
                        if(!b.withdraw(val)){
                            System.out.println("Prelievo non corretto");
                        }else{
                            System.out.println("Prelievo effettuato: "+val);
                        }
                    }catch(Exception e){};
                    break;
                }
                case "a":
                case "A":{
                    try{
                        double val = Double.parseDouble(f[1]);
                        double intere = b.addInterest(val);
                        System.out.println("Interessi calcolati e accreditati: "+intere);
                    }catch(Exception e){};
                    break;
                }
                default:{

                    break;
                }
            }
        }while(flag);
    }
}