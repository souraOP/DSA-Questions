class Solution {
    public int minimumSum(int num) {
        int[] arr = {num%10, (num/10)%10, (num/100)%10, (num/1000)%10};
        Arrays.sort(arr);
        return (arr[0]*10 + arr[2]) + (arr[1]*10 + arr[3]);
        
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