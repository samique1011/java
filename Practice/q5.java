class Box{
    int l , w;
    Box(){
        l = 5 ; w = 10;
    }
    Box(int a , int b){
        l = a; 
        w = b;
    }
    void area(){
        System.out.println(l * w);
    }
}
public class q5 {
    public static void main(String[] args) {
        Box b2 = new Box();
        // Box b2 = new Box(3,4);
        b2.area();
    }
}
