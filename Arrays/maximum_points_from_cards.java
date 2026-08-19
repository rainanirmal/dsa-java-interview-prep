// Given n cards arranged in rows 

package Arrays;

import java.util.*;

public class maximum_points_from_cards {

    public static int max_card_points(int[] arr, int k) {

        int lsum = 0;
        int rsum = 0;
        int max = 0;

        for(int i = 0 ; i < k ; i ++) {
            lsum = lsum + arr[i];
        }

        max = lsum;

        int right = arr.length - 1;

        for(int i = k - 1 ; i >= 0 ; i --) {
            rsum = rsum + arr[right];
            lsum = lsum - arr[i];
            right--;

            if (rsum + lsum > max) {
                max = rsum + lsum;
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

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Maximum cards point: ");
        System.out.println(max_card_points(arr, k));

        sc.close();
        
    }
}
