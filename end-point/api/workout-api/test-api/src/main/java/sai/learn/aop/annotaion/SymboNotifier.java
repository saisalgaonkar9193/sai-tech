package sai.learn.aop.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SymboNotifier {

    NotificationType[] type();

    SymboProduct product();

    SymboStage stage();

    String  subject() default "";

}
