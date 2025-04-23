import java.util.*;
interface greet{
    void show();
}
interface yeye{
    int calculate(int a , int b);
}
public class lambdafunctions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        greet ob = ()->{
            System.out.println("Hello");
        };
        ob.show();
        yeye ob1 = (int x , int y)->{
            int s = x + y;
            return s;
        };

        System.out.println(ob1.calculate(a , b));
        scn.close();
    }
}





