public class Es7_VII_Sett{
    public static void main(String[] args){
        String s = args[0];
        recStringInverter(s,s.length());
        System.out.println("");
    }
    public static void recStringInverter(String str, int pom){
        if(pom != 0){
            pom--;
            System.out.print(str.charAt(pom));
            recStringInverter(str,pom);
        }
        return ;
    }
}