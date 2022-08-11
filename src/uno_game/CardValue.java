/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno_game;

/**
 *
 * @author np755
 */
public enum CardValue {

    ZERO(0, "Zero"),
    ONE(1, "One"),
    TWO(2, "Two"),
    THREE(3, "Three"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    SKIP(10, "Skip"),
    REVERSE(11, "Reverse"),
    DRAWTWO(12, "Draw two"),
    DRAWFOUR(13, "Draw four"),
    WILDCARD(14, "Wildcard"),;

    
    private int indexOfCard;
    private String nameOfCard;

    
    private CardValue(int index, String name) {

        this.indexOfCard = index;
        this.nameOfCard = name;

    }

   
    public int getIndexOfCard() {
        return indexOfCard;
    }

    public void setIndexOfCard(int index) {
        this.indexOfCard = index;
    }
    
    public String getNameOfCard() {
        return nameOfCard;
    }

    public void setNameOfCard(String name) {
        this.nameOfCard = name;
    }

    
    @Override
    public String toString() {
        return String.format("%s", this.nameOfCard);
    }
    

}
