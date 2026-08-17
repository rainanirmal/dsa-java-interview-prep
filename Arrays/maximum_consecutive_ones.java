package Arrays;

import java.util.*;

public class maximum_consecutive_ones {

    public static int consecutive_ones(int[] arr) {

        int count = 0;
        int max = 0;

        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] == 1) {
                count++;
                if(count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }

        return max;
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

        System.out.println("Maximum consecutive 1s in array: ");
        System.out.println(consecutive_ones(arr));

        sc.close();
        
    }
}

// Enter size of array: 
// 5

// Enter elements of array: 
// 1
// 0
// 1
// 1
// 1

// Maximum consecutive 1s in array: 
// 3