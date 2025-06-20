public class SalaryTax 
{
    public static void main(String[] args) 
    {
        double salary = 85000;
        double taxPercent = 20;

        double taxAmount = salary * taxPercent / 100;
        System.out.println("Tax Amount: RS " + taxAmount);
    }
}
