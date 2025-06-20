public class StaticVariable
{
    static String schoolName = "ABC Public School";
    String studentName;

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();
        s1.studentName = "John";
        s2.studentName = "Lara";
        
        System.out.println(s1.studentName + " - " + schoolName);
        System.out.println(s2.studentName + " - " + schoolName);
    }
}
