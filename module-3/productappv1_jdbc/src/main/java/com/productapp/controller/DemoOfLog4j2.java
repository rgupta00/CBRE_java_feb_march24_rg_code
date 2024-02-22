package com.productapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoOfLog4j2 {
    private static Logger logger= LoggerFactory.getLogger(DemoOfLog4j2.class);

    public static void main(String[] args) {

       //Log4j logging framwork
        System.out.println("it is not logging");

        logger.info("it is logging message");
        String data="55X";
        try{
            Integer val=Integer.parseInt(data);
        }catch (Exception e){
            logger.error("some error while converting string to integer "+ e.getMessage());
        }

    }
}