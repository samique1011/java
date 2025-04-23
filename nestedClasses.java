import java.util.Scanner;

class outerClass {
    static int x = 10;
    int y = 20;
    private int z = 30;
    static class innerClass{
         void display(){
            System.out.println(x);
            outerClass ob = new outerClass();
            System.out.println(ob.y);
            System.out.println(ob.z);
        }
    }
}

public class nestedClasses{
    public static void main(String[] x){
        Scanner scn = new Scanner(System.in);
        outerClass.innerClass ob1 = new outerClass.innerClass();
        ob1.display();
        //outerClass.innerClass.display(); if the display method was static too
        scn.close();
    }
}




