import java.util.*;
abstract class Shape{
    abstract void area(int l , int b);
    abstract void volume(int l , int b , int h);
    abstract void color();
}
class Rectangle extends Shape{
    void area(int l , int b){
        System.out.println(l*b);
    }
    void volume(int l , int b , int h){
        System.out.println(l*b*h);
    }
    void color(){
        System.out.println("Yellow color");
    }
}
public class abstractClasses {
    public static void main(String []s){
        Scanner scn = new Scanner(System.in);
        Rectangle ob = new Rectangle();
        ob.area(2,3);
        ob.volume(3,4,5);
        ob.color();
        scn.close();


    }
}
