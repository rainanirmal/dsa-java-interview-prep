package Math;

import java.util.*;

public class palindrome_number_check {

    public static boolean palindrome(int n) {
         
        boolean palindrome = false;

        int rev = 0;
        int digit = 0;
        int temp = n;

        while (temp > 0) {
            digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if (rev == n) {
            palindrome = true;
        }

        return palindrome;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(palindrome(n));

        sc.close();
    }
}

// output
// 1234
// false

// 121
// true