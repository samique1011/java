import java.util.*;
class Animal{
    void sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
    void sleep(){
        System.out.println("Dog sleeps");
    }
}
public class childParentDownCasting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Animal a = new Dog();
        a.sound();


        String s1 = "abc"; // is overwritten , they point to same location , this is String literal
        String s2 = "abc";
        System.out.println(s1 == s2);

        String a1 = new String("abc"); //isnt overwritten , both strings are equal by value but stored differently
        String a2 = new String("abc");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}
