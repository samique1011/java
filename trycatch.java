import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        try{
            int arr[] = {3,4,5};
            System.out.println(arr[6]);
            int result = a /b;
            System.out.println("Division result = " + result);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
        catch(Exception e){
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("The finally block is being executed");
        }
        scn.close();
    }
}
