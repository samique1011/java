import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserial {
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.ser"))){
            Student st = (Student)in.readObject();
            st.display();
        }catch(Exception e){
            System.out.println("Some exception occured");
            
        }
    }
}
