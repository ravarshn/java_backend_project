package com.example.demo.Threads;

import java.io.FileReader;
import java.io.IOException;

public class FileOperation implements Runnable {

    private final String file;
    private final char ch;

    public FileOperation(String file, char ch) {
        this.file = file;
        this.ch = ch;
    }

    public int countChar() throws IOException {
        {
            int count = 0;
            try {
                FileReader F = new FileReader(this.file);

                int b;

                //This loop will read characters and found
                //character will be stored in b.
                while ((b = F.read()) != -1) {
                    // Will print the Characters...
                    if (this.ch == (char) b)
                        count += 1;
                }

                // This will close the opened file.
                F.close();
            } catch (IOException e) {
                // Will print the error if occurs during the process.
                System.out.println(e);
            }
            return count;
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Count of "+this.ch+" in file " + this.file + " is " + this.countChar());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
