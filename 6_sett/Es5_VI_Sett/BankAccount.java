public class BankAccount{
    private static int NUMERO_CONTO = 0;

    private double amount;
    private int num_conto;

    public BankAccount(double amount){// costruttore con cifra
        NUMERO_CONTO++;
        if(amount<0){
            this.amount=0;
        }else{
            this.amount = amount;
        }
        this.num_conto = NUMERO_CONTO;
    }
    public BankAccount(){// costruttore di def
        NUMERO_CONTO++;
        this.amount = 0;
        this.num_conto = NUMERO_CONTO;
    }

    public double getAmount(){// getters ; non creo setters siccome non posso impostare un saldo a piacere in un conto bancario
        return this.amount;
    }
    public int getNumConto(){
        return this.num_conto;
    }
    public boolean deposit(double amount){
        if(amount>=0){
            this.amount+=amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount){
        if(amount>=0 && this.getAmount()-amount>=0){
            this.amount-=amount;
            return true;
        }
        return false;
    }
    public void transfer(double amount, BankAccount other){
        this.amount -= amount;
        other.deposit(amount);this.amount-=amount;
    }
    public double addInterest(double rate){
        double money=0;
        if(rate<0){// nel caso rate sia negativo, non aggiungo interessi perchè sarebbe un errore
            rate = 0;
        }else{
            money = ((this.amount *rate)/100);
            this.deposit(money);
        }
        return money;
    }
}
