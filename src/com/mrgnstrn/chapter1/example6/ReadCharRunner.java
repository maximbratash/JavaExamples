package com.mrgnstrn.chapter1.example6;

import javax.imageio.IIOException;
import java.io.IOException;

/**
 * Created by mrgns on 06.03.2016.
 */
public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char ch = (char)x;
            System.out.println("Symbol " + ch + " -> " + x);

        } catch (IOException e) {
            System.err.println("Err" + e);



        }
    }
}