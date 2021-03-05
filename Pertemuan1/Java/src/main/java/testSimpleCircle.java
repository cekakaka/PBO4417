/*

NAMA  : DWI CANDRA KIRANA
NIM   : A11.2019.11759
KELAS : PBO_4417

*/ 
/**
 *
 * @author dwica
 */
class SimpleCircle{
    //field
    double radius;
    
    //construtor
    public SimpleCircle(double newRadius){
        radius = newRadius;
    }

    SimpleCircle() {
        
    }

   // get method
    public double getArea(){
        return radius * radius * Math.PI;       
    }
    
    //get method
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    //set method
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    
}

public class testSimpleCircle {
   
    
    public static void main(String args[]) {
        // Default Radius
        SimpleCircle myCircle1 = new SimpleCircle();
        myCircle1.getArea();
        System.out.println("Area Of The Circle 1 of Radius "+ myCircle1.radius + " is = "+ myCircle1.getArea());
        
        // Set Radius 9
        SimpleCircle myCircle2 = new SimpleCircle();
        myCircle2.setRadius(9);
        myCircle2.getArea();
        System.out.println("Area Of The Circle 2 of Radius "+ myCircle2.radius + " is = "+ myCircle2.getArea());
        
        // Set Radius 28
        SimpleCircle myCircle3 = new SimpleCircle();
        myCircle3.setRadius(28);
        myCircle3.getArea();
        System.out.println("Area Of The Circle 3 of Radius "+ myCircle3.radius + " is = "+ myCircle3.getArea());
        
        //Modify Circle Radius 
        myCircle1.radius = 57;
        myCircle1.getArea();
        System.out.println("Area Of The Circle 1 of Radius "+ myCircle1.radius + " is = "+ myCircle1.getArea());
        
        
        // Set Radius 18 n getParimeter
        SimpleCircle myCircle4 = new SimpleCircle();
        myCircle4.setRadius(18);
        myCircle4.getPerimeter();
        System.out.println("Perimeter of The Circle 4 of Radius "+ myCircle4.radius + "is = "+myCircle4.getPerimeter());
        
        
        
    }
}

