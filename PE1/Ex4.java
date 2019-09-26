import java.util.Scanner;
public class Ex4
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to print pattern:");
        int number=sc.nextInt();
        for(int j=1;j<=number;j++)
        {
            for(int k=1;k<=j;k++)
            {
                System.out.print(j+" ");
            }
        }
    }
}