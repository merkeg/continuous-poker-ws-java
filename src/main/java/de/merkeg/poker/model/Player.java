package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * A player at the poker table.
 **/
public class Player  {

    /**
      * A player at the poker table.
     **/
    private String name;

    public enum StatusEnum {
        ACTIVE(String.valueOf("ACTIVE")), FOLDED(String.valueOf("FOLDED")), OUT(String.valueOf("OUT"));

        // caching enum access
        private static final java.util.EnumSet<StatusEnum> values = java.util.EnumSet.allOf(StatusEnum.class);

        String value;

        StatusEnum (String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StatusEnum fromValue(String v) {
            for (StatusEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }
    /**
      * A player at the poker table.
     **/
    private StatusEnum status;
    /**
      * A player at the poker table.
     **/
    private Integer stack;
    /**
      * A player at the poker table.
     **/
    private Integer bet;
    /**
      * A player at the poker table.
     **/
    private List<Card> cards = null;

    /**
    * The player name.
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public Player name(String name) {
        this.name = name;
        return this;
    }

    /**
    * The player's status. Indicates whether they are still in the game (ACTIVE), they have folded their current cards (FOLDED) or they are out of chips (OUT).
    * @return status
    **/
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Player status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
    * The player's chip stack.
    * minimum: 0
    * @return stack
    **/
    @JsonProperty("stack")
    public Integer getStack() {
        return stack;
    }

    /**
     * Set stack
     **/
    public void setStack(Integer stack) {
        this.stack = stack;
    }

    public Player stack(Integer stack) {
        this.stack = stack;
        return this;
    }

    /**
    * The player's current bet.
    * minimum: 0
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

    public Player bet(Integer bet) {
        this.bet = bet;
        return this;
    }

    /**
    * The player's cards. Will only be provided for the active player, i.e. you!
    * @return cards
    **/
    @JsonProperty("cards")
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Set cards
     **/
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Player cards(List<Card> cards) {
        this.cards = cards;
        return this;
    }
    public Player addCardsItem(Card cardsItem) {
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Player {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
        sb.append("    bet: ").append(toIndentedString(bet)).append("\n");
        sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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