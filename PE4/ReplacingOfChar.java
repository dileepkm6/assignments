import java.util.Scanner;
public class ReplacingOfChar
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string :");
        String string=scanner.nextLine();
        scanner.close();
        //replacing all d with f
        string=string.replace('d', 'f');
        //replacing l with t
        string = string.replace('l', 't');
        System.out.println("String after replacing d and l: "+string);

    }
}