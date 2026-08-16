// you are given an array arr of size n-1 that contains distinct integers in the range from 1 to n(inclusive). This array 
// represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return 
// the missing element

package Arrays;

import java.util.*;

public class missing_in_array {

    public static int missing(int[] arr) {

        Arrays.sort(arr);

        int num = 1;
        for(int i = 0; i < arr.length; i ++) {
            if (arr[i] != num) {
                return num;
            }
            num++;
        }

        return num;
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

        System.out.print("Missing element: ");
        System.out.println(missing(arr));

        sc.close();
    }
}

// Enter size of array: 
// 6
// Enter elements of array: 
// 7
// 2
// 3
// 4
// 1
// 5
// Missing element: 6

// Enter size of array: 
// 1
// Enter elements of array: 
// 7
// Missing element: 8