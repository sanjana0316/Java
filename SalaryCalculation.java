public class SalaryCalculation 
{
    public static void main(String[] args) 
{
        double basicSalary = 85000;
        double ta = basicSalary * 0.15;
        double da = basicSalary * 0.20;
        double hra = basicSalary * 0.18;

        double pf = basicSalary * 0.20;
        double tax = basicSalary * 0.25;

        double gross = basicSalary + ta + da + hra;
        double net = gross - (pf + tax);

        System.out.println("Gross Salary: Rs" + gross);
        System.out.println("Net Salary: Rs" + net);
    }
}
