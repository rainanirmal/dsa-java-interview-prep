package Strings;

import java.util.*;

public class rotate_string {

    // public static boolean rotate(String s, String goal) {

    //     if (s.length() != goal.length()) {
    //         return false;
    //     }

    //     for(int i = 0 ; i < s.length(); i ++) {
            
    //         String rotated = s.substring(i) + s.substring(0, i);

    //         if (rotated.equals(goal)) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    public static boolean rotate(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;
        
        return doubled.contains(goal);
        
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();
        System.out.println(rotate(s, goal));

        sc.close();
        
    }
}

// output
// abcde
// cdeab
// true