import java.util.Scanner;
import java.lang.StringBuffer;
public class ReverseInput
{
    public static void main(String []args)
    {
        Scanner s_input=new Scanner(System.in);
        System.out.println("enter string:");
        String input=new String();
        input=s_input.next();
        ReverseInput obj=new ReverseInput();
        String rev_string=obj.reverse(input);
        if(input.equals(rev_string))
        {
            System.out.print(input+" is a polindrome");
        }
        else{
            System.out.println(input+" is not a polindrome");
        }
    }
    String reverse(String input)
    {
        int for_index=0;
        int rev_index=input.length()-1;
        while(for_index<rev_index)
        {
            if(rev_index==input.length()-1)
            {
                input=input.substring(0,for_index)+input.charAt(rev_index)+input.substring(for_index+1,rev_index)+input.charAt(for_index);

            }
            else
            {
                input=input.substring(0,for_index)+input.charAt(rev_index)+input.substring(for_index+1,rev_index)+input.charAt(for_index)+input.substring(rev_index+1,input.length());
            }
            for_index++;
            rev_index--;
            
        }
        return input;
    }
}