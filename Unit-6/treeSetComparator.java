import java.util.*;
class Tuple{
    String name;
    int comp;
    char ch;
    Tuple(String n , int c , char cc){
        this.name = n;
        comp = c;
        ch = cc;
    }
    public String toString(){
        return this.name + " " + this.comp + " " + this.ch;
    }
}
public class treeSetComparator {
    public static void main(String[] args) {
        Comparator<Tuple> cm = (a , b) -> (a.comp - b.comp);
        TreeSet<Tuple> ts = new TreeSet<>(cm);
        ts.add(new Tuple("Shine" , 23 , 'z'));
        ts.add(new Tuple("hehe" , 34 , 'a'));
        System.out.println(ts);
    }
}
