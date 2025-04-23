import java.util.*;
class Movie{
    String movieName , tickePrice , starRating;
    Movie(String s , String t , String sr){
        movieName = s;
        tickePrice = t;
        starRating = sr;
    }
}
public class practiseprog4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String movieName  = scn.nextLine();
        String ticketPrice = scn.nextLine();
        String starRating = scn.nextLine();

        Movie mv = new Movie(movieName , ticketPrice , starRating);
        scn.close();
        mv.getClass();
        System.gc();
    }
}
