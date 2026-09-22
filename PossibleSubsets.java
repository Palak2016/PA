import java.util.*;
class Main {
    static List<List<Integer>> ans = new ArrayList<>();
    static void solve(int[] nums,int index,List<Integer> curr){
        if(index == nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[index]);
        solve(nums,index+1,curr);
        curr.remove(curr.size()-1);
        solve(nums,index+1,curr);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        solve(nums,0,new ArrayList<>());
        System.out.println(ans);
    }
}