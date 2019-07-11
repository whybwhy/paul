package org.paul.aop;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Slf4j
@Component
public class LogAdvice {

    @Before( "execution(* org.paul.service.AOPService*.*(..))")  // pointcut
    public void beforeLog() {
        log.info("=BEFORE==========================");
    }

    @Before("execution(* org.paul.service.AOPService*.add(String, String)) && args(str1, str2)")
    public void beforeLogWithParameter(String str1, String str2) {
        log.info(str1);
        log.info(str2);
    }

    @AfterThrowing(pointcut = "execution(* org.paul.service.AOPService*.*(..))", throwing = "exception")
    public void afterException(Exception exception) {
        log.info("=AFTER THROWING==========================");
        log.info(exception.toString());
    }

    @AfterReturning( "execution(* org.paul.service.AOPService*.*(..))")  // pointcut
    public void afterReturning() {
        log.info("=AFTER RETURNING==========================");
    }

    @Around("execution(* org.paul.service.AOPService*.*(..))")
    public Object around(ProceedingJoinPoint pjp) {

        long start = System.currentTimeMillis();

        log.info("Target " + pjp.getTarget());
        log.info("Param " + Arrays.toString(pjp.getArgs()));

        // invoke
        Object result = null;

        try {
            result = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        log.info("TIME : " + Long.toString(end - start));

        return result;
    }
}
