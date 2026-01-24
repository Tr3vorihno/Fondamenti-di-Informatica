
public class TesterDizionarioBoolean 
{
	
	
	public static void main(String[] args)
	{
		DizionarioBoolean and=new DizionarioBoolean();
		boolean risultato;
		
		//INSERIMENTO DATI
		boolean[] ingresso=new boolean[2];
		ingresso[0]=false;
		ingresso[1]=false;
		risultato=false;
		and.insert(ingresso, risultato);
		
		ingresso[0]=false;
		ingresso[1]=true;
		risultato=false;
		and.insert(ingresso, risultato);
		
		ingresso[0]=true;
		ingresso[1]=false;
		risultato=false;
		and.insert(ingresso, risultato);

		ingresso[0]=true;
		ingresso[1]=true;
		risultato=true;
		and.insert(ingresso, risultato);
		
		//STAMPA DATI DIZIONARIO AND
			System.out.println(and);
		
	}
}