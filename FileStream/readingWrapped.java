import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.IOException;

public class readingWrapped {
    public static void main(String[] args) {
        try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream("hehe.txt"))){
            int content ;
            while((content = bin.read()) != -1){
                System.out.print((char)content);
            }
        }catch(IOException e){
            System.out.println("Error occured");
        }
    }
}
