import java.util.Scanner;

public class FrequencyOfChar {
    public int charFrequency(String string,char aChar)
    {
        String temp=string.replace(Character.toString(aChar),"");
        int frequency=string.length()-temp.length();
        return frequency;
    }
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter String:");
        String  string=scanner.nextLine();
        System.out.println("enter char to check frequency:");
        char aChar=scanner.next().charAt(0);
        scanner.close();
        FrequencyOfChar frequencyOfChar=new FrequencyOfChar();
        System.out.println("frequency of "+aChar+" is "+frequencyOfChar.charFrequency(string,aChar));

    }
}
