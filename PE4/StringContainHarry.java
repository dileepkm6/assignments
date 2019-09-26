import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringContainHarry
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string:");
        String string=scanner.nextLine();
        scanner.close();
        StringContainHarry stringContainHarry=new StringContainHarry();
        if(stringContainHarry.isHarryHere(string,"Harry"))
        {
            System.out.println("Is Harry here ? true");
        }
        else
        {
            System.out.println("Is Harry here ? False");
        }
    }
    public boolean isHarryHere(String string,String subString)
    {
        Pattern pattern=Pattern.compile(subString);
        Matcher matcher=pattern.matcher(string);
        if(matcher.find())
        {
            return true;
        }
        return false;
    }
}