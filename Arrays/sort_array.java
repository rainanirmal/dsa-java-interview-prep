// given an array arr[] containing only 0s. 1s, 2s. Sort the array in ascending order.
// you need to solve this problem wihtout utilizing the builr in function

package Arrays;

import java.util.*;

public class sort_array {

    public static void sort(int[] arr) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i < arr.length; i ++) {
            if (arr[i] == 0) {
                zero++;
            }
            else if (arr[i] == 1) {
                one++;
            }
            else {
                two++;
            }
        }

        for(int i = 0; i < zero; i ++) {
            arr[i] = 0;
        }

        for(int i = zero; i < zero+one; i ++) {
            arr[i] = 1;
        }

        for(int i = zero+one; i < zero+one+two; i ++) {
            arr[i] = 2;
        }

        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Enter size of array: 
    // 5

    // Enter elements of array: 
    // 1
    // 2
    // 0
    // 0
    // 1

    // Sorted array: 0 0 1 1 2 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Sorted array: ");
        sort(arr);

        sc.close();

    }
}
