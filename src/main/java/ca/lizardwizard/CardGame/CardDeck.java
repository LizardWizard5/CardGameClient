package ca.lizardwizard.CardGame;

import java.util.ArrayList;

public class CardDeck {
    //How this will work is after each turn, the client will send and receive this UnoDeck object to keep track of what cards are available and what are used.
    private ArrayList<Card> cards;
    private ArrayList<Card> usedCards;

    public CardDeck(){
        ArrayList<Card> tempCards = new ArrayList<>();
        /*
        Generate Uno cards,
        A standard deck of Uno cards consists of 108 cards:
            25 cards of each color (red, blue, green, and yellow)
            19 number cards (1 zero and 2 each of one through nine)
            2 Draw 2 cards
            2 Reverse cards
            2 Skip cards
            4 Wild cards
            4 Wild Draw 4 cards
         */
        //Goes through each color
        for(int colorId =0; colorId <4; colorId++){
            //Add the one zero card.
            tempCards.add( new Card(CardColor.values()[colorId],0));
            //Add 2 cards of 1 to 9
            for(int cardNumber = 1;cardNumber <= 9; cardNumber++){
                tempCards.add(new Card(CardColor.values()[colorId],cardNumber));
                tempCards.add(new Card(CardColor.values()[colorId],cardNumber));
            }
        }
        this.cards = tempCards;
    }

}
