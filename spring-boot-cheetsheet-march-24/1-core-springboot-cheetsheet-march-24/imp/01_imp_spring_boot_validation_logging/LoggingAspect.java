package com.customerapp.utility;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.infy.exception.InfyBankException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component
@Aspect
public class LoggingAspect {
	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);

	@AfterThrowing(pointcut = "execution(* com.infy.service.*Impl.*(..))", throwing = "exception")
	public void logServiceException(InfyBankException exception) throws Exception {
		//this method will log that meess to the log file
		System.out.println("##############################################");
		System.out.println(exception.getMessage());
		System.out.println("##############################################");
		LOGGER.error(exception.getMessage(), exception);
	}

}
