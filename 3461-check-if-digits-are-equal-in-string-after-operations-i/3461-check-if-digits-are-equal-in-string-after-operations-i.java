class Solution {
    public boolean hasSameDigits(String s) {
        // O (n^2) solution using String Builder
        
        // StringBuilder sb= new StringBuilder(s);
        // while(sb.length() > 2){
        //     StringBuilder scsb = new StringBuilder();
        //     for(int i = 0; i < sb.length() - 1; i++){
        //         int a = sb.charAt(i) - '0';
        //         int b = sb.charAt(i + 1) - '0';
        //         scsb.append((char)('0' + (a +b) % 10));
        //     }
        //     sb = scsb;
        // }
        // return sb.charAt(0) == sb.charAt(1);



        // using arrays
        int n = s.length();
        int[] arr = new int[n];

        // convert the string to array
        for(int i = 0; i < n; i++){
            arr[i] = s.charAt(i) - '0';
        }

        while(n > 2){
            for(int i = 0; i < n-1; i++){
                arr[i] = (arr[i] + arr[i+1]) % 10;
            }
            n--;
        }
        return arr[0] == arr[1];

    }
}