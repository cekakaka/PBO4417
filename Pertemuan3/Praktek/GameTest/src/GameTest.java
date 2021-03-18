/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class GameTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GamePlayer ck = new GamePlayer();
        ck.setPosition(2, 1);
        ck.Run(10);
        
        GameEnemy monster = new GameEnemy();
        monster.setPosition(12, 6);
        monster.RUN();
        System.out.println("Enemy still running current X position x = "+ monster.getX()+" and position y = "+ monster.getY());
    }
}
