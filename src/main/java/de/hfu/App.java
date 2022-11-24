package de.hfu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inputStreamReader);
        String input;
        {
            try {
                input = b.readLine();
                System.out.println(input.toUpperCase());

            } catch (IOException e) {}
        }
    }
}