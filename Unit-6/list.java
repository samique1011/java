
import java.util.*;
public class list {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        li.add(0);
        li.add(1);
        ls.add("Hello");
        ls.add("abc");
        for(int i : li){
            System.out.println(i);
        }
        for(String s : ls){
            System.out.println(s);
        }
    }
}
