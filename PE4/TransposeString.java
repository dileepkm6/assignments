import java.util.Scanner;
import java.util.Arrays;

public class TransposeString
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        scanner.close();
        String []wordArray=string.split(" ");
        TransposeString transposeString=new TransposeString();
        String result="";
        for(int index=0;index<wordArray.length;index++)
        {
            wordArray[index]=transposeString.reverseString(wordArray[index]);
            result=result+" "+wordArray[index];
        }
        System.out.print(result.trim());
        
    }
    public String reverseString(String str)
    {
        char []temp=str.toCharArray();
        int left=0;
        int right=temp.length-1;
        while(left<right)
        {
            char ch=temp[left];
            temp[left]=temp[right];
            temp[right]=ch;
            left++;
            right--;
        }
        return String.copyValueOf(temp);
    }
}