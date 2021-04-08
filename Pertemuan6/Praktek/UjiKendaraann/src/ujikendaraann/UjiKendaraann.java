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
public class UjiKendaraann {

    public static void KendaraanMaju(Vehicle vehicle){
        vehicle.goStraight();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------- Vehicle ---------------");
        Vehicle sara = new Vehicle();
        System.out.println("Kecepatan Kendaraan Sara : "+sara.speed);
        System.out.println("Warna Kendaraan Sara : "+sara.color);
        
        System.out.println("------------- Bicycle ---------------");
        Bicycle raze = new Bicycle();
        System.out.println("Warna Sepeda Raze : "+raze.color);
        raze.ringBell();
        KendaraanMaju(raze);
        
        System.out.println("------------- Motorcycle ---------------");
        MotorCycle pugna = new MotorCycle();
        pugna.setGearFoot(6);
        System.out.println("Gear Foot Motorcycle Pugna is : "+pugna.getGearFoot());
        System.out.println("Licence Plate Motorcycle Pugna is : "+pugna.licencePlate);
        pugna.turnLeft();
        
        System.out.println("--------------- Car -----------------");
        Car Alucard = new Car();
        Alucard.setSeatBelt(1);
        System.out.println("Are the seat belts of the Alucard car safe? "+Alucard.getSetBelt());
        System.out.println("Size of Engine Alucard car is : "+Alucard.getSizeOfEngine());
        System.out.println("Licence Plate Car Alucard is : "+pugna.licencePlate);
        
        
        
    }
    
}
