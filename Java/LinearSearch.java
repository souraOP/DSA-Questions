import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        System.out.print("Enter the number you want to find: ");
        int target = sc.nextInt();
        linearSearch(arr, target);
    }
    static void linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            System.out.println("Insufficient array length");
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
                System.out.println("Target element found at index: " + index);
        }
        /*this will execute if none the return statement are executed
        * Hence the target not found*/
    }
}
