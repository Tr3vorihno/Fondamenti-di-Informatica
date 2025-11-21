
public class QuadraticEquation{

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSolution1(){//-b + sqrt(delta)/(2a)
        if(this.a == 0 && this.b ==0 && this.c == 0){
            return -10001; // infinite soluzioni
        }
        if(this.a == 0 && this.b !=0){
            return (this.c/this.b);
        }
        if(this.a == 0 && this.b ==0 && this.c != 0){
            return -10002; // infinite soluzioni
        }
        
        if(this.hasSolutions()){
            return (((-1*this.b)+(Math.sqrt(this.getDelta())))/(2*this.a));
        }else{
            return -10000;// soluzione inesistente
        }
    }
    public double getSolution2(){//-b - sqrt(delta)/(2a)
        if(this.a == 0 && this.b ==0 && this.c == 0){
            return -10001; // infinite soluzioni
        }
        if(this.a == 0 && this.b !=0){
            return (this.c/this.b);
        }
        if(this.a == 0 && this.b ==0 && this.c != 0){
            return -10002; // nessuna soluzioni
        }
        if(this.hasSolutions()){
            return (((-1*this.b)-(Math.sqrt(this.getDelta())))/(2*this.a));
        }else{
            return -10000;// soluzione inesistente
        }
    }
    public boolean hasSolutions(){
        if(this.getDelta()>=0) return true;
        else{return false;}
    }

    public double getDelta(){
        return (Math.pow(this.b,2)-(4*this.a*this.c));
    }

    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public String toString(){
        return "Eq: "+getSign(this.a)+" "+this.a+"x^2 "+getSign(this.b)+" "+this.b+"x "+getSign(this.c)+" "+this.c;
    }
    public String getSign(double a){// funzione per stampare bene
        if(a<0)return "";
        else{return "+";}
    }
    public String parseSolution(double sol){
        String ris = "";
        switch(((int)sol)){
            case -10000:
            case -10002:{
                ris = "Soluzione inesistente";
                break;
            }
            case -10001:{
                ris = "Soluzione infinite";
                break;
            }
            default:{
                ris = ""+sol;
            }
        }
        return ris;
    }
}

