public class SwapThreeWithTemp
{
    public static void main(String[] args) 
    {
        int a = 1, b = 2, c = 3, temp;
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
