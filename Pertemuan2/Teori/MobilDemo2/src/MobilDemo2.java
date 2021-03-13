/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class MobilDemo2 {

    public static void main(String args[]) {
        Mobil2 bmw = new Mobil2();
        bmw.setHidupkanMobil("On");
        System.out.println("Hidupkan Mobil = " + bmw.key);
        bmw.setMatikanMobil("Off");
        System.out.println("Matikan Mobil = " + bmw.key);
        bmw.setUbahGigi(2);
        System.out.println("Ubah Gigi Menjadi "+ bmw.gigi);
               
    }
}
