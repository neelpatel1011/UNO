/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno_game;

/**
 *
 * @author np755
 */
public enum CardColor {

    RED(0, "Red"),
    YELLOW(1, "Yellow"),
    GREEN(2, "Green"),
    BLUE(3, "Blue"),;
    
    //data memeber

    private int indexNumber;
    private String colorName;

    
    private CardColor(int index, String name) {

        this.indexNumber = index;
        this.colorName = name;

    }
    

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int index) {
        this.indexNumber = index;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String name) {
        this.colorName = name;
    }

    
    public static CardColor getEnumColor(String color) {
        for (CardColor c : CardColor.values()) {
            if (c.colorName.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {

        return String.format("%s", this.colorName);
    }

}
