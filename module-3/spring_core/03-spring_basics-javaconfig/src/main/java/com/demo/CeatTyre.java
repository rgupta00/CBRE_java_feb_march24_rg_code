package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="t2" class="com.demo.CeatTyre"/>
@Component(value = "ceatTyre")
public class CeatTyre implements Tyre {
    public void rotate(){
        System.out.println("ceat tyre");
    }
}
