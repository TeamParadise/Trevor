/*
 * Input and output drivers for the robot.
 */

package net.pvschools.robotics.javabot.practice;

import net.pvschools.robotics.javabot.practice.Systems.VisionTargetSpotter;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Gyro;
import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 *
 * @author Trevor
 */
public class IO
{
    private static IO instance = new IO();
    
    private final Compressor compressor = new Compressor(Map.compressorSwitch, Map.compressorRelay);
    private final Gyro gyro = new Gyro(Map.gyroPort);
    private final VisionTargetSpotter vp = new VisionTargetSpotter();
    
    //Pistons
    private final Piston kickerPiston = new Piston(Map.kickerPistonArmIn, Map.kickerPistonArmOut);
    private final Piston latchPiston = new Piston(Map.latchPistonArmIn, Map.latchPistonArmOut);
    private final Piston pickupExtensionPiston = new Piston(Map.pickupPistonsIn, Map.pickupPistonsOut);
    private final Piston returnPiston = new Piston(Map.returnPistonArmIn, Map.returnPistonArmOut);
    private final Piston lifterPiston = new Piston(Map.returnPistonArmIn, Map.returnPistonArmOut);
    private final Piston sideArmPiston = new Piston(Map.extendingPistonArmIn, Map.extendingPistonArmOut);
    
    private IO()
    {
        
    }
    
    public Gyro getGyro()
    {
        return gyro;
    }
    
    
    
    public Compressor getCompressor()
    {
        return compressor;
    }
    
    public static IO getInstance()
    {
        return instance;
    }
    
    public VisionTargetSpotter getVisionProcess()
    {
        return vp;
    }
    
    public Piston getKickerPiston(){
        return kickerPiston;
    }
    
    public Piston getLatchPiston(){
        return latchPiston;
    }
    
    public Piston getPickupPiston(){
        return pickupExtensionPiston;
    }
    
    public Piston getReturnPiston(){
        return returnPiston;
    }
    
    public Piston getRampLiftPiston(){
        return lifterPiston;
    }
    
    public Piston getSideArmPiston(){
        return sideArmPiston;
    }
}
