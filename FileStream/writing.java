import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writing {
    public static void main(String[] args) {
        String data = "hehe this is a data which is to be written down";
        try(FileOutputStream fout = new FileOutputStream("output.txt")){
            fout.write(data.getBytes());
            System.out.println("Data written successfully");
            System.out.println(data.getBytes());
        }catch(IOException e){
            System.out.println("Error occurred");
        }
    }
}
