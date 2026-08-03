package Math;

import java.util.*;

public class largest_digit_in_number {

    public static int largest_digit(int n) {

        int largest = 0;

        while (n > 0) {
            int digit = n % 10;

            if(digit > largest) {
                largest = digit;
            }

            n = n / 10;
        }

        return largest;        
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(largest_digit(n));

        sc.close();
        
    }
}

// output
// 987654321
// 9

// 1234567
// 7