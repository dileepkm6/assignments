import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapObjectTwoValue5
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two String elements of Map:");
        Map<String,String> hashMap=new HashMap<>();
        for(int i=0;i<2;i++)
        {
            hashMap.put("val"+(i+1), scanner.next());
        }
        System.out.println("Before changes:");
        System.out.println(hashMap);
        MapObjectTwoValue5 mapObj=new MapObjectTwoValue5();
        hashMap=mapObj.modifiedMap(hashMap);
        System.out.println("\nAfter making changes:");
        System.out.println(hashMap);
    }
    public Map<String,String> modifiedMap(Map<String,String> hashMap)
    {

        String temp=hashMap.get("val1");
        hashMap.put("val1", " ");
        hashMap.put("val2", temp);
        return hashMap;
    }
}