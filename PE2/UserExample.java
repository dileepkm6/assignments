public class UserExample
{
    public static void main(String []args)
    {
        User user=new User();
        UserExample userExample=new UserExample();
        user.setFirstName("dileep");
        user.setLastName("maurya");
        user.setSalary(50000);
        if(user.isValidAge(45) && userExample.isValidAge(45))
        {
            user.setAge(45);
        }
        else
        {
            System.out.println("Enter valid age");
        }
        System.out.println("First Name :"+user.getFirstName());
        System.out.println("Last Name :"+user.getLastName());
        System.out.println("Full Name :"+user.getFullName());
        System.out.println("Age :"+user.getAge());
        System.out.println("Salary :"+user.getSalary());

    }
    public boolean isValidAge(int age)
    {
        if(age<0 || age>100)
        {
            return false;
        }
        return true;
    }
}