package sai.learn.enumeration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum NoClaimBonusEnum {
    ZERO("0"),TWENTY("20");

    private String ncb;
    private static final Map<String,NoClaimBonusEnum> ncbMap=new HashMap<>();

    NoClaimBonusEnum(String value) {
        System.out.println("Constructor Called : "+value);
        this.ncb=value;
    }
    static{
        for(NoClaimBonusEnum noClaimBonusEnum:NoClaimBonusEnum.values()){
            ncbMap.put(noClaimBonusEnum.ncb, noClaimBonusEnum);
        }
    }

    public static NoClaimBonusEnum getNoClaimBonus(String ncbPercent){
        return ncbMap.get(ncbPercent);
    }

    public static String getNoClaimBonusStr(String ncbPercent){
        return Optional.ofNullable(ncbMap.get(ncbPercent)).map(NoClaimBonusEnum::name).orElse("");
    }

    public static void main(String[] args) {
        System.out.println(NoClaimBonusEnum.getNoClaimBonusStr("30"));

    }

}
