package lotto;

import java.util.*;

public class HardLottoGenerator implements LottoGenerator {
    @Override
    public List<Integer> generate() {
        Set<Integer> mySet = new HashSet<>();
        while (mySet.size() < 6) {
            int number = (int) (Math.random() * 48 + 1);
            mySet.add(number);
        }

        List<Integer> list = new ArrayList<>(mySet);
        return list;
    }

    @Override
    public String generateDescription() {
        StringBuilder score = new StringBuilder();
        for (Integer integer : generate()) {
            score.append(integer + ",");
            score.deleteCharAt(score.length() - 1);//usuwam przecinek w ostatnim miejcu
            score.append(". ");//dorzucam kropki*/


        }
        return score.toString();
    }
}