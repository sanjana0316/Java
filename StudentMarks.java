public class StudentMarks 
{
    String name;
    int mark1, mark2, mark3;

   StudentMarks(String name, int mark1, int mark2, int mark3) 
   {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateAverage() {
        int total = mark1 + mark2 + mark3;  
        double average = total / 3.0;     
        System.out.println("Student: " + name + ", Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks("Priya", 85, 90, 78);
        s.calculateAverage();
    }
}
