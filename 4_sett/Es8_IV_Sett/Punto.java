public class Punto{

    private double x;
    private double y;

    Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distanzaTraDuePunti(Punto p1){
        return (Math.sqrt((Math.pow(p1.getX()-this.getX(),2))+(Math.pow(p1.getY()-this.getY(),2))));
    }
}