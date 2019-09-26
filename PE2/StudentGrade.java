import java.util.Scanner;
public class StudentGrade
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numberOfStudent=scanner.nextInt();
        int grades[]=new int[numberOfStudent];
        for(int index=0;index<numberOfStudent;index++)
        {
            System.out.println("Enter the grade for student "+(index+1));
            grades[index]=scanner.nextInt();
        }
        StudentGrade studentGrade=new StudentGrade();
        System.out.println("The Average is "+studentGrade.avgOfGrade(numberOfStudent, grades));
        System.out.println("The Minimum is "+studentGrade.minimumGrade(numberOfStudent, grades));
        System.out.println("The Maximum is "+studentGrade.maximumGrade(numberOfStudent, grades));
    }
    public int maximumGrade(int numberOfStudent,int []grades)
    {
        int max=grades[0];
        for(int index=1;index<numberOfStudent;index++)
        {
            if(max<grades[index])
            {
                max=grades[index];
            }
        }
        return max;
    }
    public int minimumGrade(int numberOfStudent,int []grades)
    {
        int min=grades[0];
        for(int index=1;index<numberOfStudent;index++)
        {
            if(min>grades[index])
            {
                min=grades[index];
            }
        }
        return min;
    }
    public double avgOfGrade(int numberOfStudent,int []grades)
    {
        int sumOfGrade=0;
        for(int index=0;index<numberOfStudent;index++)
        {
            sumOfGrade+=grades[index];
        }
        double avgGrade=(double)sumOfGrade/numberOfStudent;
        return avgGrade;
    }
}
