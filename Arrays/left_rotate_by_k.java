package Arrays;

import java.util.*;

public class left_rotate_by_k {

    public static void left_rotate_k(int[] arr, int k) {

        k = k % arr.length;

        int[] temp = new int[k];

        for(int i = 0; i < k; i ++) {
            temp[i] = arr[i];
        }

        for(int i = k; i < arr.length; i ++) {
            arr[i - k] = arr[i];
        }

        int j = 0;

        for(int i = arr.length - k; i < arr.length; i ++) {
            arr[i] = temp[j];
            j++;
        }

        for(int i = 0 ; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
    
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

        System.out.print("Enter number of rotation : ");
        int k = sc.nextInt();

        System.out.println();

        System.out.print("Left Rotate by " + k + " : ");

        left_rotate_k(arr, k);

        sc.close();

    }
}

// Enter size of array : 5

// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5

// Enter number of rotation : 3

// Left Rotate by 3 : 4 5 1 2 3 



// Enter size of array : 5

// Enter elements of array : 
// 1
// 2
// 3
// 4
// 5

// Enter number of rotation : 9 --> 9 % 5 = 4 --> 4 time rotation

// Left Rotate by 9 : 5 1 2 3 4 