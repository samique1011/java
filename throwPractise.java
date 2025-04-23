public class throwPractise {
    static void helper(int a){
        if(a >= 20){
            throw new ArithmeticException("Greater than equal to 20");
        }
        else{
            System.out.println("haha");
        }
    }

    public static void main(String[] args) {
        try{
            helper(20);
        }catch(ArithmeticException e){
            System.out.println("Error = " + e.getMessage());
        }
    }
}
