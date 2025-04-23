import java.util.*;
class School{
    void createStudent(String n){
        class Student{
            String name;
            Student(String n){
                this.name = n;
            }
            void showStudent(){
                System.out.println("Name of this student is  = "  + this.name);
            }
        }
        Student ob = new Student(n);
        ob.showStudent();
    }
}
public class practise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nm = scn.nextLine();
        School ob = new School();
        ob.createStudent(nm);
    }
}
