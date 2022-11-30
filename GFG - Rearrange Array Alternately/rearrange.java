class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long[] answer1 = new long[n];
        long[] answer2 = new long[n];
        int i;
        long ptr1 = 0, ptr2 = 0, ptr3 = 0, ptr4 = 0;
        for(i = 0; i < n; i++){
            answer1[i] = arr[n-i-1];
        }
        for(i = 0; i < n; i++){
            answer2[i] = arr[i];
        }
        for(i = 0; i< n; i++){
            if(i % 2 == 0){
                ptr1 = arr[i];
                arr[i] = answer1[(int)ptr2];
                ptr2++;
            }
            if(i % 2 != 0){
                ptr3 = arr[i];
                arr[i] = answer2[(int)ptr4];
                ptr4++;
            }
        }
    }
    
}
