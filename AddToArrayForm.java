import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        AddToArrayForm solution = new AddToArrayForm();
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> result = solution.addToArrayForm(num, k);
        System.out.println(result); 
    }
}

