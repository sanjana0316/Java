public class SwapFourWithTemp 
{
    public static void main(String[] args) 
    {
        int a = 1, b = 2, c = 3, d = 4, temp;
        temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
    }
}
