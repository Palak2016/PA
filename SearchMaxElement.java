public class SearchMaxElement {
    static int maxElement(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {10,50,60,80,45,6,900};
        System.out.println("Max element is : "+maxElement(arr));
        
    }
}
