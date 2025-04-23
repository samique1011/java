class School{
    private String name , address , type;
    School(String n , String a ,String t){
        name = n;
        address = a;
        type = t;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAddress(){
        System.out.println(this.address);
    }
    public void getType(){
        System.out.println(this.type);
    }
}
public class practiseprog1 {
    public static void main(String[] args) {
        School sc = new School("DPS" , "Burdwan" , "Higher Secondary");
        sc.getAddress();
    }
    

}
