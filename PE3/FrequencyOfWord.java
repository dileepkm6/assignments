import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyOfWord {
public static void main(String []args) throws IOException
{
    String fileName="/home/cgi/practice_exercise_3/src/com/stackroute/java/FileDemo.txt";
    FileReader fileReader=null;
    try {
        fileReader = new FileReader(fileName);
    }
    catch (FileNotFoundException e)
    {
        System.out.println(e.getMessage());
    }
    int ch;
    String fileContent="";
    while((ch=fileReader.read())!=-1)
    {
        fileContent=fileContent+(char)ch;
    }
    fileContent=fileContent.replaceAll("[,.]","").trim();
    String []strArray=fileContent.split(" ");
    for(int i=0;i<strArray.length;i++)
    {
        strArray[i]=strArray[i].trim();
    }
    //System.out.println(strArray.length);
    Map<String,Integer> frq=new HashMap<String,Integer>();
    for(String str:strArray)
    {
        Integer n=frq.get(str);
        if(n==null)
            n=1;
        else
            n=n+1;
        frq.put(str,n);
    }
    for(Map.Entry<String,Integer> entry : frq.entrySet())
    {
        System.out.println(entry.getKey()+"->"+entry.getValue());
    }
}
}
