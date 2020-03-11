package sai.learn.challenges;

import java.util.HashMap;
import java.util.Map;

public class Challenge5 {

    static String word = "potat0";
    static Map<Character, Integer> characterOccurence = new HashMap<>();

    public static void main(String[] args) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            characterOccurence.merge(word.charAt(i), 1, (x, y) -> x + y);
        }

        Integer reduce = characterOccurence.entrySet()
                .stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() % 2 != 0)
                .map(characterIntegerEntry -> {
                    return 1;
                })
                .reduce(0, Integer::sum);

        System.out.println(reduce);

    }

}
