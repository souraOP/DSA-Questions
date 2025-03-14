class Solution {
    public int maximumPrimeDifference(int[] arr) {
        int firstPrime = -1, lastPrime= -1;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                if(firstPrime == -1){
                    firstPrime = i;
                }
                lastPrime = i;
            }

        }
        // if prime number is not found
        if(firstPrime == -1 || firstPrime == lastPrime){
            return 0;
        }
        return Math.abs(lastPrime - firstPrime);
    }

    static boolean isPrime(int i){
        if(i <= 1){
            return false;
        }
        for(int j = 2; j <= Math.sqrt(i); j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }

}