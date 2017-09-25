package com.frankmoley.talks.spring.intro.exersize5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;

@Aspect
@Component
public class LoggableAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger("AuditLogger");

    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){}

    @Around("executeLogging()")
    public Object adviseLogging(ProceedingJoinPoint joinPoint) throws Throwable{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object returnValue = null;
        try {
            returnValue = joinPoint.proceed();
            return returnValue;
        }finally {
            stopWatch.stop();
            StringBuilder message = new StringBuilder();
            message.append("method=").append(joinPoint.getSignature().getName()).append("|");
            message.append("time=").append(stopWatch.getTotalTimeMillis()).append("ms|");
            Object[] args = joinPoint.getArgs();
            if(null!=args && args.length>0){
                message.append("args={");
                boolean first=true;
                Arrays.asList(args).forEach(arg->{
                    if(!first){
                        message.append("|");
                    }
                    message.append(arg);
                });
                message.append("}");
            }
            LOGGER.info(message.toString());

        }

    }
}
