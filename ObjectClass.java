class Car{
    String brand;
    int yr;
    Car(String b , int x){
        this.brand = b;
        this.yr = x;
    }
    //overriding the toString() method which is originally of OBJECT class
    @Override public String toString(){
        return "Car{brand = '" + this.brand + "' and year = '" + this.yr + "' }";
    }
    @Override public boolean equals(Object ob){
        if(ob == null){
            return false;
        }
        Car temp = (Car) ob;
        return (this.brand.equals(temp.brand)) && (this.yr == temp.yr);
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Car ob1 = new Car("Tesla" , 2022 );
        Car ob2 = new Car("Audi" , 2023);
        Car ob3 = new Car("Tesla" , 2022);
        System.out.println(ob1.toString());
        System.out.println(ob2.hashCode());
        System.out.println(ob1.equals(ob3)); // as equals check if two objects have the same reference or not but we have overriden the .equals() method

        System.out.println("Hash code of ob1 = " + ob1.hashCode());
        System.out.println("Hash code of ob3 = " + ob3.hashCode());
    }
}
