package oop_lab3.ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class TestInput {
    public static void main(String[] args) throws IOException {
//        BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name?");
        String name = reader.readLine();
        System.out.print("your name is"+name);

    }
}
