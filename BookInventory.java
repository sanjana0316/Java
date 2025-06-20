public class BookInventory 
{
    String title;
    String author;
    static int bookCount = 0;

    void printBookInfo() 
{
        int serialNo = ++bookCount;
        System.out.println("Serial No: " + serialNo + ", Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args)
    {
        BookInventory b1 = new BookInventory();
        b1.title = "Java Basics";
        b1.author = "James";

        BookInventory b2 = new BookInventory();
        b2.title = "OOP Concepts";
        b2.author = "Kathy";

        b1.printBookInfo();
        b2.printBookInfo();
    }
}
