import java.util.Scanner;

public class Es9_III_Sett{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci stringa : ");

		String frase = in.nextLine();
		
		String n3="";
		int num = 1,k=0;
		for(int i=0; i<frase.length(); i++){
			if(frase.charAt(i)==' '){
				num++; 
				if(num%2==0){
					String n1 = frase.substring(k,i+1);
					n3 += n1;
					n3+= "p";
					k = i+1;
				}	
			}
			
		}
		String n1 = frase.substring(k,frase.length());
		n3 += n1;

		System.out.println("Stringa risultante: "+n3);

		in.close();
	}
}
/*
String frase = in.nextLine();
		String n3="";
		int num = 1,k=0;
		for(int i=0; i<frase.length(); i++){
			if(frase.charAt(i)==' '){
				num++; 
				if(num%2==0){
					frase = inserisciInStringa(frase,"p",i);
				}	
			}
			
		}

		System.out.println("Stringa risultante: "+frase);

		in.close();
	}
	public static String inserisciInStringa(String n, String p,int pos){
		String n1 = n.substring(0,pos+1);
		String n2 = n.substring(pos+1,n.length());
		System.out.println(n1+p+n2);
		return (n1+p+n2);
	}
*/
