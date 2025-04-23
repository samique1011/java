import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    public static final int serialID = 123;
    public String name;
    public int age;
    transient String pass;
    Student(String name , int age , String pass){
        this.name = name;
        this.age = age;
        this.pass = pass;
    }
    void display(){
        System.out.println(name + " " + age + " " + pass);
    }
}
public class serial{
    public static void main(String[] args) {
        Student st = new Student("shine" , 20 , "123");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("output.ser"))){
            out.writeObject(st);
            System.out.println("Written sucessfully");
        }catch(Exception e){
            System.out.println("Some exception occcured");
        }
    }
}