package Arrays;

import java.util.*;

public class check_sorted_array {

    public static boolean check_sorted(int[] arr) {

        for(int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i -1] || arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array: ");
        System.out.println(check_sorted(arr));

        sc.close();
    }
}
