package com.basic.ser1;

import java.io.*;

public class B_DeSerilizationHelloWorld {
    public static void main(String[] args)throws Exception {

        Account account=null;
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("dataser.ser")));
        account=(Account) ois.readObject();
        System.out.println(account);
        System.out.println(account.bankName);
        System.out.println("--------------------");

    }
}
