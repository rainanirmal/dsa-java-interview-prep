package Arrays;

import java.util.*;

public class largest_element_in_array {

    // public static int larget_element(ArrayList<Integer> arr) {

    //     int max = 0;

    //     for (Integer i : arr) {
    //         if(i > max) {
    //             max = i;
    //         }
    //     }

    //     return max;
    // }

    // Input: [1,2,3,4,5,89]
    // Output: 89

    public static int larget_element(ArrayList<Integer> arr) {

        // Arrays.sort(null);

        Collections.sort(arr);
        
        return arr.get(arr.size() - 1);
    }

    // Input: [45,2,4,7,8,9]
    // Output: 45
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.substring(1, input.length()-1);

        String[] string_arr = input.split(",");

        ArrayList<Integer> int_arr = new ArrayList<>();

        for (String elements : string_arr) {
            int_arr.add(Integer.parseInt(elements.trim()));
        }

        int ans = larget_element(int_arr);

        System.out.println(ans);

        sc.close();
    }
}
