package com.bankapp.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Aspect //Aspect=adv+ pointcut
public class LoggingAspect {
    //i wnat to write logging code at this central loc
    private Logger logger= LoggerFactory.getLogger(AccountServiceImpl.class);

    @Around("execution(public void transfer(..))")
    public Object applyLogging(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        String methodName=proceedingJoinPoint.getSignature().getName();
        long startTime=System.currentTimeMillis();

        Object result=proceedingJoinPoint.proceed();

        long endTime=System.currentTimeMillis();
        logger.info("time taken for method ex :"+methodName+" is "+(endTime-startTime)+" ms");
        return result;
    }
}
