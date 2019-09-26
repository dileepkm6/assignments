public class User
{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public double getSalary()
    {
        return salary;
    }
    public boolean isValidAge(int age)
    {
        if(age>18 && age<60)
        {
            return true;
        }
        return false;
    }
    public String getFullName()
    {
        return firstName+" "+lastName;
    }

}
