package com.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class C_ReadingAPhoto_CharStream {
    public static void main(String[] args) throws Exception{
        //time taken: 807 ms
        //time taken: 135 ms
        FileReader fis=new FileReader("/home/raj/Desktop/photo/mali.jpg");
        FileWriter fos=new FileWriter("/home/raj/Desktop/photo/mali_copy2.jpg");

       long start=System.currentTimeMillis();

        int byteRead=1;
        while ((byteRead=fis.read())!=-1){
            fos.write(byteRead);
        }
        fis.close();
        fos.close();
        long end=System.currentTimeMillis();
        System.out.println("time taken: "+ (end-start)+" ms");

    }
}
