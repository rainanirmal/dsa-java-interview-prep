package Arrays;

import java.util.*;

public class array_input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // case 1: fixed size

        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i = 0 ; i < n ; i ++) {
        //     arr[i] = sc.nextInt();
        // }

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        // case 2: dynamic size

        String input = sc.nextLine();
        String arr1[] = input.split(",");

        ArrayList<Integer> int_input = new ArrayList<>();

        for (String token : arr1) {
            int_input.add(Integer.parseInt(token));
        }

        // Java collections work with objects, not primitive types.
        // That's why when you're working with ArrayList, List, HashSet, HashMap, etc., you commonly see Integer.
        for (Integer integer : int_input) {
            System.out.print(integer+ " ");
        }

        sc.close();
    }
}
