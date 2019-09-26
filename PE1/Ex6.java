import java.util.Scanner;
public class Ex6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>=65 && c<=90)
        {
            System.out.println("Capital Letter");
        }
        else if(c>=97 && c<=122)
        {
            System.out.println("Small Letter");
        }
        else if(c>=48 && c<=57)
        {
            System.out.println("Digits");
        }
        else
        {
            System.out.println("Special Symbol");
        }
        
    }
}