class Member
{
    private String name;
    private int age;
    private double salary;
    Member(String name,int age,double salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void displayInfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
    }
}

