public class MovieTicket 
{
    static int totalTicketsSold = 0;
    String movieName;
    String customerName;

    MovieTicket(String movieName, String customerName) 
    {
        this.movieName = movieName;
        this.customerName = customerName;
        totalTicketsSold++;
    }

    void showTicket() 
    {
        System.out.println("Movie: " + movieName + ", Customer: " + customerName);
    }

    public static void main(String[] args) 
    {
        MovieTicket t1 = new MovieTicket("Avengers", "Rina");
        MovieTicket t2 = new MovieTicket("Avengers", "Ali");

        t1.showTicket();
        t2.showTicket();

        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }
}
