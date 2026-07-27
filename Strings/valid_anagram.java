package Strings;

import java.util.*;

public class valid_anagram {

    public static boolean anagram_check(String s, String t) {

        if(s.length() != t.length()) { 
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(anagram_check(s, t));

        sc.close();
    }
}

// output
// nagaram
// anagram
// true