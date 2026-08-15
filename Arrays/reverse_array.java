package Arrays;

import java.util.*;

public class reverse_array {

    public static void swap(int[] arr, int left, int right) {

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

        for(int i = 0 ; i < arr.length ; i ++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];

        System.out.println("Enter elements of array");
        for(int i = 0 ; i < size ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Reverse array : ");

        reverse(arr);

        sc.close();
    }
}

// Enter size of array : 5

// Enter elements of array
// 1
// 3
// 5
// 8
// 5

// Reverse array : 5 8 5 3 1 