// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
public Rectangle(double width, double height) {
    this(width, height, 0, 0);
}

// third constructor: 
public Rectangle() {
    this(1,1,0,0);
}

  //method: get width
  public double getWidth(){
    return this.width;
  }

  //method: set width
  public void setWidth(double width){
    if (width > 0){
    this.width = width;}
  }

  //method get height
  public double getHeight(){
    return this.height;
  }

  //method: set height
    public void setHeight(double height){
      if (height > 0){
      this.height = height;}
    }

  //method: get originX
  public double getOriginX(){
    return this.originX;
  }

  //method set originX
  public void setOriginX(double originX){
    this.originX = originX;
  }

  //method get originY
  public double getOriginY(){
    return this.originY;
  }

  //method set originY
  public void setOriginY(double originY){
    this.originY = originY;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  //method: scale the rectangle with 2 scaling factors
  public void scale (double scaleX, double scaleY) {
    width = width*scaleX;
    height = height*scaleY;
  }

  //method: scale the rectangle with 1 scaling factor
  public void scale (double scaleXY){
    width = width*scaleXY;
    height = height*scaleXY;
  }

  //method: check if rectangles overlap
  public boolean isOverlappedWith (Rectangle r){
  double leftmost = this.originX + this.width/2;
  double rightmost = this.originX - this.width/2;
  double highest = this.originY + this.height/2;
  double lowest = this.originY - this.height/2;

  double leftmostR = r.originX + r.width/2;
  double rightmostR = r.originX - r.width/2;
  double highestR = r.originY + r.height/2;
  double lowestR = r.originY - r.height/2;
  
  if (this.originX >= r.originX) {
    if (leftmostR >= rightmost){
      return true;
    }
  } else if (this. originX <= r.originX){
    if (rightmostR <= leftmost){
      return true;
    }
  } else if (this.originY >= r.originY){
    if (lowest <= highestR){
      return true;
    }
  } else if (this.originY <= r.originY){
    if (highest >= lowestR){
      return true;
    }
  } else {
    return false;
  }
  return false;
}

//method: check if rectangles overlap (static)
public static boolean areOverlapping (Rectangle r1, Rectangle r2){
  if (r1.isOverlappedWith(r2)){
    return true;
  } else {
    return false;
  }
}

//method: find ratio of width to height
public double calcRatio(){
  return width/height;
}

//method: determine if a rectangle is square
public boolean isSquare(){
  if (this.calcRatio() >= 0.999 && this.calcRatio() <= 1.001){
    return true;
  } else {
    return false;
  }
}

// Return a description of a rectangle in the form of
// Rectangle[x=*,y=*,w=*,h=*]
public String toString(){
return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
}
  
}
