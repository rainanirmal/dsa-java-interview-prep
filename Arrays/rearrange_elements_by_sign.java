// given an integer array nums of even length consisting of an equal number of positive and negative integers. Return the answer array in such a way that the given conditions are met:
// Every consecutive pair of integers have opposite signs
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.

package Arrays;

import java.util.*;

public class rearrange_elements_by_sign {

    // public static void rearrange_elements(int[] arr) {

    //     int[] positive = new int[arr.length / 2];
    //     int[] negative = new int[arr.length / 2];
    //     int p = 0;
    //     int n = 0;

    //     for(int i = 0 ; i < arr.length; i ++) {
    //         if (arr[i] < 0) {
    //             negative[n] = arr[i];
    //             n++;
    //         }
    //         else {
    //             positive[p] = arr[i];
    //             p++;
    //         }
    //     }

    //     for(int i = 0 ; i < arr.length / 2; i ++) {
    //         arr[i * 2] = positive[i];
    //         arr[i * 2 + 1] = negative[i];
    //     }

    //     for(int i = 0 ; i < arr.length; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }
    // }

    // Enter size of array:
    // 6

    // Enter elements of array:
    // 1
    // 2
    // 3
    // -1
    // -2
    // -3

    // Rearranged array:
    // 1 -1 2 -2 3 -3 

    public static void rearrange_elements(int[] arr) {

        int positive = 0;
        int negative = 1;

        int[] result = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] > 0) {
                result[positive] = arr[i];
                positive = positive + 2;
            }
            else {
                result[negative] = arr[i];
                negative = negative + 2;
            }
        }

        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(result[i]+ " ");
        }
    }

    // Enter size of array: 
    // 4

    // Enter elements of array: 
    // -4
    // 8
    // -1
    // 8

    // Rearranged array: 
    // 8 -4 8 -1 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Rearranged array: ");
        rearrange_elements(arr);


        sc.close();
    }
}
