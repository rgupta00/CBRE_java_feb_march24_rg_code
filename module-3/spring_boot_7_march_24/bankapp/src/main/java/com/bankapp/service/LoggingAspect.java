package com.bankapp.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//Aspect = advice + pointcut
//          logging
@Service
@Aspect
public class LoggingAspect {
    private Logger logger= LoggerFactory.getLogger(LoggingAspect.class);


    //@After , @Before @AfterReturning
    @Around(value = "execution( * com.bankapp.service.*Impl.*(..))")
    public Object xxxxx(ProceedingJoinPoint pjp)throws Throwable{
        String methodName=pjp.getSignature().getName();
        long startTime=System.currentTimeMillis();

        Object value=pjp.proceed();

         long endTime=System.currentTimeMillis();
         logger.info("time taken to execute "+methodName+" method is "+ (endTime-startTime)+" ms");
        return value;
    }

//    @AfterThrowing(value = "execution( * com.bankapp.service.*Impl.*(..))", throwing = "ex")
//    public void xxxxx(JoinPoint joinPoint, Exception ex){
//        String methodName=joinPoint.getSignature().getName();
//
//        System.out.println(ex.getMessage());
//        logger.info(methodName+ " method is called ");
//    }



//    @AfterReturning("execution( * com.bankapp.service.*Impl.*(..))")
//    public void xxxxx(JoinPoint joinPoint){
//        String methodName=joinPoint.getSignature().getName();
//
//        logger.info(methodName+ " method is called ");
//    }




    //if  public void deposit(int accId, double amount) call this mehtod
    //before should be called
//    @Pointcut("execution(public void deposit(..))")
//    public void foo(){}
//
//    @Before("foo()")
//    public void xxxxx(){
//        logger.info("deposit method is called");
//    }

}
