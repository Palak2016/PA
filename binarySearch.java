public class binarySearch {
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]< target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,80,90,500,900,1600};
        int target = 500;
        int ans = binarySearch(arr,target);
        if(ans==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+ans);
        }
    }
}
