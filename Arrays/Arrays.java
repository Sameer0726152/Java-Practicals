import java.util.Scanner;
public class Arrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        System.out.print("[ ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println(" ]");
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array is: " + min);
        System.out.println("Maximum element in the array is: " + max);

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of the elements in the array is: " + sum);
        double avg = (double)sum / n;
        System.out.println("Average of the elements in the array is: " + avg);

        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("Element found at index: " + (i+1));
                found = true;
                break;
            }
            else
            {
                found = false;
            }
        }
        if(!found)
        {
            System.out.println("Element not found in the array.");
        }
    }

}