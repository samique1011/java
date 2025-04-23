interface Shape{
    default void area(){
        System.out.println("Interface's area");
    }
    static void color(){
        //static methods cannot be empty
        System.out.println("Interface's static method");
    }
}

class Circle implements Shape{
    public void area(){
        System.out.println("circle's area");
    }
    static void color(){
        System.out.println("Circle's static method");
    }
}
public class abstractClasses2 {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.area();
        Circle.color();
        Shape.color();
    }
}
