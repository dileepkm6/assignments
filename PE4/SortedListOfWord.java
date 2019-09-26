import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortedListOfWord
{
    public String sortedWordOfString(String paragraph)
    {
        String tempStr=new String(paragraph);
        String []wordArray=tempStr.split("[ \\n]");
        String result="";
        for(int index=0;index<wordArray.length;index++)
        {
            char []temp=wordArray[index].toCharArray();
            Arrays.sort(temp);
            String temp1=String.copyValueOf(temp);
            result=result+" "+temp1;
        }
        
        return result;
    }
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a paragraph :");
        String paragraph=scanner.nextLine();
        scanner.close();
        SortedListOfWord sortedListOfWord=new SortedListOfWord();
        String sortedWord=sortedListOfWord.sortedWordOfString(paragraph);
        System.out.println("sorted paragraph :"+sortedWord);
    }
}
