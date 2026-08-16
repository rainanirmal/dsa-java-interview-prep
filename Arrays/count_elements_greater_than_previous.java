// given an integer array arr of size n the task is to find the count of elements whose value is greater than all of its
// prior elements
// Note: first element of the array should  be considered in the count of the result


package Arrays;

import java.util.*;

public class count_elements_greater_than_previous {

    public static int greater_than_previous(int[] arr) {

        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        return count;
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

        System.out.println("Number of elments greated than its prior elements: ");
        System.out.println(greater_than_previous(arr));

        sc.close();
    }
}

// Enter size of array: 
// 5

// Enter elements of array: 
// 7
// 4
// 8
// 2
// 9

// Number of elments greated than its prior elements: 
// 3