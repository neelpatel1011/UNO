package uno_game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author np755
 */
 
public class Player {

    private String playerID; 
    private List<Card> hand;

    public Player(String name) {
        playerID = name;
    }

   
    public Player() {
        this.hand = new ArrayList<Card>();
    }

    
    public List<Card> getHandOfCards() {
        return hand;
    }

    
    public String getPlayerID() {
        return playerID;
    }

    
    public static boolean checkId(String name) {
        if(name.length() >= 3) {
            return true;
        }
        return false;
    }

    
    public static boolean checkChar(String name) {
        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean checkUnique(String player1, String player2) {

        if (player1.equals(player2)) {
            throw new IllegalArgumentException("Error, Enter unique user Id");
        }

        return true;
    }

    
     
    public void setPlayerID(String givenID) {
        if (checkId(givenID)
                && checkChar(givenID)) {

            this.playerID = givenID;

        } else {
            throw new IllegalArgumentException("Invalid value, try again..");
        }
    }

    
    @Override
    public String toString() {
        return String.format("Player: %s", this.playerID);
    }
}   

