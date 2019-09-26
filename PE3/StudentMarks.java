import java.util.Scanner;

public class StudentMarks {
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num of student:");
        int numOfStudent = scanner.nextInt();
        int grades[]=new int[numOfStudent];
        System.out.println("Enter the grades of student:");
        for(int index=0;index<numOfStudent;index++)
        {
            grades[index]=scanner.nextInt();
        }
        for(int index=0;index<numOfStudent;index++)
        {
            if(!(grades[index]>0 && grades[index]<100))
            {
                throw new ArithmeticException("invalid input of grades");
            }
        }

    }
}
