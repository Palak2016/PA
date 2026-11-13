
import java.util.*;
class FirstNonRepeatingNumber {
    public static void firstNonRepeating(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            q.offer(i);
            if (i >= k) {
                int removed = nums[i - k];
                map.put(removed, map.get(removed) - 1);
            }
            if (i >= k - 1) {
                while (!q.isEmpty() && q.peek() <= i - k) {
                    q.poll();
                }
                while (!q.isEmpty() &&
                       map.get(nums[q.peek()]) != 1) {
                    q.poll();
                }
                if (q.isEmpty()) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(nums[q.peek()] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 4, 4, 5};
        int k = 4;
        firstNonRepeating(nums, k);
    }
}
