public class EmployeeSalaryTracker {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    EmployeeSalaryTracker(int empId, String name, double salary) 
     {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
     }

    void display()
     {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
     }

    public static void main(String[] args) {
       EmployeeSalaryTracker e1 = new EmployeeSalaryTracker(101, "Ravi", 50000);
       EmployeeSalaryTracker e2 = new EmployeeSalaryTracker(102, "Neha", 60000);

        e1.display();
        e2.display();

        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary Expense: " + totalSalaryExpense);
    }
}
