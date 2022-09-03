import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-69, -24, -22, -12,0, 2, 3, 4, 5, 6, 23, 34, 35, 45, 67, 89, 90, 99};
        int ans = binarySearch(arr, 67);
        System.out.println("Index at: " + ans);

    }

//Limitation -> We know that the array is ascending order.
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //find the middle term
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
