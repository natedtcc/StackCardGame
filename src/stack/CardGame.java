package stack;
/**
 * @author Jin An
 * Delaware Technical Community College
 * Assignment 4 Starter Code for Card Game using Stack ADT
 */

import java.util.*;

public class CardGame {
	static ArrayList<Integer> cardsDeck = new ArrayList<>();
	static LinkedStack<Integer> cardStack = new LinkedStack<>();
	static LinkedStack<Integer> p1cards = new LinkedStack<>();
	static LinkedStack<Integer> p2cards = new LinkedStack<>();
	static LinkedStack<Integer> p1cardsWon = new LinkedStack<>();
	static LinkedStack<Integer> p2cardsWon = new LinkedStack<>();
	static int rounds = 1;
	
	public static void main(String[] args) {
		
		initializeCards();
		shuffleCards();
		displayDeck();
		
		initializeCardStack();
		// cardStack.printList();
		
		dealCards();
		
		
		System.out.println("\nPlayer 1 now has " + p1cards.length() + " cards.");
		System.out.println("Player 1 cards are: ");
		// Once the toString() method is implemented, this line should be replaced by
		// System.out.println(p1cards);
		System.out.println(p1cards); 
		
		
		System.out.println("Player 2 now has " + p2cards.length() + " cards.");
		System.out.println("Player 2 cards are: ");
		// Once the toString() method is implemented, this line should be replaced by
		// System.out.println(p2cards);
		System.out.println(p2cards);

		
		// Begin game logic
		
		while(rounds<27) {
			
			// Displays cards drawn by each player
			
			System.out.println("Round " + rounds + ": Player one drew a " + p1cards.peek() +". Player "
					+ "two drew a " + p2cards.peek() + "." );
			
			// Scoring / Display round winner
			
			if(p1cards.peek() > p2cards.peek()) {
				p1cardsWon.push(p2cards.peek());
				p1cards.pop();
				p2cards.pop();
				System.out.println("Player 1 has the higher card and wins the round.\n");
				
			}
			else {
				p2cardsWon.push(p1cards.peek());
				p2cards.pop();
				p1cards.pop();
				System.out.println("Player 2 has the higher card and wins the round.\n");
			}
			
			rounds++;
		}	
		
		// Game winner check
		
		if (p1cardsWon.length() > p2cardsWon.length()) 
			System.out.println("Player 1 is the winner with " + p1cardsWon.length() + " cards!");
		else
			System.out.println("Player 2 is the winner with " + p2cardsWon.length() + " cards!");
			
		
		}
		
	

	static void initializeCards() {
		// Deck of cards is filled with integers 0 through 51
		for (int i= 0; i<52; i++) {
			cardsDeck.add(i);
		}
	}
	
	static void shuffleCards() {
		// Shuffle the ArrayList holding the initial deck of cards
		Collections.shuffle(cardsDeck);
	}
	
	static void displayDeck() {
		// Simple method to display all items in deck of cards
		for (int card: cardsDeck) {
			System.out.print(card + " ");
		}
	}
	
	static void initializeCardStack() {
		// The inital ArrayList was used to facilitate shuffling, now we use the Stack ADT to implement the rest of our game
		for (int i= 0; i<52; i++) {
			cardStack.push(cardsDeck.get(i));
		}
	}
	
	static void dealCards() {
		// Deal cards to each player
		for (int i= 0; i<52; i++) {
			if (i%2 == 0) {
				p1cards.push(cardStack.pop());
			} else {
				p2cards.push(cardStack.pop());	
			}
		}
	}
	
}
