package Arrays;

import java.util.*;

public class array_input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // case 1: fixed size

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
