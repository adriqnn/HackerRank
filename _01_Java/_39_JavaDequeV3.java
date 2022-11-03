package _05_HackerRank._01_Java;

import java.util.*;

public class _39_JavaDequeV3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new HashSet<>();

        int max_count = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m){
                if(max_count < set.size()){
                    max_count = set.size();
                }
                int remove_val = deque.pollFirst();
                if(!deque.contains(remove_val)){
                    set.remove((remove_val));
                }
            }
        }
        System.out.println(max_count);
    }
}
