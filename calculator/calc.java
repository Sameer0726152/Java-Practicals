import java.util.Scanner;
import java.util.InputMismatchException;

public class calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String operator;
        double result = 0;
        boolean valid = true;
        try
        {
            System.out.println("Input first number: ");
            a = sc.nextInt();
            System.out.println("Input second number: ");
            b = sc.nextInt();
            System.out.println("Input operator: ");
            operator = sc.next();

            switch(operator)
            {
                case "+":
                result = a + b;
                break;

                case "-":
                result = a - b;
                break;

                case "*":
                result = a * b;
                break;

                case "/":
                try
                {
                    result = a / b;
                } catch(ArithmeticException e)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
                default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                valid = false;
            }
        }catch(InputMismatchException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
            valid = false;
            sc.next();
        }
        if (valid)
        {
            System.out.println("Result: " + result);
        }
    }
}