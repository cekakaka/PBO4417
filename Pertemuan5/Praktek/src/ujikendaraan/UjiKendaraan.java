/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujikendaraan;

/**
 *
 * @author dwica
 */
public class UjiKendaraan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //------------------ Vehicle -----------------------
        Vehicle Phoenix = new Vehicle();
        Phoenix.goStraight();
        Phoenix.turnLeft();
        Phoenix.turnRight();
        System.out.println("Colored Phoenix Vehicle is "+Phoenix.color);
        //------------------ Bicycle -----------------------
        Bicycle sara = new Bicycle();
        sara.goStraight();
        System.out.println("Colored Sara Bike is "+sara.color);
        System.out.println("Speed Bike sara is "+sara.speed);
        System.out.println("Sara Bicycle Ring ");
        sara.ringBell();
        //------------------ Motor Vehicle --------------------
        MotorVehicle Ramsey = new MotorVehicle(4, "H 1 HU");
        System.out.println("Size of Engine Motorcycle Ramsey is "+Ramsey.getSizeOfEngine()+" Stroke");
        System.out.println("Licence Motorvehicle Ramsey is "+Ramsey.getLicencePlate());
        Ramsey.turnLeft();
        Ramsey.turnRight();
        Ramsey.goStraight();
        
        
        
        
        
    }
    
}
