public class ProductDiscount
{
    int id;
    String name;
    double price;

    void calculateDiscount(double discountPercent) 
    {
        double discountAmount = price * discountPercent / 100;  // local variable
        double finalPrice = price - discountAmount;
        System.out.println("Final price after " + discountPercent + "% discount: " + finalPrice);
    }

    public static void main(String[] args) 
    {
        ProductDiscount product = new ProductDiscount();
        product.id = 1;
        product.name = "Laptop";
        product.price = 50000;
        product.calculateDiscount(10);
    }
}
