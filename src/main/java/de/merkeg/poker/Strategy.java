package de.merkeg.poker;

import de.merkeg.poker.model.Table;

import java.util.Random;

public class Strategy {

    private Random r = new Random();

    public static Settings setup() {
        return Settings.builder()
                .host("localhost:8080")
                .gameId(1494090988)
                .teamName("zerstoerer")
                .build();
    }

    public int decide(final Table table) {
        return r.nextBoolean() ? table.getMinimumBet() : 0;
    }
}
