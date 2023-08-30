package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * A playing card.
 **/
public class Card  {

    /**
      * A playing card.
     **/
    private Rank rank;
    /**
      * A playing card.
     **/
    private Suit suit;

    /**
    * Get rank
    * @return rank
    **/
    @JsonProperty("rank")
    public Rank getRank() {
        return rank;
    }

    /**
     * Set rank
     **/
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Card rank(Rank rank) {
        this.rank = rank;
        return this;
    }

    /**
    * Get suit
    * @return suit
    **/
    @JsonProperty("suit")
    public Suit getSuit() {
        return suit;
    }

    /**
     * Set suit
     **/
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Card suit(Suit suit) {
        this.suit = suit;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Card {\n");

        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    suit: ").append(toIndentedString(suit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}