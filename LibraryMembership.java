public class LibraryMembership
{
    int memberId;
    String memberName;
    int booksBorrowed;

    void borrowBooks(int count)
    {
        int maxBooksAllowed = 5; 
        if (booksBorrowed + count <= maxBooksAllowed)
         {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " book(s). Total now: " + booksBorrowed);
         } 
        else 
         {
            System.out.println("Cannot borrow " + count + " books. Limit is " + maxBooksAllowed);
         }
    }

    public static void main(String[] args)
    {
        LibraryMembership member = new LibraryMembership();
        member.memberId = 201;
        member.memberName = "Asha";
        member.booksBorrowed = 2;
        member.borrowBooks(2);
    }
}
