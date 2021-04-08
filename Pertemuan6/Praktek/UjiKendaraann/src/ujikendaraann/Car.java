/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraann;

/**
 *
 * @author dwica
 */
public class Car extends MotorVehicle{
    //field
    private boolean seatbelt;
    
    //const
    Car(){
        
    }
    
    //method
    public void setSeatBelt(int seatbelt){
        if(seatbelt > 0){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
    }
    
    public Boolean getSetBelt(){
        return seatbelt;
    }
}
