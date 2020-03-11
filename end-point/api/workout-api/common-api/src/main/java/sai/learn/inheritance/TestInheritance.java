package sai.learn.inheritance;

import java.io.IOException;

public class TestInheritance {
    public static void main(String[] args) {
        Account a=new CurrentAccount();
    }
}

interface Interest{
    void getInterest();
}

abstract class Account{



}

class CurrentAccount extends Account{
    void doThis()throws Exception {

    }
}

class SavingAccount extends CurrentAccount{
     void doThis()throws RuntimeException{

    }
}