public class Es8_VII_Sett{
    public static void main(String args[]){
        int num = 10;
        recPrint(num);
    }
    public static void recPrint(int num){
        if(num == 0){
            return;
            
        }else{
            num--;
            recPrint(num);
            System.out.print((num+1)+ " ");
            return;
        }
        
    }
    
}