class invalidAgeException extends Exception{
    public invalidAgeException(String m){
        super(m);
    }
}
public class customExceptions {
    public static void main(String[] args){
        try{
            int age = 17;
            if(age < 18)    throw new invalidAgeException("Age is below 18");
            else    System.out.println("Program continues");
        }catch(invalidAgeException e){
            System.out.println("Error occured = " + e.getMessage());
        }
        
    }
}
