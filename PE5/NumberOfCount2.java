import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NumberOfCount2
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string :");
        String inputStr=scanner.nextLine();
        inputStr=inputStr.replaceAll("[-_,@#$.!?*\"\"\";:]+", " ");
        System.out.println(inputStr);
        String []wordArray=inputStr.trim().split(" ");
        Map<String,Integer> hashMap=new HashMap<>();
        for(String str:wordArray)
        {
            if(str.trim().equals(""))
            {
                continue;
            }
            else if(hashMap.containsKey(str.trim()))
            {
                hashMap.put(str.trim(), hashMap.get(str.trim())+1);
            }
            else
            {
                hashMap.put(str.trim(),1);
            }
        }
        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
