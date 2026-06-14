interface Shape
{
    void area();
    void perimeter();
    void display();
}

class Circle implements Shape
{
    double r;
    Circle(double r)
    {
        this.r = r;
    }
    public void area()
    {
        System.out.println("Area of circle: " + (Math.PI * r * r));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of circle: " + (2 * Math.PI * r));
    }
    public void display()
    {
        System.out.println("Circle with radius: " + r);
    }
}

class Rectangle implements Shape
{
    double l;
    double b;
    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }
    public void area()
    {
        System.out.println("Area of rectangle: " + (l * b));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle: " + (2 * (l + b)));
    }
    public void display()
    {
        System.out.println("Rectangle with length: " + l + " and breadth: " + b);
    }
}
public class interfacepolymorphism
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape[] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;
        for(Shape s : shapes)
        {
            s.display();
            s.area();
            s.perimeter();
            System.out.println();
        }
    }
}