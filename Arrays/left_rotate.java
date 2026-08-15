package Arrays;

import java.util.*;

public class left_rotate {

    public static void left_rotate_one(int[] arr) {

        int temp = arr[0];

        for(int i = 1; i < arr.length; i ++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        for(int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i]+ " ");
        }
    }

    // Enter size of array : 5

    // Enter elements of array : 
    // 1
    // 2
    // 3
    // 4
    // 5

    // Left Rotate by one : 2 3 4 5 1 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];

        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < size ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Left Rotate by one : ");

        left_rotate_one(arr);

        sc.close();
    }
}
