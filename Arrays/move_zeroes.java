// given an integer array num, move all the  0's to the end of it while maintaining the relative order of the non-zero 
// elements
// Note: that you must do it in-place without making copy of the array

package Arrays;

import java.util.*;

public class move_zeroes {

    public static void move(int[] arr) {

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < arr.length; i ++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for(int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        for(int i = temp.size(); i < arr.length; i ++) {
            arr[i] = 0;
        }
    }

    // Enter size of array: 
    // 5

    // Enter elements of array: 
    // 0
    // 1
    // 0
    // 3
    // 12
    
    // Moving zeroes at the end of the array: 
    // 1 3 12 0 0 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Moving zeroes at the end of the array: ");

        move(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
