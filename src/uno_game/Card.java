/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno_game;

/**
 *
 * @author np755
 */
public class Card {

    
    CardValue valueOfCard;
    CardColor colorOfCard;

    
    public Card() {
    }

    
    public Card(CardValue value, CardColor color) {
        this.valueOfCard = value;
        this.colorOfCard = color;
    }

    
    public CardValue getValueOfCard() {
        return valueOfCard;
    }

    
    public CardColor getColorOfCard() {
        return colorOfCard;
    }

   
    public void setValueOfCard(CardValue value) {
        this.valueOfCard = value;
    }

    
    public void setColorOfCard(CardColor color) {
        this.colorOfCard = color;
    }

    
    @Override
    public String toString() {

        return String.format("Card:%s with color: %s \n", valueOfCard, colorOfCard);

    }
}
