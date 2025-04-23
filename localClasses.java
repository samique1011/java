class outerClass{
    private int x = 20;
    void display(){
        int y = 30;
        class innerClass{
            void msg(){
                System.out.println(x + " " + y);
            }
        }
        innerClass ob = new innerClass();
        ob.msg();
    }
}
public class localClasses {
    public static void main(String[] x){
        outerClass ob = new outerClass();
        ob.display();

        
    }
}
