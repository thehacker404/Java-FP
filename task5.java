import java.util.Arrays;

public class KthLargest {
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k]; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 20, 15};
        int k = 2;
        System.out.println("Kth largest element: " + findKthLargest(arr, k));
    }
}
