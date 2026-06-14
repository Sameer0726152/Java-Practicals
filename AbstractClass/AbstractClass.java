abstract class Shape
{
    abstract double area();  
    
    abstract void display();
}
class Circle extends Shape
{
    double r;
    Circle(double r)
    {
        this.r = r;
    }
    double area()
    {
        return Math.PI * r * r;
    }

    void display()
    {
        System.out.println("Circle with radius: " + r);
    }
}
public class AbstractClass
{
    public static void main(String[] args)
    {
        Circle c = new Circle(5);
        System.out.println("Area of circle: " + c.area());
        c.display();
    }
}