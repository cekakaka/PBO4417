/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class GamePlayer {
    // field
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    
    // construktor 
    GamePlayer(){
    }
    public GamePlayer(double newWidth, double newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }
    public GamePlayer(double newWidth, double newHeight, int newPosX, int newPosY){
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
    public int getX(){
        return positionX;
    }
    public int getY(){
        return positionY;
    }
    public void RUN(){
        System.out.println("Player Is Running");
    }
    public void Run(int incrementX){
        this.positionX += incrementX;
        System.out.println("Player still running current X position = "+ this.positionX);
      
    }
    
        
}
