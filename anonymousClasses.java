abstract class hehe{
    abstract void display();
}
interface greet{
    void hello();
}
public class anonymousClasses {
    public static void main(String[] args) {
        hehe ob1 = new hehe(){
            public void display(){
                System.out.println("Hello");
            }
        };
        ob1.display();
        greet ob2 = new greet(){
            public void hello(){
                System.out.println("Interface");
            }
        };

        ob2.hello();

    }
}
