import java.util.Scanner;

public class ConsecutiveNumber {
    public boolean isConsecutiveNumber(String input)
    {
        String numbers[]=input.split(",");
        for(int index=0;index<numbers.length-2;index++)
        {
            if(Integer.parseInt(numbers[index])-Integer.parseInt(numbers[index+1])!=Integer.parseInt(numbers[index+1])-Integer.parseInt(numbers[index+2]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter numbers with commas separator : ");
        String numbers=scanner.nextLine();
        ConsecutiveNumber consecutiveNumber=new ConsecutiveNumber();
        if(consecutiveNumber.isConsecutiveNumber(numbers))
        {
            System.out.println(numbers+" are consecutive numbers");
        }
        else
        {
            System.out.println(numbers+" are non consecutive numbers");
        }


    }
}
