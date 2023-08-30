package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * The player's bet.
 **/
public class Bet  {

    /**
      * The player's bet.
     **/
    private Integer bet;

    /**
    * Get bet
    * @return bet
    **/
    @JsonProperty("bet")
    public Integer getBet() {
        return bet;
    }

    /**
     * Set bet
     **/
    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public Bet bet(Integer bet) {
        this.bet = bet;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bet {\n");

        sb.append("    bet: ").append(toIndentedString(bet)).append("\n");
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