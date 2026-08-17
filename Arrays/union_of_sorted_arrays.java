// given 2 sorted arrays num1 and num2, return an array that contains the union of these 2 arrays. 
// The elements in the union must be in ascending order

package Arrays;

import java.util.*;

public class union_of_sorted_arrays {

    // public static void union(int[] arr1, int[] arr2) {
        
    //     TreeSet<Integer> set = new TreeSet<>();

    //     for (int i : arr1) {
    //         set.add(i);
    //     }

    //     for (int i : arr2) {
    //         set.add(i);
    //     }

    //     System.out.println(set);
    // }

    // hashset --> gives random unique values
    // treeset --> gives sorted unique values
    
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        
        int i = 0;
        int j = 0;

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++;
            }

            if (arr2[j] <= arr1[i]) {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);
                }
            i++;
        }

        while (j < m) {
            if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                }
            j++;
        }

        return temp;
    }

    // Enter size of first array: 
    // 4
    // Enter elements of first array: 
    // 1
    // 3
    // 5
    // 6
    // Enter size of second array: 
    // 3
    // Enter elements of second array: 
    // 1
    // 2
    // 3
    // Union of sorted array: [1, 2, 3, 5, 6]
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array: ");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array: ");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union of sorted array: " + union(arr1, arr2));

        sc.close();
    }
}

// Enter size of first array: 
// 5

// Enter elements of first array: 
// 1
// 3
// 5
// 7
// 9

// Enter size of second array: 
// 3

// Enter elements of second array: 
// 0
// 2
// 3

// [0, 1, 2, 3, 5, 7, 9]