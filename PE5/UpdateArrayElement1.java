import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UpdateArrayElement1
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n=scanner.nextInt();
        System.out.println("enter "+n+" elements:");
        String []strArray=new String[n];
        for(int i=0;i<n;i++)
        {
            strArray[i]=scanner.next();
        }
        List<String> arrayList=new ArrayList<>(Arrays.asList(strArray));
        System.out.println("new arraylist:");
        System.out.println("Enter string to be replaced:");
        String strToReplace=scanner.next();
        System.out.print("Enter new elements:");
        String newStr=scanner.next();
        scanner.close();
        System.out.println(arrayList.contains(strToReplace));
        if(arrayList.contains(strToReplace))
        {
            arrayList.set(arrayList.indexOf(strToReplace),newStr);
        }
        else
        {
            System.out.println("array doesn't contain "+strToReplace);
        }
        Iterator<String> it=arrayList.iterator();
        System.out.println("new arraylist:");
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        arrayList.clear();
        System.out.println("after emptying arrayList:"+arrayList);
    }
}