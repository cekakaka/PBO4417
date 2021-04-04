/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;

/**
 *
 * @author dwica
 */
public class NumberList {
    private int num = 1;

    NumberList() {
        
    }
    public NumberList(int number){
        this.num = number;
    }
    
    public int setNumber(int num){
        return this.num = num;
    }
    
    public int getNumber(){
        return num;
    }
    
    
}
