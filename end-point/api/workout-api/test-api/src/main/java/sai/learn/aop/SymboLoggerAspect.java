package sai.learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import sai.learn.aop.annotaion.SymboNotifier;
import sai.learn.aop.exceptions.IntegrationException;

@Aspect
@Component
public class SymboLoggerAspect {



    @AfterThrowing(pointcut = "mailAnnotationPointcut()", throwing = "throwing")
    public <T extends Exception> void setBeforeAdvice(JoinPoint joinPoint, T throwing) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        SymboNotifier annotation = signature.getMethod().getAnnotation(SymboNotifier.class);


        System.out.println(annotation.type());
        System.out.println(throwing.getMessage());
//        System.out.println(throwing.getExceptions());

    }

    @Pointcut("@annotation(sai.learn.aop.annotaion.SymboNotifier)")
    public void mailAnnotationPointcut() {
    }


}
