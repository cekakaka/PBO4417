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
public class MotorCycle extends MotorVehicle{
    // field 
    private int numGear;
    
    // const
    MotorCycle() {
    }
    
    //method
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    
    public int getGearFoot(){
        return numGear;
    }
    
    
}
