package Sorting;

import java.util.Arrays;

public class KthSortedElement {
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,4,3,9,7,6,2,11};
        SelectionSort(arr);
        int k = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println(k+"rd smallest number "+arr[k-1]);
    }
}
