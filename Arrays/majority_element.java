// given an integer array num of size n , return the majority element of the array
// the majority element of the array is an element that appears more than n/2 times in the array.
// The array is guaranteed to have a majority element

package Arrays;

import java.util.*;

public class majority_element {

    public static int majority(int[] arr) {

        for(int i = 0 ; i < arr.length ; i ++) {
            int count = 0;
            for(int j = 0 ; j < arr.length ; j ++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }

        return -1;
    }

    // Enter size of array: 
    // 7

    // Enter elements of array: 
    // 1
    // 2
    // 3
    // 7
    // 7
    // 7
    // 7

    // Majority element: 7
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Majority element: ");
        System.out.println(majority(arr));

        sc.close();
        
    }
}
