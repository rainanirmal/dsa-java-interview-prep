package Math;

import java.util.*;

public class reverse_number {

    public static int reverse(int n) {

        int rev = 0;
        int digit = 0;
        int temp = n;

        while (temp > 0) {
            digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        return rev;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(reverse(n));

        sc.close();
    }
}

// output
// 12345678
// 87654321