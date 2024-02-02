package com.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class D_ReadingAPhotoBufferSol1 {
    public static void main(String[] args) throws Exception{
        //time taken: 807 ms
        //time taken: 1 ms
        FileInputStream fis=new FileInputStream("/home/raj/Desktop/photo/mali.jpg");
        FileOutputStream fos=new FileOutputStream("/home/raj/Desktop/photo/mali_copy.jpg");

       long start=System.nanoTime();

       byte[] byteBuffer=new byte[4*1024];

        int numberOfByteRead=1;
        while ((numberOfByteRead=fis.read(byteBuffer))!=-1){
            fos.write(byteBuffer, 0, numberOfByteRead);
        }
        fis.close();
        fos.close();
        long end=System.nanoTime();
        System.out.println("time taken: "+ (end-start)+" ns");

    }
}
