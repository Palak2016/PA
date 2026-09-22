public class LinearSearch {
    static int LinearSearch(int[] arr,int k){
        for(int i=1; i< arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {10,30,20,40,60,50};
        int target = 50;
        int ans = LinearSearch(arr,target);
        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+ ans);
        }
    }
}
