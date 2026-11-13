public class MaximumSum {
    public static long maxCircularSum(int[] nums) {
        int n=nums.length;
        long total=0;
        long keep=nums[0];
        long deleted=Long.MIN_VALUE/2;
        long max_normal=nums[0];
        for(int i=1;i<n;i++){
            int x=nums[i];
            long newdlt=Math.max(keep, deleted+x);
            long newkeep=Math.max(keep, keep+x);
            keep=newkeep;
            deleted=newdlt;
            max_normal=Math.max(max_normal, Math.max(keep,deleted));
        }
        for(int num:nums){
            total+=num;
        }
        if(max_normal<0){
            return max_normal;
        }
        long maxcircular= Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long sum=0;
            long bestdlt= Long.MIN_VALUE/2;
            for(int j=1;j<n;j++){
                long x= nums[(i+j-1)%n];
                long nextdlt= Math.max(bestdlt, bestdlt+x);
                sum=Math.max(sum, sum+x);
                bestdlt=nextdlt;
                maxcircular=Math.max(maxcircular, Math.max(sum,bestdlt));
            }
        }
        return Math.max(max_normal,maxcircular);
    }
    public static void main(String[] args) {

        int[] nums = {5, -3, 5, -2, 4};

        long result = maxCircularSum(nums);

        System.out.println(result);
    }
}

