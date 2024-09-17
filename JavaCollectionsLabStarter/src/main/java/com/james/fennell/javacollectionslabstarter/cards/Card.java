/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.james.fennell.javacollectionslabstarter.cards;

import java.util.*;

import static java.lang.System.out;

/**
 *
 * @author James.Fennell
 * The Card class represents a single playing card in the game.
 * Each card has two attributes: its value (ranging from 1 to 10) and its suit 
 * (Hearts, Diamonds, Spades, or Clubs).
 * The class provides methods to access these attributes and a custom string 
 * representation for the card.
 * 
 */
public class Card {
    // Enum to represent the value of the card (1 to 10).
    CardValue value;
    // Enum to represent the suit of the card (Hearts, Diamonds, Spades, or Clubs).
    CardSuit suit;
    //This provides clarity and prevents invalid card values and suits.



    // Constructor for the Card class that initializes a card with a specific value and suit.
    public Card(CardValue value, CardSuit suit) {
        // Assign the value provided by the caller to the card's value attribute.
        this.value = value;
        // Assign the suit provided by the caller to the card's suit attribute.
        this.suit = suit;

    }

    // Getter method for retrieving the value of the card.
    // This method allows other parts of the code to access the value of the card, 
    // which is an instance of the CardValue enum.
    public CardValue getValue() {
        // Return the card's value.
        return value;
    }

    // Getter method for retrieving the suit of the card.
    // This method allows other parts of the code to access the suit of the 
    // card, which is an instance of the CardSuit enum.
    public CardSuit getSuit() {
        // Return the card's suit.
        return suit;

    }

    // Override the toString() method to provide a custom string representation 
    // of the card. This method is automatically called when you try to print 
    // the card or use it in string concatenation.
    @Override
    public String toString() {
        // The card is represented as "<value> of <suit>", e.g., "5 of Hearts".
        return value + "of " + suit;
    }
}