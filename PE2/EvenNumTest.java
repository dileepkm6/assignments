import java.util.Scanner;
public class EvenNumTest
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number to  check even or odd:");
        int number=scanner.nextInt();
        boolean iseven=isEven(number);
        if(iseven)
        {
            System.out.println(number+" is even");
        }
        else
        {
            System.out.println(number+" is odd");
        }

    }
    public static boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}