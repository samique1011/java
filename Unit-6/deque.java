import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>(); //Deque is also a interface and not a class hence has to be instantied with the help of other similar class
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);

        for(int i : dq){
            System.out.println(i);
        }
    }
}
