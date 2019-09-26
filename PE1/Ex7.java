import java.util.Scanner;
public class Ex7
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int temp1=n;
        int count=0;
        while(temp1>0)
        {
            temp1=temp1/10;
            count++;
        }
        int []arr=new int [count];
        int t=n;
        int r;
        int c=0;
        int even_sum=0;
        while(t>0)
        {
            r=t%10;
            if(r%2==0)
            {
                even_sum+=r;
            }
            arr[c++]=r;
            t=t/10;

        }
        for(int i=0;i<c-1;i++)
        {
            for(int j=0;j<c-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int sum=0;
        for(int i=0;i<c;i++)
        {
            sum=sum*10+arr[i];
        }
        System.out.println("Sorted number in non-increasing order :"+sum);
        if(even_sum>15)
        {
            System.out.println("Sum of even numbers :"+even_sum);
            System.out.println("True");
        }
        else
        {
            System.out.println("Sum of even numbers :"+even_sum);
            System.out.println("False");
        }
        
    }
}