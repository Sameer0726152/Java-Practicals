import java.util.Scanner;
public class ATMSimulation
{
    static double balance = 10000.00;
    static void checkbalance()
    {
        System.out.println("Current balance is: " + balance);
    }

    static void deposit(double amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
        System.out.println("Balance is: " + balance);
    }

    static void withdraw(double amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(amount > balance)
        {
            throw new ArithmeticException("Amount cannot be greater than balance");
        }
        balance -= amount;
        System.out.println("Balance is: " + balance);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int choice = 0;
            do
            {
                System.out.println("Enter your choice");
                System.out.println("1: Check Balance");
                System.out.println("2: Deposit");
                System.out.println("3: Withdraw");
                System.out.println("4: Exit"); 
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                    checkbalance();
                    break;

                    case 2:
                    {
                        int amount = sc.nextInt();
                        deposit(amount);
                        break;
                    }

                    case 3:
                    {
                        int amount = sc.nextInt();
                        withdraw(amount);
                        break;
                    }

                    case 4:
                    System.out.println("Byee");
                    break;
                }
            }while(choice != 4);
        }catch(IllegalArgumentException | ArithmeticException e)
        {
            System.out.println("Invalid input" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Invalid input" + e.getMessage());
        }
        finally
        {
            System.out.println("DONE");
        }
        sc.close();
    }
}