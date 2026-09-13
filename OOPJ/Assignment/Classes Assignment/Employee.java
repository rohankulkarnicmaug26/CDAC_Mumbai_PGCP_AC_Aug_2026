public class Employee
{
    int Salary;
    int Hours;

    void getInfo(int Salary, int Hours)
    {
        this.Salary = Salary;
        this.Hours = Hours;
    }

    void addSal()
    {
        if(Salary < 500)
        {
            Salary = Salary + 10;
        }
    }

    void addWork()
    {
        if(Hours > 6)
        {
            Salary = Salary + 5;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter Salary: s");
        int Salary = ConsoleInput.getInt();

        System.out.println("Enter Hours of work per day: ");
        int Hours = ConsoleInput.getInt();

        Employee objEmployee = new Employee();

        objEmployee.getInfo(Salary, Hours);

        objEmployee.addSal();
        objEmployee.addWork();

        System.out.println("Final Salary: " + objEmployee.Salary);
    }
}