/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class GameEnemy {
    // field
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    // construktor 
    GameEnemy(){
    }
    public GameEnemy(double newWidth, double newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }
    public GameEnemy(double newWidth, double newHeight, int newPosX, int newPosY){
        this.width = newWidth;
        this.height = newHeight;
        this.positionX = newPosX;
        this.positionY = newPosY;        
    }
    
    // set
    public void setDimension(double newWidth, double newHeight){
        this.width = newWidth;
        this.height = newHeight;       
    }
    public void setPosition(int newPosX, int newPosY){
        this.positionX = newPosX;
        this.positionY = newPosY;
    }
    
    // get 
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getX(){
        return positionX;
    }
    public double getY(){
        return positionY;
    }
    public void RUN(){
        System.out.println("Enemy is Running");
    }
    
}
