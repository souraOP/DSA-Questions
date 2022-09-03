import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,25,56,15,5,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){ //using two pointer methods
        int start = 0;
        int end = arr.length-1;
        while(end > start){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}