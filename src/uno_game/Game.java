/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uno_game;

/**
 *
 * @author np755
 */
import java.util.ArrayList;
public class Game 
{

    
    private ArrayList<Player> players; 
    GroupOfCards card = new GroupOfCards();
    Player player = new Player();

    public Game() 
    {
        players = new ArrayList();
    }

   
    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    
    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }

   
    public void declareWinner() 
    {

        if (card.getCardPile().isEmpty()) 
        {
            System.out.println("It's a draw! Better Luck Next Time");
        } 
        else if (player.getHandOfCards().isEmpty()) 
        {
            System.out.println("Player 1 won. Congratulations... :) ");
        } 
        else 
        {
            System.out.println("Player 2 won. Congratulations... :) ");
        }

    }

}
