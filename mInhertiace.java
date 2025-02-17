interface Shape{
    void area(double x);
}

class Color{
    void shapeClr(){
        System.out.println("Solid Shape color");
    }
}

class Circle extends Color implements Shape{
    @Override public void area(double r){
        System.out.println("Area = " + (3.14 * r * r));
    }
    void shapeClr(int x){
        System.out.println("m new");
    }
}


public class mInhertiace {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(1.44);
        c.shapeClr();
    }
}
