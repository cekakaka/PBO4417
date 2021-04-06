/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasidemo;
import transportasidemo.Bicycle;
import transportasidemo.Mobil;

public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sova = new Bicycle();
        System.out.println("Sova Bicycle Ring ");
        sova.ringBell();
        // Mobil
        System.out.println("");
        Mobil Ramsey = new Mobil(4, "H 1 HU");
        System.out.println("Size of Engine Car Ramsey is "+Ramsey.getSizeOfEngine()+" Stroke");
        System.out.println("Licence Car Ramsey is "+Ramsey.getLicencePlate());
        
        
    }
    
}
