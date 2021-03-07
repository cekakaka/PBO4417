
import java.nio.channels.Channel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwica
 */
class TV{
    // field
        int channel = 3;
        int volumeLevel = 2;
        boolean on;
        
        // constructor
        public TV(int newChannel, int newVolumeLevel, boolean newOn){
            channel = newChannel;
            volumeLevel = newVolumeLevel;
            on = newOn;            
        }
        
        TV(){
            
        }
        // set turnOn
        public void turnOn(){
            
        }
        // set turnOff
        public void turnOff(){
            
        }
        
        // set Channel
        public void setChannel(int newChannel){
            channel = newChannel;
        }
        
        //set Volume
        public void setVolume(int newVolume){
            volumeLevel = newVolume;
        }
        
        // set channel up 
        public void channelUp(){
            
        }
        
        // set channel down
        public void channelDown(){
            
        }
        
        //set volumeUp
        public void volumeUp(){
            
        }
        
        //set volumeDown
        public void volumeDown(){
            
        }
}    

public class TestTV {
    
    
    public static void main(String args[]) {
        
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1 is channel is "+ tv1.channel 
                + " and volume level is "+ tv1.volumeLevel);
        System.out.println("tv2 is channel is "+ tv2.channel 
                + " and volume level is "+ tv2.volumeLevel);
        
    }
}
