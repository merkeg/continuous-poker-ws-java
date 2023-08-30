package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.EnumSet;

/**
 * Gets or Sets SuitNOT_FOUND
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum Suit {
    HEARTS(String.valueOf("HEARTS")), SPADES(String.valueOf("SPADES")), CLUBS(String.valueOf("CLUBS")), DIAMONDS(String.valueOf("DIAMONDS"));

    // caching enum access
    private static final EnumSet<Suit> values = EnumSet.allOf(Suit.class);

    private String value;

    Suit(String value){
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Suit fromValue(String text) {
        for (Suit b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}