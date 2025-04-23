//package FileStream;
import java.io.IOException;
import java.io.FileInputStream;

public class reading {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("hehe.txt")){
            int content ;
            while((content = fin.read()) != -1){
                System.out.print((char)content);
            }
        }catch(IOException e){
            System.out.println("Error occured");
        }
    }
}
