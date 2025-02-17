interface Animal {
void sound();
void eat();
    
}
interface Pet {
void friendly();
}

class Dog implements Animal , Pet{
    public void sound(){
        System.out.println("Bhow Bhow");
    }
    public void eat(){
        System.out.println("Eats biscuits");
    }
    public void friendly(){
        System.out.println("is friendly");
    }
}

public class multipleInheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
        d.eat();
        d.friendly();
    }
}