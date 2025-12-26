package Sett_9.Es6_IX_Sett;
public class TimeDepositAccount extends SavingsAccount{
    public TimeDepositAccount(double rate, int time, double initialBalance){
        super(initialBalance,rate);
        this.time = time;
    }
    private int time;
    public boolean equals(TimeDepositAccount t){
        if(super.equals((SavingsAccount) t) && this.time == t.getTime()) return true;
        return false;
    }
    public int getTime(){
        return this.time;
    }
    public void decurtTime(){
        this.time--;
    }
    public void withdraw(int amount ){
        if(this.time>0) super.withdraw(amount+20);
        else{super.withdraw(amount);}
    }
}