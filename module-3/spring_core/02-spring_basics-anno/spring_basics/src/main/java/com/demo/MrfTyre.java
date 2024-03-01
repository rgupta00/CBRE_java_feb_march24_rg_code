package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//<bean id="t1" class="com.demo.MrfTyre" primary="true"/>
@Component(value = "mrfTyre")
@Primary
public class MrfTyre implements Tyre{
    public void rotate(){
        System.out.println("mrf tyre");
    }
}
