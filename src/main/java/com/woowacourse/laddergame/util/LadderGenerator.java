package com.woowacourse.laddergame.util;

import com.woowacourse.laddergame.domain.Ladder;

public class LadderGenerator {
    public static Ladder generateLadder(NaturalNumber height, NaturalNumber countOfPerson, BooleanGenerator generator) {
        Ladder ladder = new Ladder(height, countOfPerson);

        // 처음 사다리 번호는 1번으로 칭한다
        // TODO static 으로 하고 싶은데 어떻게 이 로직을 쪼갤지? height와 사람의 인덱스까지 필요하고 그려졌다면 다음 칸을 건너 뛰는 로직이라 고민
        for (int h = 1; h <= height.getNumber(); h++) {
            for (int i = 1; i < countOfPerson.getNumber(); i++) {
                if (generator.generate()) {
                    ladder.putBridge(new NaturalNumber(h), new NaturalNumber(i));
                    i++;
                }
            }
        }

        return ladder;
    }
}
