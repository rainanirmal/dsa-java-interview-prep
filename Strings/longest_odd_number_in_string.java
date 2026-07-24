package Strings;

import java.util.*;

public class longest_odd_number_in_string {

    public static String longest_odd_number(String s) {

        int index = -1;

        for(int i = s.length() - 1 ; i >= 0 ; i --) {
            if((s.charAt(i)-'0') % 2 == 1) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return "";
        }

        int j = 0;

        while (j <= index && s.charAt(j) == '0') {
            j++;
        }

        return s.substring(j, index+1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(longest_odd_number(s));

        sc.close();
    }
}

// output
// 23456
// 2345

// 098765432
// 9876543