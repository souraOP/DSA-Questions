public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 5, 23, 66, 67, 89, 99};
        int ans = orderAgnostic(arr, 89);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isDesc = arr[start] > arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            if (isDesc){
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
