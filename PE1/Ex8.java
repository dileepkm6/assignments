import java.util.Scanner;
public class Ex8
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter target Number:");
        int t=sc.nextInt();
        System.out.println("enter guess  number btw 1-100\n");
        while(true)
        {
            int n=sc.nextInt();
            if(n==t)
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
            else if(n>t)
            {
                System.out.println("Number guessed is greater than original number");
            }
            else
            {
                System.out.println("Number guessed is less than original number");
            }
        }
        
        
    }
}