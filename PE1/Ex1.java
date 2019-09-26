import java.util.Scanner;
public class Ex1
{
    public static void main(String []args)
    {
        Scanner scanner_input=new Scanner(System.in);
        System.out.println("enter number to check polindrome:");
        long i=scanner_input.nextLong();
        long t=i;
        long s=0;
        long r;
        long even_sum=0;
        while(t>0)
        {
            r=t%10;
            if(r%2==0)
            {
                even_sum=even_sum + r;
            }
            s=s*10+r;
            t=t/10;
        }
        if(s!=i)
        {
            System.out.println(i+" is not a polindrome");
        }
        else
        {
            if(even_sum>25)
            {
                System.out.println(i+" is palindrome and the sum of even numbers is greater than 25");
            }
            else
            {
                System.out.println(i+" is palindrome and the sum of even numbers is less than 25");
            }
        }
    }
}
