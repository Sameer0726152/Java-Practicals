public class MethodOverloading
{
    static int power(int base, int exp)
    {
        int result = 1;
        for(int i = 0; i < exp; i++)
        {
            result *= base;
        }
        return result;
    }

    static float power(float base, int exp)
    {
        float result = 1;
        for(int i = 0; i < exp; i++)
        {
            result *= base;
        }
        return result;
    }

    static double power(double base, int exp)
    {
        double result = 1;
        for(int i = 0;i < exp; i++)
        {
            result *= base;
        }
        return result;
    }

    static int absolute(int num)
    {
        if(num < 0)
        {
            return -num;
        }
        else
        {
            return num;
        }
    }
    static float absolute(float num)
    {
        if(num < 0)
        {
            return -num;
        }
        else
        {
            return num;
        }
    }
    static double absolute(double num)
    {
        if(num < 0)
        {
            return -num;
        }
        else
        {
            return num;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Power of 2 to the 3: " + power(2, 3));
        System.out.println("Power of 2.5 to the 3: " + power(2.5f, 3));
        System.out.println("power of 2.3 to the 3: "  + power(2.3, 3));
        System.out.println("Absolute of -5: " + absolute(-5));
        System.out.println("Absolute of -5.5: " + absolute(-5.5f));
        System.out.println("Absolute of -5.5: " + absolute(-5.5));
    }
}