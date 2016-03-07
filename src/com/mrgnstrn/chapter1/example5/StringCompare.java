package com.mrgnstrn.chapter1.example5;

/**
 * Created by mrgns on 06.03.2016.
 */
public class StringCompare {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1;
        System.out.println("Compare by reference -> " + (s1==s2));
        s2 = new String(s1);
        System.out.println("Compare by reference -> " + (s1==s2));
        System.out.println("Compare by value -> " + (s1.equals(s2)));

    }
}
