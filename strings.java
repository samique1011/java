import java.util.*;
public class strings {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String l1 = "abc";
        String n1 = new String("abc");

        String l2 = "abc";
        String n2 = new String("abc");

        System.out.println(l1 == l2);
        System.out.println(n1.equals(n2)); // remember here n1 == n2 will give as false because both are different objects
        System.out.println(l1.equals(n2));
        System.out.println(l1.equals(l2));

        char c[] = {'c' , 'h' , 'a' , 'r'};
        for(int i = 0; i<c.length;i++){
            System.out.println(c[i]);
        }
        byte[] b = {'a',90,101,122};
        String mix = new String(b); // consists of the ascii value of every index
        System.out.println(mix);

        System.out.println("hello from the other side".contains("side"));
        System.out.println(("hello from the other side".replace("from", "frompart23")).toUpperCase());
        System.out.println("bat".compareTo("bat"));
        System.out.println("hello shine ".repeat(3));
        String s1 = "abc" , s2 = "dce";
        System.out.println(s1);
        s1 += s2;

        System.out.println();
        String fruits[] = "apple,kiwi,watermelon,orange".split(",");
        for(String s : fruits){
            System.out.println(s);
        }
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" WOrld");
        System.out.println(sb);

        StringBuilder SB= new StringBuilder("hello");

        SB.append(" world");
        System.out.println(SB);
        SB.delete(1,2);
        System.out.println(SB);
        System.out.println((SB.reverse()).toString());
        scn.close();

    }
}

