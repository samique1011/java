class fS{
    int getSquare(int a){
        return a * a;
    }
    double getSquare(double a){
        return a * a;
    }
    int getSquare(){ return -1;}
    int getSquare(int... a){
        System.out.println("Many arguments passed");
        return -1;
    }
    int getSquare(double... a){
        System.out.println("Many arguments passed");
        return -1;
    }

}
public class practiseprog3 {
    public static void main(String[] args) {
        fS ob1 = new fS();
        System.out.println(ob1.getSquare(2.33));
        System.out.println(ob1.getSquare(2));
        System.out.println(ob1.getSquare());
        System.out.println(ob1.getSquare(2.33 , 7.888, 9.33));
        System.out.println(ob1.getSquare(1,2,3,4));
    }
}
