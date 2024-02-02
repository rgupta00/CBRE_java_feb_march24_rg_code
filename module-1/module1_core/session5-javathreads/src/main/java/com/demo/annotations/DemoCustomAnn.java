package com.demo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Annotation processing
//1. define the anntation

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)//it should be accessable ever at run time by java
@interface MyAnn{
    public boolean isValid() default true;
    public String message() default "training is finished";

}
//2. apply the anntation

class Demo{
    @MyAnn(message = "java training is not finished")
    public void doWork(){
        System.out.println("dowork method is called");
    }
}
//3 process it
public class DemoCustomAnn {

    public static void main(String[] args)throws Exception {

        System.out.println(Runtime.getRuntime().availableProcessors());

        Class<?> clazzClass=Class.forName("com.demo.annotations.Demo");
        Method[]methods=clazzClass.getDeclaredMethods();
        for(Method m: methods){
            if(m.isAnnotationPresent(MyAnn.class)){
                MyAnn anno=m.getAnnotation(MyAnn.class);
                System.out.println(anno.isValid()+": "+ anno.message());
            }
        }
    }
}
