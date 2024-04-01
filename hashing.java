import java.util.*;

class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // precompute the hash table
        int[] hash = new int[13];
        for(int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int totalQueries = sc.nextInt();
        while(totalQueries-- > 0) {
            int number;
            number = sc.nextInt();
            // fetching the value from the hash table
            System.out.println(hash[number]);
        }

        // for character hashing

        // use ASCII value to hash the characters
        // s = "abcdefghijklm"

        // 'a' - 97 i.e., 'a' - 'a' = 0
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        // [a, b, c, d, e, f, g, h, i, j,  k,  l,  m]

        // now for getting index of 'f' we can do 'f' - 'a' = 5 i.e., ASCIIof('f') - ASCIIof('a') = 102 - 97 = 5
        // 'b' - 'a' = 1 i.e., ASCIIof('b') - ASCIIof('a') = 98 - 97 = 1
        // 'c' - 'a' = 2 i.e., ASCIIof('c') - ASCIIof('a') = 99 - 97 = 2
        // 'd' - 'a' = 3 i.e., ASCIIof('d') - ASCIIof('a') = 100 - 97 = 3


        // So formula is (Char - 'a') = corresponding index in the hash array

        // For array with Uppercase Characters and also for lowerCase Characters, create an array of 256 size and use (Char - 'A') for hashing


    }
}
