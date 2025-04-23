class outerClass{
    static int x = 10;
    int y = 20;
    private int z = 30;
    class innerClass{
        void display(){
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
}


public class nonstaticnestedClass {
    public static void main(String[] x){
        outerClass ob = new outerClass();
        outerClass.innerClass ob1 = ob.new innerClass();
        ob1.display();

    }
}
