import java.util.Scanner;
public class Ex5
{
    public static void main(String args[])
    {
        Scanner scan_input=new Scanner(System.in);
        String str=scan_input.nextLine();
        String []num=str.split(" ");
        long sum=0;
        for(int i=0;i<num.length;i++)
        {
            try
            {
                sum=sum+Integer.parseInt(num[i]);
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
                return;
            }
        }
        
        System.out.println("sum is "+sum);
    }
}
