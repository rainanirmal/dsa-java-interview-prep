package Arrays;

import java.util.*;

public class smaller_element_than_k {

    public static void smaller_element(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr1 = new ArrayList<>();

        for(int i = 0; i < arr.size(); i ++) {
            if(arr.get(i) < k) {
                arr1.add(arr.get(i));
            }
        }

        System.out.println(arr1);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements: ");
        String input = sc.nextLine();
        input = input.substring(1, input.length() - 1);

        String[] string_arr = input.split(",");

        ArrayList<Integer> int_arr = new ArrayList<>();

        for (String elements : string_arr) {
            int_arr.add(Integer.parseInt(elements));
        }

        System.out.println();

        System.out.println("Enter element : ");
        int k = sc.nextInt();

        System.out.println();

        System.out.print("Smaller elements than " + k + " : ");

        smaller_element(int_arr, k);

        sc.close();
        
    }
}

// Enter array elements: 
// [78,56,34,99,12]

// Enter element : 
// 34

// Smaller elements than 34 : [12]