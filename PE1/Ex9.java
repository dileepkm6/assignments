import java.util.Scanner;
public class Ex9
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length()-1;
        int f=0;
        while(f<l)
        {
            if(l==str.length()-1)
            {
                str=str.substring(0,f)+str.charAt(l)+str.substring(f+1,l)+str.charAt(f);
            }
            else
                str=str.substring(0,f)+str.charAt(l)+str.substring(f+1,l)+str.charAt(f)+str.substring(l+1,str.length());
            f++;
            l--;
        }
        System.out.println(str);
    }
}