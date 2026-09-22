class Occurence{
    static int firstOccurence(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    static int lastOccurence(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // 1 2 2 2 3 4 5 
        // target = 2
        // count = 3
        int[] arr= {1,2,2,2,3,4,5};
        int target = 2;
        int first= firstOccurence(arr,target);
        int last = lastOccurence(arr,target);
        if(first == -1){
            System.out.println("element not found");
        }else{
            System.out.println("count : "+(last-first+1));
        }
    }
}