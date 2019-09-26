//Exercise 2
import java.util.Scanner;
public class PowerOfFour
{
    public static void main(String []args)
    {
        Scanner scan_input=new Scanner(System.in);
        System.out.println("enter number:");
        int number=scan_input.nextInt();
        PowerOfFour obj=new PowerOfFour();
        if(obj.is_Power_of_4(number))
        {
            System.out.println(number+" is the power of 4");
        }
        else
        {
            System.out.println(number+" is not the power of 4");
        }
    }
    boolean is_Power_of_4(int number)
    {
        while(number!=1)
        {
            if(number%4!=0)
            {
                return false;
            }
            number=number/4;
        }
        return true;
    }
}