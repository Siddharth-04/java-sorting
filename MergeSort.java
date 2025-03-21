import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right,mid,n-mid);
    }

    public static void merge(int[] arr,int[] left,int[] right,int l,int r) {
        int i=0,j=0,k=0;
        while(i<l && j<r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        while(i<l) {
            arr[k++] = left[i++];
        }
        while(j<r) {
            arr[k++] = right[j++];
        }

    }

    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
// [1, 2, 3, 4, 5, 6, 7]