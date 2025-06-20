public class Assignment1_LocalVariable {
    public static int sum(int a, int b) {
        int result = a + b;  // local variable
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(5, 7));
    }
}
