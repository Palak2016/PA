import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 2, 6, 3, 9, 5};
        int N = arr.length;
        int K = 3;
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - K) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= K - 1) {
                if (output.length() > 0) {
                    output.append(" ");
                }
                output.append(arr[deque.peekFirst()]);
            }
        }
        System.out.println(output);
    }
}