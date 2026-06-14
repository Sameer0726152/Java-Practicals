import java.util.Scanner;
class Animals
{
    String name;
    Animals(String name)
    {
        this.name = name;
    }

    void eat()
    {
        System.out.println(name + " is Eating");
    }

    void info()
    {
        System.out.println("Is is a " + name);
    }
}
class Dog extends Animals
{
    String breed;
    void bark()
    {
        System.out.println("Dog is barking");
    }
    Dog(String name, String breed)
    {
        super(name);
        this.breed = breed;
    }
    @Override
    void info()
    {
        System.out.println("Name is: " + name);
        System.out.println("Breed is: " + breed);
    }
}
public class singleinheritance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Animals a = new Animals("Monkey");
        a.eat();
        a.info();

        System.out.println("Enter your dogs name: ");
        String n = sc.nextLine();
        System.out.println("Enter your dogs breed: ");
        String b = sc.nextLine();
        Dog d3 = new Dog(n, b);

        Dog d1 = new Dog("Max", "Labrador");
        Dog d2 = new Dog("Cupcake", "Pitbull");
        Dog[] dogs = new Dog[3];
        dogs[0] = d1;
        dogs[1] = d2;
        dogs[2] = d3;
        for(Dog d : dogs)
        {
            d.eat();
            d.bark();
            d.info();
            System.out.println("");
        }
    }
}