package de.merkeg.poker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * The poker table, representing the current game state.
 **/
public class Table  {

    /**
      * The poker table, representing the current game state.
     **/
    private List<Card> communityCards = new ArrayList<Card>();
    /**
      * The poker table, representing the current game state.
     **/
    private List<Player> players = new ArrayList<Player>();
    /**
      * The poker table, representing the current game state.
     **/
    private Integer round;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer smallBlind;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer minimumBet;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer minimumRaise;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer pot;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer activePlayer;
    /**
      * The poker table, representing the current game state.
     **/
    private Integer currentDealer;

    /**
    * The list of community cards on the table, visible to everyone.
    * @return communityCards
    **/
    @JsonProperty("communityCards")
    public List<Card> getCommunityCards() {
        return communityCards;
    }

    /**
     * Set communityCards
     **/
    public void setCommunityCards(List<Card> communityCards) {
        this.communityCards = communityCards;
    }

    public Table communityCards(List<Card> communityCards) {
        this.communityCards = communityCards;
        return this;
    }
    public Table addCommunityCardsItem(Card communityCardsItem) {
        this.communityCards.add(communityCardsItem);
        return this;
    }

    /**
    * The list of players at the table, including you.
    * @return players
    **/
    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Set players
     **/
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Table players(List<Player> players) {
        this.players = players;
        return this;
    }
    public Table addPlayersItem(Player playersItem) {
        this.players.add(playersItem);
        return this;
    }

    /**
    * The number of the current round.
    * minimum: 0
    * @return round
    **/
    @JsonProperty("round")
    public Integer getRound() {
        return round;
    }

    /**
     * Set round
     **/
    public void setRound(Integer round) {
        this.round = round;
    }

    public Table round(Integer round) {
        this.round = round;
        return this;
    }

    /**
    * The current small blind of this round.
    * minimum: 0
    * @return smallBlind
    **/
    @JsonProperty("smallBlind")
    public Integer getSmallBlind() {
        return smallBlind;
    }

    /**
     * Set smallBlind
     **/
    public void setSmallBlind(Integer smallBlind) {
        this.smallBlind = smallBlind;
    }

    public Table smallBlind(Integer smallBlind) {
        this.smallBlind = smallBlind;
        return this;
    }

    /**
    * The minimum amount of chips you have to bet if you want to keep playing.
    * minimum: 0
    * @return minimumBet
    **/
    @JsonProperty("minimumBet")
    public Integer getMinimumBet() {
        return minimumBet;
    }

    /**
     * Set minimumBet
     **/
    public void setMinimumBet(Integer minimumBet) {
        this.minimumBet = minimumBet;
    }

    public Table minimumBet(Integer minimumBet) {
        this.minimumBet = minimumBet;
        return this;
    }

    /**
    * The minimum amount of chips you have to bet if you want to raise.
    * minimum: 0
    * @return minimumRaise
    **/
    @JsonProperty("minimumRaise")
    public Integer getMinimumRaise() {
        return minimumRaise;
    }

    /**
     * Set minimumRaise
     **/
    public void setMinimumRaise(Integer minimumRaise) {
        this.minimumRaise = minimumRaise;
    }

    public Table minimumRaise(Integer minimumRaise) {
        this.minimumRaise = minimumRaise;
        return this;
    }

    /**
    * The current size of the pot of this round.
    * minimum: 0
    * @return pot
    **/
    @JsonProperty("pot")
    public Integer getPot() {
        return pot;
    }

    /**
     * Set pot
     **/
    public void setPot(Integer pot) {
        this.pot = pot;
    }

    public Table pot(Integer pot) {
        this.pot = pot;
        return this;
    }

    /**
    * The index of the player whose turn it is. It's you!
    * minimum: 0
    * maximum: 9
    * @return activePlayer
    **/
    @JsonProperty("activePlayer")
    public Integer getActivePlayer() {
        return activePlayer;
    }

    /**
     * Set activePlayer
     **/
    public void setActivePlayer(Integer activePlayer) {
        this.activePlayer = activePlayer;
    }

    public Table activePlayer(Integer activePlayer) {
        this.activePlayer = activePlayer;
        return this;
    }

    /**
    * The index of the player who is the dealer of this round.
    * minimum: 0
    * maximum: 9
    * @return currentDealer
    **/
    @JsonProperty("currentDealer")
    public Integer getCurrentDealer() {
        return currentDealer;
    }

    /**
     * Set currentDealer
     **/
    public void setCurrentDealer(Integer currentDealer) {
        this.currentDealer = currentDealer;
    }

    public Table currentDealer(Integer currentDealer) {
        this.currentDealer = currentDealer;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Table {\n");

        sb.append("    communityCards: ").append(toIndentedString(communityCards)).append("\n");
        sb.append("    players: ").append(toIndentedString(players)).append("\n");
        sb.append("    round: ").append(toIndentedString(round)).append("\n");
        sb.append("    smallBlind: ").append(toIndentedString(smallBlind)).append("\n");
        sb.append("    minimumBet: ").append(toIndentedString(minimumBet)).append("\n");
        sb.append("    minimumRaise: ").append(toIndentedString(minimumRaise)).append("\n");
        sb.append("    pot: ").append(toIndentedString(pot)).append("\n");
        sb.append("    activePlayer: ").append(toIndentedString(activePlayer)).append("\n");
        sb.append("    currentDealer: ").append(toIndentedString(currentDealer)).append("\n");
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