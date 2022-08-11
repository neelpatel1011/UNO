package uno_game;


import java.util.Scanner;
import uno_game.Player;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author Neel Patel
 */
public class UNOgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean isValid = true;
        boolean valid = true;
        boolean valid2 = true;

        
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner sc = new Scanner(System.in);

       
        Game game = new Game();
         
        GroupOfCards deck = new GroupOfCards();

        System.out.println("---------- UNO Game-----------");

        // displaying the size of the deck
        System.out.println("Deck size is : " + deck.getSizeOfCardPile());
        deck.shuffle(); // shuffling the deck

        do {
            String playerInput;
            do {
                try {

                    System.out.print("Enter Player 1 ID: ");
                    playerInput = sc.nextLine();
                    player1.setPlayerID(playerInput);
                    isValid = false;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Enter Player 1 ID: ");
                    playerInput = sc.nextLine();

                }

            } while (isValid);

            String player2Input;
            do {
                try {

                    
                    System.out.print("Enter Player 2 ID: ");
                    player2Input = sc.nextLine();
                    valid = false;
                    player2.setPlayerID(player2Input);

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Enter Player 2 ID: ");
                    player2Input = sc.nextLine();
                }
            } while (valid);
            try {

                Player.checkUnique(playerInput, player2Input);
                valid2 = false;
            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
        } while (valid2);

       
        deck.dealCard(player1);
        System.out.println("Size of deck after dealing a hand of "
                + "cards to player 1 is: "
                + deck.getSizeOfCardPile());

        
        deck.dealCard(player2);
        System.out.println("Size of deck after dealing a"
                + " hand of cards to player 2 is: "
                + deck.getSizeOfCardPile());

        System.out.println("Hand of " + player1.getPlayerID() + " is: "
                + player1.getHandOfCards().size());

        System.out.println("Hand of " + player2.getPlayerID() + " is: "
                + player2.getHandOfCards().size());

       
        int currentPlayerIndex = 1;
        Player currentPlayer = player1;

        while (!player1.getHandOfCards().isEmpty()
                && !player2.getHandOfCards().isEmpty()) {

            if (currentPlayerIndex == 1) {
                currentPlayer = player1;
                currentPlayerIndex = 2; 
            } else {
                currentPlayer = player2;
                currentPlayerIndex = 1; 
            }
            
            System.out.println(currentPlayer.toString() + " availble cards:");
            int cardIndex = 1;
            for (Card card : currentPlayer.getHandOfCards()) {
                System.out.print(cardIndex + ":" + card.toString());
                cardIndex++;
            }
            
            System.out.println(currentPlayer.toString()
                    + ": Enter the card index you would like to play between ? ");
            int inputCardIndex = -1;

            while (inputCardIndex == -1) {
                inputCardIndex = sc.nextInt();
                if (inputCardIndex > currentPlayer.getHandOfCards().size()) {
                    System.out.println("Invalid card index .. please try again!");
                    inputCardIndex = -1;
                    continue;
                }
                Card selectedCard = currentPlayer.getHandOfCards()
                        .get(inputCardIndex - 1);
                if (selectedCard.getValueOfCard() == CardValue.SKIP) {
                    if (currentPlayerIndex == 1) {
                        currentPlayerIndex = 2;
                    } else {
                        currentPlayerIndex = 1;
                    }
                }

                currentPlayer.getHandOfCards().remove(inputCardIndex - 1);
            }

        }
       
        game.declareWinner();
    }

}
