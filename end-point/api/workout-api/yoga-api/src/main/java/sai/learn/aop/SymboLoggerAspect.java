package sai.learn.aop;

import com.bayview.audit.annotation.Auditable;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SymboLoggerAspect {



    @AfterThrowing(pointcut = "mailAnnotationPointcut()", throwing = "throwing")
    public <T extends Exception> void setBeforeAdvice(JoinPoint joinPoint, T throwing) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        SymboNotifier annotation = signature.getMethod().getAnnotation(SymboNotifier.class);


        System.out.println(annotation.subject());
        System.out.println(throwing.getMessage());
//        System.out.println(throwing.getExceptions());

    }

    @Pointcut("@annotation(com.bayview.audit.annotation.Auditable)")
    public void mailAnnotationPointcut() {
    }

    @Before(value = "mailAnnotationPointcut() && args(yourString,..)")
    public  void setBeforeAdvice(JoinPoint joinPoint ,Object yourString) {



        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Auditable annotation = signature.getMethod().getAnnotation(Auditable.class);


        System.out.println(yourString.getClass());
    }

}
