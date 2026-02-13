public class Circle{
    //Atrributes
    private double radius;
    private double originX;
    private double originY;

    //Constructors
    public Circle(double radius,double originX,double originY){
       this.radius = radius;
       this.originX = originX;
       this.originY = originY;
    }

    public Circle(double radius){
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
        return this.originX;
    }

    public void setOriginX(double originX){
        this.originX = originX;
    }

    public double getOriginY(){
        return originY;
    }

    public void setOriginY(double originY){
        this.originY = originY;
    }

    public double getArea(){
        return ((radius*radius)*Math.PI);
    }

    public double getCircumference(){
        return(2*Math.PI*radius);
    }

    public void move(double dx, double dy){
        originX += dx;
        originY += dy;
    }

    public String toString(){
        return "Circle [radius= "+radius+" x = "+originX+" y= "+originY+"]";
    }

    public void scale(double scale){
        if (scale >0){
        radius = radius*scale;}
    }

    public boolean isOverlappedWith(Circle c){
        double leftmost = this.originX + this.radius;
        double rightmost = this.originX - this.radius;
        double highest = this.originY + this.radius;
        double lowest = this.originY -this.radius;

        double leftmostC = c.originX + c.radius;
        double rightmostC = c.originX - c.radius;
        double highestC = c.originY + c.radius;
        double lowestC = c.originY - c.radius;

        if (this.originX >= c.originX){
            if (leftmostC >= rightmost){
                return true;
            }
        }
        if (this.originX <= c.originX){
            if (rightmostC <= leftmost){
                return true;
            }
        }
        if (this.originY >= c.originY){
            if (highestC >= lowest){
                return true;
            }
        }
        if (this.originY <= c.originY){
            if (lowestC <= highest){
                return true;
            }
        }
        return false;
    }

    public boolean isEnclosedBy(Circle c){
        double leftmost = this.originX + this.radius;
        double rightmost = this.originX - this.radius;
        double highest = this.originY + this.radius;
        double lowest = this.originY -this.radius;

        double leftmostC = c.originX + c.radius;
        double rightmostC = c.originX - c.radius;
        double highestC = c.originY + c.radius;
        double lowestC = c.originY - c.radius;

        if (leftmost < leftmostC && rightmost < rightmostC && highest < highestC && lowest < lowestC){
            return true;
        }
        return false;
    }


}