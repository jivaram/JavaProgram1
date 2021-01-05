

package abstractshapclass;

abstract class Shap
{
   abstract public double area();
   abstract public double perimeter();
}
class circle extends Shap
{
    public double radius;
    @Override
    public double area(){return Math.PI*radius*radius;}

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
class rectangle extends Shap
{
    public double lenght;
    public double breath;
    @Override
    public double area(){return lenght*breath;}
    @Override
    public double perimeter()
    {
        return 2*(lenght+breath);
    }
    
}

public class AbstractShapClass {

    
    public static void main(String[] args) {
        // TODO code application logic here
        circle s1=new circle();
        Shap s=s1;
        s1.radius=5;
        System.out.println("Area of circle: "+s.area());
        rectangle s2=new rectangle();
        s2.lenght=10;
        s2.breath=5;
        System.out.println("Area of rectangle: "+s2.area());
    }
    
}
