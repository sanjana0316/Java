public class CollegeStudent 
{
    int studentId;
    String studentName;
    static String collegeName = "XYZ University";

    public static void main(String[] args) 
  {
        CollegeStudent s1 = new CollegeStudent();
        CollegeStudent s2 = new CollegeStudent();
        s1.studentId = 101;
        s1.studentName = "Raj";
        s2.studentId = 102;
        s2.studentName = "Meena";

        System.out.println(s1.studentName + " - " + collegeName);
        System.out.println(s2.studentName + " - " + collegeName);
    }
}
