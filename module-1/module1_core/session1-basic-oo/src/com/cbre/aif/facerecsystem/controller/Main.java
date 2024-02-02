package com.cbre.aif.facerecsystem.controller;

import com.cbre.aif.facerecsystem.db.Face;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date=new Date();
        java.sql.Date date1=new java.sql.Date(date.getTime());
        //raj
        Face face=new Face();
        face.sveFacePixelOnDb();

        com.cbre.aif.facerecsystem.ui.Face face1=new com.cbre.aif.facerecsystem.ui.Face();
        face1.printFaceOnScreen();

    }
}
