class hello{
    static int cnt = 0;
    int display(){
        cnt++;
        return cnt;
    }
}
public class practiseprog2 {
    public static void main(String args[]){
        hello ob1 = new hello();
        hello ob2 = new hello();
        hello ob3 = new hello();

        ob1.display();
        ob2.display();

        ob3.display();

        ob1.display();


        System.out.println(ob1.display());
    }
}
