public class BranoTester{
    public static void main(String args[]){
        Brano b[] = new Brano[3];
        b[0] = new Brano("One","Metallica",8,"Rock",1988,103);
        b[1] = new Brano("Us and Them","Pink Floyd",8,"Rock",1974,72);
        b[2] = new Brano("Lithium","Nirvana",4,"Grunge",1992,124);
        
        for(int i=0; i<3; i++){
            
            System.out.println("Brano "+(i+1)+"\n"+b[i].toString());
            System.out.println("Analisi brano "+(i+1)+"\n"+b[i].analizzaBrano());
        }
    }
}