import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1 , "shinne");
        hm.put(2 , "hello");

        for(Map.Entry<Integer,String> me : hm.entrySet()){
            System.out.println("key = " + me.getKey() + " value = " + me.getValue());
        }
    }
}
