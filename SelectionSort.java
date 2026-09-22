package Sorting;
import java.util.*;
public class SelectionSort {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min= i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,7,6,2,11};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
