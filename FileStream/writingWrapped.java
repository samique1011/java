import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writingWrapped {
    public static void main(String[] args) {
        String data = "hehe this is a data which is to be written down";
        try(BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("output.txt"))){
            bout.write(data.getBytes());
            System.out.println("Data written successfully");
            System.out.println(data.getBytes());
        }catch(IOException e){
            System.out.println("Error occurred");
        }
    }
}
