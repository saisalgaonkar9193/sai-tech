package sai.learn.stringUtility;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerUtil {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        StringJoiner sj1 = new StringJoiner("|");
        String[] strArr = {"SAI", "SUN", "JON"};

        Arrays.stream(strArr).forEach(str -> {
            sj.add(str);
            sj1.add(str);
        });

        System.out.println(sj.length());
        System.out.println(sj.toString());
        System.out.println(sj1.length());
        System.out.println(sj1.toString());
        sj.merge(sj1);
        System.out.println(sj.toString());
    }
}
