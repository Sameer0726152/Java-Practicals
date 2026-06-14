import java.util.Scanner;
class product
{
    String name;
    double price;
    int quantity;
    double subtotal;

    product()
    {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = price * quantity;
    }

    void subtotal()
    {
        subtotal = price * quantity;
        System.out.println("Subtotal: " + subtotal);
    }

    void display()
    {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
public class ECommerce
{
    public static void main(String[] args)
    {
        double alltotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        int total = n + 3;
        product[] p = new product[total];
        p[0] = new product("Laptop", 50000, 1);
        p[1] = new product("Smartphone", 20000, 2);
        p[2] = new product("Headphones", 5000, 3);
        for(int i = 3; i < total; i++)
        {
            System.out.println("Enter product name: ");
            String name = sc.nextLine();
            System.out.println("Enter product price: ");
            double price = sc.nextDouble();
            System.out.println("Enter product quantity: ");
            int quantity = sc.nextInt();
            p[i] = new product(name, price, quantity);
            sc.nextLine();
        }
        for(int i = 0; i < total; i++)
        {   
            p[i].display();
            p[i].subtotal();
            alltotal += p[i].subtotal;
        }
        System.out.println("Total: " + alltotal);
        double discount = 0;
        if(alltotal > 120000)
        {
            alltotal = alltotal - (alltotal * 0.1);
            discount = 10;
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Total: " + alltotal);
        }
        else if(alltotal > 100000)
        {
            alltotal = alltotal - (alltotal * 0.05);
            discount = 5;
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Total: " + alltotal);
        }
        else
        {
            System.out.println("No discount applied.");
            System.out.println("Final Total: " + alltotal);
        }
    }
}