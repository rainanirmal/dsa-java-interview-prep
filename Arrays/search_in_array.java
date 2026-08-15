package Arrays;

import java.util.*;

public class search_in_array {

    public static int linear_search(ArrayList<Integer> arr, int target) {

        for(int i = 0; i < arr.size() ; i ++) {
            if (arr.get(i) == target) {
                return i+1;
            }
        }

        return -1;
    }
    
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

        int ans = linear_search(arr_int, x);       

        System.out.println(ans);


        sc.close();
    }
}
