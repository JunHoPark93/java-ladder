package com.woowacourse.laddergame.domain;

public class Player {
    private static final int MAX_NAME_LENGTH = 5;
    private static final String ILLEGAL_NAME = "all";

    private final String name;

    public Player(String name) {
        checkPlayerNameIfNull(name);
        checkPlayerNameEmptySpace(name);
        checkPlayerNameBlankSpace(name);
        checkPlayerNameLength(name);
        checkPlayerNamePattern(name);

        this.name = name;
    }

    private void checkPlayerNameIfNull(String name) {
        if (name == null) {
            throw new IllegalArgumentException("null을 입력할 수 없습니다");
        }
    }

    private void checkPlayerNameEmptySpace(String name) {
        if (name.contains(" ")) {
            throw new IllegalArgumentException("이름에 공백이 있으면 안됩니다");
        }
    }

    private void checkPlayerNameBlankSpace(String name) {
        if (name.trim().length() == 0) {
            throw new IllegalArgumentException("공백을 입력할 수 없습니다");
        }
    }

    private void checkPlayerNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자 까지 가능합니다");
        }
    }

    private void checkPlayerNamePattern(String name) {
        if (name.equals(ILLEGAL_NAME)) {
            throw new IllegalArgumentException("all은 player 이름으로 입력할 수 없습니다");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format("%6.6s", name);
    }
}
