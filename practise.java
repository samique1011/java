import java.util.*;
class library{
    class Book{
        String titleName , authorName;
        Book(String t , String a){
            this.titleName = t;
            this.authorName = a;
        }
        void displayDetails(){
            System.out.println("Author name = " + this.authorName);
            System.out.println("Title = " + this.titleName);
        }
    }
}
public class practise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String t = scn.nextLine();
        String a = scn.nextLine();
        library ob = new library();
        library.Book ob1 = ob.new Book(t, a);
        ob1.displayDetails();
    }
}





