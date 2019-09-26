import java.util.Scanner;
public class FactorialList
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        FactorialList factorialList=new FactorialList();
        System.out.println("INT Factorials:");
        System.out.println("Max Values of integer is "+Integer.MAX_VALUE);
        int number=1;
        while(true){
            System.out.println("factorial of "+number+" is "+factorialList.factorialInt(number++));
            if(number>13)
            {
                System.out.println("factorial of "+number+" is out of range");
                break;
            }
        }
        number=1;
        System.out.println("..............\nLONG Factorials:");
        System.out.println("Max Values of integer is "+Long.MAX_VALUE);
        while(true){
            System.out.println("factorial of "+number+" is "+factorialList.factorialLong(number++));
            if(number>20)
            {
                System.out.println("factorial of "+number+" is out of range");
                break;
            }
        }

    }
    public int factorialInt(int number)
    {
        if(number==0)
        return 1;
        return number*factorialInt(number-1);
    }
    public long factorialLong(long number)
    {
        if(number==0)
        {
            return 1;
        }
        return number*factorialLong(number-1);
    }
}