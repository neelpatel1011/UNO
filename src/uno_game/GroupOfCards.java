/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno_game;

/**
 *
 * @author np755
 */

import java.util.*;
// ArrayList, Collections, List, Random

public class GroupOfCards { 


    private List<Card> cardPile;

    public GroupOfCards() {
        this.cardPile = new ArrayList<>();
        for (CardValue value : CardValue.values()) {
            for (CardColor color : CardColor.values()) {
                cardPile.add(new Card(value, color));
            }
        }
    }

    
    List<Card> getCardPile() {
        return cardPile;
    }
     
    public void setCardPile(List<Card> cardPile) {
        this.cardPile = cardPile;
    }
 
   
    public void shuffle() {
        Random rand = new Random();
       
        for (int i = 0; i < 8; i++) {
            int firstCard = rand.nextInt(this.cardPile.size());
            int secondCard = rand.nextInt(this.cardPile.size());
            Collections.swap(cardPile, firstCard, secondCard);
        }
    }

  
    public void dealCard(Player player) {

        for (int i = 0; i < 8; i++) {
            Card deleteCard = cardPile.remove(0);
            player.getHandOfCards().add(deleteCard);
        }

    }

    public Card dealCard() {
        Card removedCard = cardPile.remove(0);
        return removedCard;
    }

    
    public Card drawCard() {
        if (cardPile.isEmpty()) {
            System.out.println("It is a draw");
        }
        return cardPile.remove(0);
    }

    
    public int getSizeOfCardPile() {
        return cardPile.size();
    }

    
    @Override
    public String toString() {
        return "Deck{"
                + "cardDeck=" + cardPile
                + '}';
    }
}
