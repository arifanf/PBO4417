/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author ASUS
 */
public class TestGame {
    public static void main(String[] args) {
        // Player
        GamePlayer player1 = new GamePlayer(20,50,60,60);
        player1.display();
        player1.Run();
        player1.Run(30);

        // Enemy
        GameEnemy player2 = new GameEnemy(40,100,80,80);
        player2.display();
        player2.Run();
    }
}
