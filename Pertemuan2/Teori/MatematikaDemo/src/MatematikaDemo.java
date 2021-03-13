/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
public class MatematikaDemo {

    public static void main(String args[]) {
        
        Matematika hitung = new Matematika();
        hitung.setAngka(10, 10);
        hitung.getPertambahan();
        System.out.println(hitung.x + " + " + hitung.y + " = " + hitung.getPertambahan());
        
        // pengurangan
        hitung.setAngka(10, 5);
        hitung.getPerkurangan();
        System.out.println(hitung.x + " + " + hitung.y + " = " + hitung.getPerkurangan());
        
        // perkalian
        hitung.setAngka(10, 20);
        hitung.getPerkalian();
        System.out.println(hitung.x + " + " + hitung.y + " = " + hitung.getPerkalian());
        
        //pembagian
        hitung.setAngka(20, 2);
        hitung.getPertambahan();
        System.out.println(hitung.x + " + " + hitung.y + " = " + hitung.getPembagian());
        
        
        
    }
}
