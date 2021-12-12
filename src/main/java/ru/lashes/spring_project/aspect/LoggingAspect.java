package ru.lashes.spring_project.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* ru.lashes.spring_project.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String metgodName = methodSignature.getName();
        System.out.println("Begin of " + metgodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("End of " + metgodName + "\n");
        return targetMethodResult;
    }
}
