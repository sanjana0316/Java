public class InstanceVariable
{
    int empId;
    String name;
    double salary;

    void displayDetails() 
    {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) 
    {
        InstanceVariable emp = new InstanceVariable();
        emp.empId = 101;
        emp.name = "Alice";
        emp.salary = 55000;
        emp.displayDetails();
    }
}
