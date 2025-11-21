
/*
    L'insieme C dei numeri complessi e' l'insieme delle coppie ordinate (x,y) 
    con x e y appartenenti a R (insieme dei numeri reali).
    Dato il numero complesso z = x + i *y,  i numeri reali x e y sono detti
    parte reale e parte immaginaria di z.
    Nei commenti che seguono, facciamo riferimento ai numeri complessi
        z = x + i*y, z1 = x1 + i*y1, z2 = x2 + i*y2
*/

public class MyComplex{
    private final double EPSILON = 0.001;
    private double realPart;
    private double imagPart;
    // inizializza il numero complesso al valore 0 + i0 (zero complesso)
    public MyComplex(){
        this.realPart = 0;
        this.imagPart = 0;
    }

    // inizializza il numero complesso al valore re + i*im
    public MyComplex(double realPart, double imagPart){
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    //Somma a questo numero complesso il numero complesso z
    //somma di due complessi: z = z1+z2 = (x1+x2) + i(y1+y2)
    public MyComplex add(MyComplex z){
        double i = z.getIm()+this.getIm();
        double r = z.getRe()+this.getRe();
       return new MyComplex(r,i);
    }

    //Sottrae a questo numero complesso il numero complesso z
    //sottrazione di due complessi: z = z1-z2 = (x1-x2) +i(y1-y2)
    public MyComplex sub(MyComplex z){
        double i = z.getIm()-this.getIm();
        double r = z.getRe()-this.getRe();
       return new MyComplex(r,i);
    }

    //Moltiplica questo numero complesso per il numero complesso z
    //prodotto di due complessi: z = z1*z2 = (x1*x2 -y1*y2) + i*(x1*y2 + x2*y1)
    public MyComplex mult(MyComplex z){
        double i = ((z.getRe()+this.getRe())-z.getIm()*this.getIm());
        double r = ((z.getRe()*this.getIm())+(z.getIm()*this.getRe()));
       return new MyComplex(r,i);
    }

    //Divide questo numero complesso per il numero complesso z
    //divisione fra due complessi: z1/z2 = z1 *1/z2, per z2 != 0
    public MyComplex div(MyComplex z){
        if(z.inv().getRe()!=0 && z.inv().getIm()!=0) return this.mult(z.inv());
        return null;
    }
          
    //Calcola il coniugato di questo numero complesso
    //coniugato del complesso z:  z^= x - i*y
    public MyComplex conj(){
       return new MyComplex(this.getRe(),this.getIm()*-1);
    }
          
    //Calcola l'inverso rispetto al prodotto di un numero complesso
    //inverso del complesso z: 1/z = x/(|z|*|z|) -i*y/(|z|*|z|), per z != 0
    public MyComplex inv(){
        if(this.getRe()!=0 && this.getIm()!=0){
            double i = (this.getRe()/(Math.pow(this.mod(),2)));
            double r = -1*(this.getIm()/(Math.pow(this.mod(),2)));
            return new MyComplex(r,i);
        }
        return null;
    }   

    //Calcola il modulo di questo numero complesso
    //modulo del complesso z: |z| = sqrt( x*x + y*y).
    public double mod(){
        double i = ((this.getRe()+this.getRe())-this.getIm()*this.getIm());
        double r = ((this.getRe()*this.getIm())+(this.getIm()*this.getRe()));
        return Math.sqrt(i+r);
    }
           
    //Confronta con tolleranza due numeri complessi.
    public boolean approxEquals(MyComplex z){
        if(this.getRe()-z.getRe()<=EPSILON && this.getIm()-z.getIm() <= EPSILON) return true;
        return false;  //completare
    }

    //Crea una stringa che rappresenta questo numero complesso
    //Formato stringa: parte reale + i*parte immaginaria
    public String toString(){
        return "Re: "+this.getRe()+" Im: "+this.getIm();  //completare
    }


    //-------- metodi di accesso ----------
          
    //Restituisce la parte complessa di un numero complesso
    public double getIm(){
        return this.imagPart;  //completare
    }
    //Restituisce la parte reale di un numero complesso
    public double getRe(){
        return this.realPart;
    }
}

