import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MultipleOccurence
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string:");
        String string=scanner.nextLine();
        System.out.println("enter pattern:");
        String regex=scanner.next();
        scanner.close();
        int len=regex.length();
        //setting the pattern
        Pattern pattern = Pattern.compile(regex);
        //setting the matcher
        Matcher matcher=pattern.matcher(string);
        try
        {
            while(matcher.find())
            {
                int startIndex=matcher.start();
                System.out.println("Found at "+startIndex+"-"+(startIndex+len));
            }
        }
        catch(IllegalStateException e)
        {
            e.printStackTrace();
        }
    }
}