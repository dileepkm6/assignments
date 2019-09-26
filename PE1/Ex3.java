import java.util.Scanner;
public class Ex3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string :");
        String w=sc.nextLine();
        for(int i=0;i<w.length();i++)
        {
            int t=w.charAt(i);
            if((t>=65 && t<=90) || (t>=97 && t<=122))
            {
                if(t==65 || t==97 || t==69 || t==101 || t==73 || t==105 || t==79 || t==111 || t==85 || t==117)
                {
                    System.out.println("Vowel");
                }
                else
                {
                    System.out.println("Consonant");
                }
            }
            else
            {
                System.out.println("Error");
            }
        }
    }
}