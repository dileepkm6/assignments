import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FetchFileFromDir {
    public static void main(String []args) throws IOException
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file extension name:");
        String extensionName=scanner.next();
        String DirPath="/home/cgi/practice_exercise_3/src/com/stackroute/java";
        File dir=new File(DirPath);
        File []files=dir.listFiles();
        FetchFileFromDir fetchFileFromDir=new FetchFileFromDir();
        if(files.length==0)
        {
            System.out.println("Directory is empty");
        }
        else
        {
            for(File file:files)
            {
                if(file.isFile())
                {
                    if(file.getName().endsWith(extensionName))
                    {
                        System.out.println("content of file "+file.getName()+":");
                        fetchFileFromDir.readFileContent(file,DirPath);
                    }
                }
            }
        }



    }
    public void readFileContent(File file,String DirPath) throws IOException
    {
        FileInputStream fileInputStream=null;

        try
        {
            fileInputStream=new FileInputStream(file);
            byte []content=new byte[(int)file.length()];
            fileInputStream.read(content);
            String fileContentStr=new String(content);
            System.out.println(fileContentStr);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        finally {
            fileInputStream.close();
            System.out.println();
        }
    }
}
