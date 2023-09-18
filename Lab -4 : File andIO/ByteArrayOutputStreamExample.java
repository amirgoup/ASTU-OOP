package com.astu;
import java.io.*;

public class DataStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        bout.flush();
        bout.close(); // has no effect
        System.out.println("Success...");
    }
}
