/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.james.fennell.javacollectionslabstarter;

/**
 *
 * @author James.Fennell - Completed by - Justas Jokubauskas
 */
public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame();

        // Add players
        Player alice = new Player("Alice");
        Player bob = new Player("Bob");
        Player charlie = new Player("Charlie");

        game.addPlayer(alice);
        game.addPlayer(bob);
        game.addPlayer(charlie);

        // Play 5 rounds
        game.playGame(5);

        // Announce the winner
        game.announceWinner();
    }
}
