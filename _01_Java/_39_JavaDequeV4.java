package _05_HackerRank._01_Java;

import java.util.*;
import java.util.stream.Collectors;

public class _39_JavaDequeV4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        Set<Integer> set = new HashSet<>();

        if(n == m){
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                set.add(num);
            }
            System.out.println(set.size());
            return;
        }


        int unique = 0;
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            if(deque.size() < m){
                deque.add(num);
                set.add(num);
            }else{
                if(unique < set.size()){
                    unique = set.size();
                }
                int remove = deque.pollFirst();
                if(!deque.contains(remove)){
                    set.remove(remove);
                }
                deque.add(num);
                set.add(num);
            }
        }
        System.out.println(unique);
    }
}
