import java.util.Scanner;
public class Ex10
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String:");
        String str=sc.nextLine();
        System.out.println("enter number:");
        int n=sc.nextInt();
        int l=str.length();
        if(n<=l)
        {
            String substr=str.substring(l-n,l);
            for(int i=0;i<n;i++)
            {
                str=str+substr;
            }
            System.out.println(str);
            
        }
        else
        {
            System.out.println("input integer is greater than length of string");
        }
        
    }
}