package ca.lizardwizard.CardGame;

import java.util.Arrays;

public class Card {
    private CardColor color;
    private int cardNumber;

    //private boolean isWild;

    /**
     * Generate an uno card
     * @param color Card color, Red, Green, Blue or Red
     * @param cardNumber number within the range of 0-9
     */
    public Card(CardColor color, int cardNumber) {
        if((cardNumber >= 0 && cardNumber <= 9) && Arrays.stream(CardColor.values()).toList().contains(color)) {
            this.color = color;
            this.cardNumber = cardNumber;
        }
        else
            throw new IllegalArgumentException("The card you are trying to create either has a value of below 0 or above 9, OR the color doesn't exist.");
    }
}
