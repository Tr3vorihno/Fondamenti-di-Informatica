package Sett_7;

public class Es3_VII_Sett{
    public static void main(String[] args){
        
        String s1 = args[0], s2 = args[1];
        String fin="";
        int len_max=0;
        if(s1.length()<s2.length()){// imposto s1 come stringa di lunghezza maggiore
            String h = s2;
            s2 = s1;
            s1 = h;
        }
        for(int i=0; i<s2.length(); i++){
            for(int j=i+1; j<s2.length()+1; j++){
                String f = s2.substring(i,j);
                if(checkStr(s1,f) && len_max<f.length()){
                    fin = f;
                    len_max = fin.length();
                }
                
            }
        }
        
        System.out.println("Sottostringa max: "+fin);
    }

    public static boolean checkStr(String n, String sub){// controlla se una sottostringa e' presenta in una stringa
        int dim = sub.length();
        for(int j=0; j<n.length()-dim+1;j++){
            String g = n.substring(j,j+dim);
            if(g.equals(sub)){
                return true;
            } 
        } 
        return false;
    }
}