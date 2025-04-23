final class Parent{
    final void show(){
        System.out.println("hi");
    }

}
class Child extends Parent{ // a final class cannot be inherited
    void show(){ // cannot override a final method
        System.out.println("hello");
    }
}

public class finalCheck {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
    }
}
