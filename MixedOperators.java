public class MixedOperators 
{
    public static void main(String[] args) 
   {
        int a = 4;
        int b = 4;
        int c = 5;

        boolean condition = (a + b > c) && (b != 0); 
        System.out.println("Condition result: " + condition);
    }
}
