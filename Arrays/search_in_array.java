package Arrays;

import java.util.*;

public class search_in_array {

    public static int linear_search(ArrayList<Integer> arr, int target) {

        for(int i = 0; i < arr.size() ; i ++) {
            if (arr.get(i) == target) {
                return i;
            }
        }

        return -1;
    }

    // Input:  [1,2,3,4,5,6,7]
    //         5
    // Output: 4

    // Input: [1,2,3,4,5,6,7]              
    //        9
    // Ouput: -1

    public static int binary_search(ArrayList<Integer> arr, int target) {

        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            
            int mid = low + (high - low) / 2;

            if(arr.get(mid) == target) {
                return mid;
            }
            else if(target < arr.get(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // Input: [1,2,3,4,5,6,7]
    //        6
    // Output: 5

    // Input: [1,2,3,4,5,6,7]
    //        0
    // Output: -1  
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.substring(1, input.length()-1);

        String[] arr_string = input.split(",");

        ArrayList<Integer> arr_int = new ArrayList<>();

        for (String elements : arr_string) {
            arr_int.add(Integer.parseInt(elements.trim()));
        }

        int x = sc.nextInt();

        // int ans = linear_search(arr_int, x);  
        
        int ans = binary_search(arr_int, x);

        System.out.println(ans);

        sc.close();
    }
}
