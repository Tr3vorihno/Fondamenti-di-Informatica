
public class Triangolo{
   /*
      Construttore della classe Triangolo
   */
    private double la;
    private double lb;
    private double lc;

    public Triangolo (double la, double lb, double lc){
        this.la = la;
        this.lb = lb;
        this.lc = lc;
    }

   /*
      restituisce informazioni sul triangolo. le informazioni sono relative
      ai lati:     equilatero,  isoscele,    scaleno.
      agli angoli: acutangolo,  rettangolo,  ottusangolo.
      Esempio: per il triangolo di lati 3, 4, 5 restituisce la stringa
      "scaleno rettangolo".
   */
    public String info(){
        String ris = "";
        double deh = 0;
        if(this.la == this.lb && this.la == this.lc){
            ris += "Equilatero ";
        }else{
            if(this.la == this.lb || this.la == this.lc){
                ris += "Isoscele ";
                if(this.lb>this.lc){// lb maggiore
                    ris+= infoAngoli(this.lb,this.la,this.lc);
                }else{//lc maggiore
                    if(this.la>this.lc){
                        ris+= infoAngoli(this.la,this.lc,this.lb);
                    }else{
                        ris+= infoAngoli(this.lc,this.la,this.lb);
                    }
                    
                }
               
            }else{
                ris += "Scaleno ";
                if(this.la>this.lb && this.la > this.lc){// la maggiore
                    if(this.lb>this.lc){// lb mezzo lc minore
                        ris+= infoAngoli(this.la,this.lb,this.lc);
                    }else{// lc mezzo lb minore
                        ris+= infoAngoli(this.la,this.lc,this.lb);
                    }
                }else{
                    if(this.la<this.lb && this.lb > this.lc){// lb maggiore
                        if(this.la>this.lc){// la mezzo lc minore
                            ris+= infoAngoli(this.lb,this.la,this.lc);
                        }else{// lc mezzo la minore
                            ris+= infoAngoli(this.lb,this.lc,this.la);
                        }
                    }else{// lc maggiore
                        if(this.lb>this.la){// lb mezzo la minore
                            ris+= infoAngoli(this.lc,this.lb,this.la);
                        }else{// la mezzo lb minore
                            ris+= infoAngoli(this.lc,this.la,this.lb);
                        }
                    }
                }
                
            }
        }
        return ris;
    }
   
   /*
      restituisce una stringa contenente una descrizione testuale dell'oggetto
      nel formato T(a, b, c)
      Esempio "T(3, 4, 5)"
   */
    public String toString (){
        return "T("+this.la+", "+this.lb+", "+this.lc+")";
    }

    /*
       calcola e restituisce l'area del triangolo.
       Usa la formula di Erone:
            area * area = p * (p - a) * (p - b) * (p - c)
       dove p e` il semiperimetro, ovvero p = (a + b + c) / 2
    */
    public double area(){
        double sem_p = this.semi_perimetro();
	    return (Math.sqrt(sem_p*(sem_p-this.la)*(sem_p-this.lb)*(sem_p-this.lc)));
    }
   
    /*
       calcola e restituisce l'altezze del triangolo relativa al lato maggiore:
    */
    public double h(){
       double area = this.area();
       double altezza = 0;
        if(this.la>this.lb && this.la>this.lc){
            altezza = ((2*area)/la);
        }else{
                if(this.lb>this.la && this.lb>this.lc){
                    altezza = ((2*area)/lb);
                }else{
                    altezza = ((2*area)/lc);
                }
        }
        return altezza;
    }
    public double semi_perimetro(){
        return ((this.la+this.lb+this.lc)/2);
    }

    public String infoAngoli(double c,double b, double a){
        if(c * c - a* a - b * b > 0) return "ottusangolo";
        if((c * c) - (a* a) - (b * b) == 0) return "rettangolo";
        else{return "acutangolo";}
    }
}

