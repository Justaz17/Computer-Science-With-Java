/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.james.fennell.javacollectionslabstarter.cards;

/**
 *
 * @author James.Fennell
 */
// Enum to represent the card values (1 to 10)
public enum CardValue {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), 
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    private final int value;

    CardValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
