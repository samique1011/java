import java.util.*;
public class cons {
    private int length , breadth;
    cons(int  l ,int b){
        this.length = l;
        this.breadth = b;
    }
    void area(){
        System.out.println("The area of rectangle is = " + (length*breadth));
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int b = scn.nextInt();
        // cons rec = new cons();
        cons rec2 = new cons(l , b);

        // rec1.area();
        rec2.area();
        scn.close();


    }
}
