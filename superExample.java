class Parent{
    Parent(String s){
        System.out.println("I am " + s);
    }
}

class Child extends Parent{
    Child(String s , String curr){
        super(s);
        System.out.println("Child is " + curr);
    }
}


public class superExample {
    public static void main(String[] args) {
        Child c = new Child("Dog" , "Puppy");
        System.out.println(c.getClass());
    }
}
