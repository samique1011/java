import java.util.*;
class Tuple implements Comparable<Tuple>{
    String name;
    int comp;
    char ch;
    Tuple(String n , int c , char cc){
        this.name = n;
        comp = c;
        ch = cc;
    }
    public int compareTo(Tuple o){
        if(this.comp == o.comp){
            return this.ch - o.ch;
        }
        return this.comp - o.comp;
    }
    public String toString(){
        return this.name + " " + this.comp + " " + this.ch;
    }
}
public class treeset {
    public static void main(String[] args) {
        TreeSet<Tuple> ts = new TreeSet<>();
        ts.add(new Tuple("Shine" , 23 , 'a'));
        ts.add(new Tuple("algo" , 45 , 'b'));
        ts.add(new Tuple("hehe" , 31 , 'z'));
        ts.add(new Tuple("hehe" , 31 , 'f'));
        System.out.println(ts);
    }
}
