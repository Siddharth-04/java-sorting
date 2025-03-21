import java.util.Arrays;

public class BubbleSort {
    //swap method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    //bubble sort method
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
// Before Sorting : [7, 6, 5, 4, 3, 2, 1]
// After Sorting : [1, 2, 3, 4, 5, 6, 7]
