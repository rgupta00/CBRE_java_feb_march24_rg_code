package com.basic.ser1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A_SerilizationHelloWorld {
    public static void main(String[] args)throws Exception {

        Account account=new Account(1,"raj",560000);
        account.id=555;
        account.name="amit kr";
        account.bankName="PNB";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("dataser.ser")));
        oos.writeObject(account);

        System.out.println("--------------------");

    }
}
