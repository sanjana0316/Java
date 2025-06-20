public class DominosBill 
{
    public static void main(String[] args) 
  {
        double pizzaCost = 399;
        int quantity = 2;
        double discount = 20;

        double total = pizzaCost * quantity;
        double discountedAmount = total - (total * discount / 100);
        System.out.println("Final Bill Amount: ₹" + discountedAmount);
    }
}
