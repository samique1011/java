import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class genericMethods {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> li =  new ArrayList<>();
        li.add(2);
        li.add(3);
        List<Double> ld = new ArrayList<>();
        ld.add(4.0);
        List<String> ls = new ArrayList<>();
        ls.add("hello");
        for(int i : li){
            System.out.print(i+" ");
        }
        System.out.println();
        for(double d : ld){
            System.out.print(d+" ");
        }
        System.out.println();
        for(String s : ls){
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
