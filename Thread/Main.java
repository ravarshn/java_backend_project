package com.example.demo.Threads;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String FILENAME = "C:\\Users\\Rajeev_Varshney\\Downloads\\demo2\\demo\\src\\main\\java\\com\\example\\demo\\Threads\\test1.txt";
        char ch1 = 'a';
        Thread t1 = new Thread(new FileOperation(FILENAME, ch1));
        char ch2 = 'b';
        Thread t2 = new Thread(new FileOperation(FILENAME, ch2));
        char ch3 = 'c';
        Thread t3 = new Thread(new FileOperation(FILENAME, ch3));
        char ch4 = 'd';
        Thread t4 = new Thread(new FileOperation(FILENAME, ch4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
