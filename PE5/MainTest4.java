import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainTest4
{
    public static void main(String []args)
    {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(20,"b",239));
        studentList.add(new Student(20,"a",235));
        studentList.add(new Student(20,"k",233));
        studentList.add(new Student(26,"b",220));
        studentList.add(new Student(24,"j",234));
        for(int i=0;i<studentList.size();i++)
        {
            System.out.println(studentList.get(i).getAge()+" "+studentList.get(i).getName()+" "+studentList.get(i).getId());
        }
        System.out.println("---------------------------------");
        Collections.sort(studentList,new StudentSorter());
        for(int i=0;i<studentList.size();i++)
        {
            System.out.println(studentList.get(i).getAge()+" "+studentList.get(i).getName()+" "+studentList.get(i).getId());
        }
    }
}
class Student
{
    private String name;
    private int age;
    private int id;
    public Student(int age,String name,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getId()
    {
        return id;
    }
}
class StudentSorter implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        int compareAge=s1.getAge()-s2.getAge();
        int compareName=s1.getName().compareTo(s2.getName());
        int compareId=s1.getId()- s2.getId();
        if(compareAge==0)
        {
            if(compareName==0)
            {
                return (-1)*compareId;
            }
            else
            {
                return (-1)*compareName;
            }
        }
        else
        {
            return (-1)*compareAge;
        }
    }
}