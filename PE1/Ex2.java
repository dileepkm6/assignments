import java.util.Scanner;
public class Ex2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i>20 && i<30)
        {
            if(i%2!=0)
            {
                System.out.println("Tom");
            }
            else
            {
                System.out.println("jerry");
            }
        }
        else
        {
            System.out.println("number is not between 20 and 30");
        }
    }
}