public class FactorGenerator{
    private int num;
    public FactorGenerator(int num){
        if(num>1){ 
            this.num = num;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public int nextFactor(){// dovro' andare a modificare nel main il dato
        boolean flag = true;
        if(!this.hasNextFactor()){
            throw new IllegalStateException();
        }else{
            for(int i=2; flag && i<=this.num ; i++ ){
                if(this.num%i==0){
                    flag = false;
                    return i;
                }
            }
        }
        return 1;
    }
    public boolean hasNextFactor(){
        if(this.num == 1){
            return false;
        }else{
            return true;
        }
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }

}