/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.james.fennell.javacollectionslabstarter;


import com.james.fennell.javacollectionslabstarter.cards.Card;
import com.james.fennell.javacollectionslabstarter.cards.CardValue;
import com.sun.jdi.Value;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author James.Fennell
 * This class represents a player in the card game. Each player has a name and a hand of cards.
 * The hand is represented as a Set to ensure no duplicate cards are added.
 */
public class Player {

    // Field to store the player's name
    String name;

    // Field to store the player's hand of cards, using a Set to prevent duplicates
    Set<Card> hand = new HashSet<>();

    // Constructor to initialize the player's name and their hand (which starts as an empty HashSet)
    public Player(String name) {
        this.name = name;
    }

    // Method to retrieve the player's name
    public String getName() {
        // Return the player's name
        return name;

    }

    // Method to add a card to the player's hand
    // The Set will automatically prevent adding duplicate cards
    public void addCard(Card card) {
        // Add the card to the hand
        hand.add(card);
    }

    // Method to calculate the total value of all cards in the player's hand
    // The total is calculated by summing up the numeric value of each card in the hand
    public int getTotalCardValue() {
        // Initialize the total to 0
int total = 0;
        // Loop through each card in the hand
        for (Card card : hand) {
            // Add the value of the card to the total
            CardValue cv = card.getValue();
            total += cv.getValue();

        }
        // Return the total value of the hand
        return total;
    }

    // Override the toString() method to return a string representation of the player
    // This includes the player's name and their current hand of cards
    @Override
    public String toString() {
        // Return the player's name and their hand
        return name + " drew: " + hand;
    }
}
