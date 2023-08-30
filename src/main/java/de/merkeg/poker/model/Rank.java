package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;

/**
 * Gets or Sets RankNOT_FOUND
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum Rank {
    A(String.valueOf("A")), K(String.valueOf("K")), Q(String.valueOf("Q")), J(String.valueOf("J")), _10(String.valueOf("10")), _9(String.valueOf("9")), _8(String.valueOf("8")), _7(String.valueOf("7")), _6(String.valueOf("6")), _5(String.valueOf("5")), _4(String.valueOf("4")), _3(String.valueOf("3")), _2(String.valueOf("2"));

    // caching enum access
    private static final EnumSet<Rank> values = EnumSet.allOf(Rank.class);

    private String value;

    Rank(String value){
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Rank fromValue(String text) {
        for (Rank b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}