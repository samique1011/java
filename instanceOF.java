class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}

public class instanceOF {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasted
        Animal b = new Cat();
        Animal ani = new Animal();
        if(a instanceof Dog && a instanceof Animal){
            System.out.println("A is a instance of DOG");
        }
        else{
            System.out.println("A is not a instance of DOg");
        }


        Animal an = new Cat();
        if(an instanceof Cat){
            Cat c = (Cat) an; // downcasting
            System.out.println("downcasted!!");
            c.getClass();
        }
        b.getClass();
        ani.getClass();


    }
}
