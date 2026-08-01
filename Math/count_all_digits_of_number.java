package Math;

import java.util.*;

public class count_all_digits_of_number {

    public static int digit_count(int n) {

        int length = String.valueOf(n).length();

        return length;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(digit_count(n));

        sc.close();
    }
    
}

// output

// Input : 123456
// Output : 6

// Input: 8
// Output : 1
