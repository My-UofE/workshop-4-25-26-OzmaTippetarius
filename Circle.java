public class Circle{
    //Atrributes
    private double radius;
    private double originX;
    private double originY;

    //Constructors
    public Circle(radius,originX,originY){
       this(radius, originX, originY);
    }

    public Circle(radius){
        this(radius,0,0);
    }

    public Circle(){
        this(1,0,0);
    }

    //methods
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if (radius>0){
            this.radius = radius;
        }
    }

    public double getOriginX(){
        return this.OriginX;
    }

    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return originY;
    }

    public double setOrignY(double originY){
        this.originY = originY;
    }

    public double getArea(){
        return ((radius*radius)*Math.PI());
    }

    public double getCircumference(){
        return(2*Math.PI()*radius);
    }

    public double move(double dx, double dy){
        originX += dx;
        originY += dy;
    }

    public String toString(){
        return "Circle [radius= "+radius+" x = "+originX+" y= "+originY"]";
    }

    public void scale(double scale){
        if (scale >0){
        radius = radius*scale;}
    }

    


}