class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int count = 0;
        while(num > 0){
            arr[count++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        int new1 = (arr[0] * 10 + arr[2]);
        int new2 = (arr[1] * 10 + arr[3]);
        return new1 + new2;
    }
    // public void bubbleSort(int[] arr){
    //     int n = arr.length;
    //     for(int i = 0; i < n; i++){
    //         boolean isSwap = false;
    //         for(int j = 0; j < n - i - 1; j++){
    //             if(arr[j] > arr[j + 1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //                 isSwap = true;
    //             }
    //         if(!isSwap) break;
    //         }
    //     }
    // }
}