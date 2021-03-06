package com.woowacourse.laddergame.domain;

import com.woowacourse.laddergame.util.NaturalNumber;

import java.util.List;

public class Results {
    private final List<Result> results;

    public Results(List<Result> results) {
        this.results = results;
    }

    public Result get(NaturalNumber resultNo) {
        return results.get(resultNo.convertIndex());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Result result : results) {
            sb.append(result.toString());
        }
        return sb.toString();
    }
}
