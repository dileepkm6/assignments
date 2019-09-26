import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCheck {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scanner.nextInt();
        try
        {
            int []array=new int[n];
            System.out.println(array[1]);
            String str=null;
            System.out.println(str.toString());


        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Negative array size of exception");
        }
        catch (InputMismatchException e)
        {
            System.out.println("mismatch exception");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("index out of Exception");
        }
	catch (NullPointerException e)
        {
            System.out.println("null pointer Exception");
        }

    }
}
