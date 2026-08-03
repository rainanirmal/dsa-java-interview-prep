package Math;

import java.util.*;

public class odd_digits_in_number {

    public static int odd_count(int n) {

        int count = 0;
        
        while (n > 0) {
            int digit = n % 10;

            if(digit % 2 != 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(odd_count(n));

        sc.close();
    }
    
}

// output
// 1234567 
// 4