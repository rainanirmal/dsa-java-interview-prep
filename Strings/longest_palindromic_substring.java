package Strings;

import java.util.*;

public class longest_palindromic_substring {

    public static String longest_palindromic(String s) {

        if(s.length() <= 1) {
            return s;
        }

        String ans = "";

        for(int i = 0 ; i < s.length() ; i ++) {

            String odd = expand(s, i, i);

            if(odd.length() > ans.length()) {
                ans = odd;
            }

            String even = expand(s, i, i + 1);

            if(even.length() > ans.length()) {
                ans = even;
            }
        }

        return ans;
    }

    public static String expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(longest_palindromic(s));

        sc.close();
    }
}

// output
// babad
// bab