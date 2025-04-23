class invalidMoneyException extends RuntimeException{
    public invalidMoneyException(String m){
        super(m);
    }
}
public class customUncheckedException {
    public static void main(String[] args) {
        int amount = 5000;
        if(amount >= 5000){
            throw new invalidMoneyException("Amount greater than equal to 5000");
        }
        else{
            System.out.println("Program continue");
        }
    }
}
