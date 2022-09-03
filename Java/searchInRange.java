public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 23, 54, -41, 4, 95, 5};
        int target = 54;
        linearSearch(arr, target, 1, 4);

    }

    static void linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0)
            System.out.println("Insufficient array length");
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target)
                System.out.println("Target element found at index: " + index);
        }
        /*this will execute if none the return statement are executed
         * Hence the target not found*/
    }
}
