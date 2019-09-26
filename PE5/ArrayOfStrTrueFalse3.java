import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ArrayOfStrTrueFalse3
{
    public static void main(String []args)throws InputMismatchException
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of string array:");
        int n=scanner.nextInt();
        System.out.println("enter "+n+" string elements :");
        String []wordArray=new String[n];
        Map<String,Boolean> hashMap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            wordArray[i]=scanner.next();
        }
        for(String str:wordArray)
        {
            if(hashMap.containsKey(str))
            {
                hashMap.put(str, true);
            }
            else
            {
                hashMap.put(str, false);
            }
        }
        for(Map.Entry<String,Boolean> entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}