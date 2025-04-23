public class nestedtrycatch {
    static void check(int a){
        if(a < 18){
            throw new ArithmeticException("Age is below 18");
        }else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try{
            try{
                check(15);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            throw new Exception("haha");
        }catch(Exception e){
            System.out.println("Some other exception occurred");
        }
    }
}
