import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceSorting6
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of set :");
        int n=scanner.nextInt();
        Set<String> hashSet=new HashSet<>();
        System.out.println("Enter "+n+" string elements :");
        for(int i=0;i<n;i++)
        {
            hashSet.add(scanner.next());
        }
        System.out.println("before Sorting:");
        Iterator<String> iter=hashSet.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        Set<String> treeSet=new TreeSet<>(hashSet);
        Iterator<String> it=treeSet.iterator();
        List<String> arrayList=new ArrayList<>();
        System.out.println("After Sorting:");
        while(it.hasNext())
        {
            String temp=it.next();
            System.out.print(temp+" ");
            arrayList.add(temp);

        }
        System.out.println("\nArrayList :");
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }
    }
    
}