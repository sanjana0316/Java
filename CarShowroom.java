public class CarShowroom 
{
    String model;
    double price;
    static int carCount = 0;

    CarShowroom(String model, double price) 
    {
        this.model = model;
        this.price = price;
        carCount++;
    }

    public static void main(String[] args) 
    {
        new CarShowroom("Sedan", 800000);
        new CarShowroom("SUV", 1200000);
        System.out.println("Total Cars: " + carCount);
    }
}
