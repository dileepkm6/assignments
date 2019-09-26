import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String []args) throws IOException
    {
        Scanner scanner=new Scanner(System.in);
        String fileName="/home/cgi/practice_exercise_3/src/com/stackroute/java/test.txt";
        FileHandling fileHandling=new FileHandling();
        String fileContent=fileHandling.toUpperCaseOfFileInput(fileName);
        System.out.print(fileContent);
        FileWriter fileWriter=new FileWriter(fileName);
        for(int i=0;i<fileContent.length();i++)
        {
            fileWriter.write(fileContent.charAt(i));
        }
        fileWriter.close();

    }
    public String toUpperCaseOfFileInput(String fileName) throws IOException {
        String str="";
        int ch;
        FileReader fileReader=null;
        try
        {
            fileReader=new FileReader(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        while((ch=fileReader.read())!=-1)
        {
            str=str+(char)ch;
        }
        fileReader.close();
        return str.toUpperCase();
    }
}
