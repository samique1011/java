class Demo{
    @Override protected void finalize() { //called when garbage collection is called
        System.out.println("Hehe");
    }
}
public class finalizeExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.getClass();
        d = null;
        System.gc();
    }
}
