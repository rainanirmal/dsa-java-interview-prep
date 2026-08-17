// given a sorted arr[] , find the element that appears only once in the array. All other elements appear exactly twice.

package Arrays;

import java.util.*;

public class single_among_doubles_in_array {

    // public static int single_among_doubles(int[] arr) {

    //     if (arr.length == 1) {
    //         return arr[0];
    //     }

    //     for(int i = 0; i < arr.length; i ++) {
    //         if (i == 0) {
    //             if (arr[i] != arr[i+1]) {
    //                 return arr[i];
    //             }
    //         }
    //         else if (i == arr.length - 1) {
    //             if (arr[i] != arr[i - 1]) {
    //                 return arr[i];
    //             }
    //         }
    //         else {
    //             if (arr[i] != arr[i-1] && arr[i] != arr[i+1]) {
    //                 return arr[i];
    //             }
    //         }
    //     }

    //     return -1;

    // }

    // Enter size of array: 
    // 3
    // Enter elements of array: 
    // 1
    // 1
    // 3
    // Single among doubles in array: 
    // 3

    // xor
    // public static int single_among_doubles(int[] arr) {

    //     int ans = 0;

    //     for(int i = 0; i < arr.length; i++) {
    //         ans = ans ^ arr[i];
    //     }

    //     return ans;

    //     // 0 ^ 0 = 0
    //     // 1 ^ 0 = 1
    //     // 1 ^ 1 = 0
    // }

    // Enter size of array:
    // 7
    // Enter elements of array:
    // 1
    // 1
    // 2
    // 2
    // 3
    // 4
    // 4
    // Single among doubles in array:
    // 3

    public static int single_among_doubles(int[] arr) {

        if(arr.length == 1) {
            return arr[0];
        }

        if (arr[0] != arr[1]) {
            return arr[0];
        }

        if(arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            else if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || (mid % 2 == 0 && arr[mid + 1] == arr[mid])) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Enter size of array: 
    // 5

    // Enter elements of array: 
    // 1
    // 1
    // 2
    // 3
    // 3

    // Single among doubles in array: 
    // 2
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Single among doubles in array: ");
        System.out.println(single_among_doubles(arr));

        sc.close();

    }
}
