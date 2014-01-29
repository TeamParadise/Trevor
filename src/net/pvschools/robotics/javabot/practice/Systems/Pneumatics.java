/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.Systems;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import net.pvschools.robotics.javabot.practice.OI;


public class Pneumatics extends Subsystem {

    private final Compressor compressor;
    private final Piston piston;
    
    public Pneumatics(int index, Piston piston){
        this.compressor = OI.getInstance().getCompressor();
        this.piston = piston;
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
        piston.getSolenoid().set(true);
    }
    
    public void retractJacks(){
        piston.getSolenoid().set(false);
    }
    
}