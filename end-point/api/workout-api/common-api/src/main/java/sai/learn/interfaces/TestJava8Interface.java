package sai.learn.interfaces;

public class TestJava8Interface implements Java8Interface{

    public static void main(String[] args) {
        Java8Interface.staticMethod();
        TestJava8Interface t=new TestJava8Interface();
        t.defaultMethod();
//        t.st

    }

    private static void staticMethod(){
        System.out.println("TestJava8Interface static Method");
    }
}
