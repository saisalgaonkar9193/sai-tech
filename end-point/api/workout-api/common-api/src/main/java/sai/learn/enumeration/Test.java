package sai.learn.enumeration;

public class Test {

    public Test() {
        System.out.println("constructor");
    }

    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
//        Test t=new Test();

        NoClaimBonusEnum noClaimBonusEnum = NoClaimBonusEnum.valueOf("ZERO");
//        System.out.println(noClaimBonusEnum);
    }
}
