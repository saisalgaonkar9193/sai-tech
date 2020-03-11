package sai.learn.aop.annotaion;


public enum SymboStage {

    QUOTE("Quote"),PROPOSAL("Proposal"),PAYMENT("Payment");

    private String alias;

    SymboStage(String alias){
        this.alias=alias;
    }

    public String getAlias() {
        return alias;
    }
}
