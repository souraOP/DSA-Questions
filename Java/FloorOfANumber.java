public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 4 ,5 , 13, 16, 19, 30, 45, 56};
        int ans = ceiling(arr, 23);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end){
            int m = start + (end - start)/2;
            if(arr[m] == target) return m;
            if(isAscending){
                if(target > arr[m]){
                    start = m+1;
                } else{
                    end = m-1;
                }
            } else {
                if(target < arr[m]){
                    end = m - 1;
                } else {
                    start = m + 1;
                }
            }
        }
        return end;
    }
}
