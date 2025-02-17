import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < k; i++) {
            int ele = arr[i];
            minPQ.add(ele);
            int rem = minPQ.poll();
            maxPQ.add(rem);
            if (maxPQ.size() > minPQ.size()) {
                minPQ.add(maxPQ.poll());
            }
        }
        
        if(maxPQ.size() == minPQ.size()){
            System.out.print(maxPQ.peek()+" ");
        }
        else{
            System.out.print(minPQ.peek()+" ");
        }
        for (int i = k; i < n; i++) {
            int ins = arr[i];
            int rem = arr[i - k];
            if (rem > maxPQ.peek()) {
                // remove from min heap
                minPQ.remove(rem);
            } else {
                // remove from max heap
                maxPQ.remove(rem);
            }
            minPQ.add(ins);
            maxPQ.add(minPQ.poll());
            if (maxPQ.size() > minPQ.size()) {
                minPQ.add(maxPQ.poll());
            }

            if (minPQ.size() == maxPQ.size()) {
                System.out.print(maxPQ.peek() + " ");
            } else {
                System.out.print(minPQ.peek() + " ");
            }
        }
        System.out.println();
        sc.close();
    }

}
