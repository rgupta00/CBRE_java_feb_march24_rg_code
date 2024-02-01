package com.basic.io;

import java.io.*;

public class F_DataOutputVsDataInputSteam {
    public static void main(String[] args) throws Exception{
        //time taken: 807 ms
        //time taken: 1 ms

        //time taken: 19 ms
        


        DataOutputStream dos=new DataOutputStream
                (new BufferedOutputStream(new FileOutputStream(new File("data3.txt"))));
        for(int i=0;i<5;i++){
            dos.writeInt(i);
            dos.writeShort(i);
        }
        dos.close();

        DataInputStream dis=new DataInputStream
                (new BufferedInputStream(new FileInputStream(new File("data3.txt"))));
        for(int i=0;i<5;i++){
            System.out.println(dis.readInt()+" "+ dis.readShort());
        }
        dis.close();

        long end=System.currentTimeMillis();


    }
}
