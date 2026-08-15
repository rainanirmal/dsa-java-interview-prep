package Arrays;

import java.util.*;

public class second_largest_element_in_array {

    public static int second_largest(int[] arr) {

        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        int second_max = max;

        for(int i = arr.length - 2 ; i >= 0 ; i --) {
            if(arr[i] != max) {
                second_max = arr[i];
                break;
            }
        }

        return second_max;
    }

    // Enter size of array : 5

    // Enter elements of array
    // 78
    // 54
    // 23
    // 67
    // 55

    // Second largest elment : 67
    
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

        System.out.print("Second largest elment : ");

        int ans = second_largest(arr);

        System.out.println(ans);
        
        sc.close();
    }
}
