//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      obj.convertMinToMaxHeap(n,a);
      for(int e : a)
      {
          System.out.print(e+" ");
      }
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
    // code here
        for(int i = (N - 2) / 2; i >= 0; --i){
            maxHeapify(arr, i, N);
        }
        
    }
        static void maxHeapify(int[] arr, int i, int N) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            int largest = i;
            if(leftChild < N && arr[leftChild] > arr[i]){
                largest = leftChild;
            }
            if(rightChild < N && arr[rightChild] > arr[largest]) {
                largest = rightChild;
            }
            if(largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                maxHeapify(arr, largest, N);
            }
        }

  
}
     