public class Jiofiberbill 
{
    public static void main(String[] args) 
    {
        double planCost = 699;
        double gst = 18;
        double finalCost = planCost + (planCost * gst / 100);
        System.out.println("Final plan cost: ₹" + finalCost);
    }
}
