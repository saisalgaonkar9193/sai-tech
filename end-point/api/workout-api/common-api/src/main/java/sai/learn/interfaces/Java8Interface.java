package sai.learn.interfaces;

public interface Java8Interface {

    default void defaultMethod(){
        System.out.println("Java8Interface Default Method");
    }

    static void staticMethod(){
        System.out.println("Java8Interface Static Method");
    }
}
