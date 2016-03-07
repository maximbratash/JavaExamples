package com.mrgnstrn.chapter1.example7;

import java.util.Scanner;

/**
 * Created by mrgns on 06.03.2016.
 */
public class RunScanner {

    public static void main(String[] args) {
        System.out.println("Type your name and press Enter:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);
        scanner.close();



    }
}
