/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.Systems;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Pneumatics extends Subsystem {

    private Compressor compressor;
    private Piston;
    
    public Pneumatics(int index, Compressor compressor){
        this.compressor = OI.getInstance();
    }
    
    public boolean isMaxPSI(){
        return compressor.getPressureSwitchValue();
    }
    
    public void runCompressor(){
        compressor.start();
    }
    
    public void stopCompressor(){
        compressor.stop();
    }

    protected void initDefaultCommand() {
    }
    
    public void extendJacks(){
        jacks.set(true);
    }
    
    public void retractJacks(){
        jacks.set(false);
    }
    
}