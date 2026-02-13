public class CircleApp{
    public static void main( String[] args ){
       System.out.println("Creating circles:");
       Circle c1 = new Circle(4,3,2);
       Circle c2 = new Circle(2);
       Circle c3 = new Circle();
       Circle c4 = new Circle (1,18,24);

       System.out.println("c1: "+c1.toString());
       System.out.println("c2: "+c2.toString());
       System.out.println("c3: "+c3.toString());
       System.out.println("c4: "+c4.toString());

       System.out.println("Getter methods:");
       System.out.println("c1 radius = "+c1.getRadius()+" c1 originX = "+c1.getOriginX()+" c1 originY = "+c1.getOriginY());
       System.out.println("c1 area = "+c1.getArea()+" c1 circumference = "+c1.getCircumference());

       System.out.println("Setter methods:");
       c1.setRadius(8);
       c1.setOriginX(8);
       c1.setOriginY(8);
       c1.setRadius(-7);
       System.out.println("c1: "+c1.toString());

       System.out.println ("Moving c1:");
       c1.move(-5,-6);
       System.out.println("c1: "+c1.toString());

       System.out.println ("Scaling c1:");
       c1.scale(0.5);
       c1.scale(-7);
       System.out.println("c1: "+c1.toString());

       System.out.println("isOverlappedWith method:");
       System.out.println("c1 and c2: "+c1.isOverlappedWith(c2));
       System.out.println("c2 and c3: "+c2.isOverlappedWith(c3));
       System.out.println("c3 and c4: "+c3.isOverlappedWith(c4));

       System.out.println("isEnclosedBy method:");
       System.out.println("c1 and c2: "+c1.isEnclosedBy(c2));
       System.out.println("c2 and c3: "+c2.isEnclosedBy(c3));
       System.out.println("c3 and c4: "+c3.isEnclosedBy(c4));
    }
}