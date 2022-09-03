public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 12, 34, 56, 67, 78, 89 ,90, 123, 1245, 3566};
        int target = 1245;
        int index = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if (arr[mid] == target) return mid;
        if(target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }else{
            return binarySearch(arr, target, mid+1, end);
        }
    }
}
