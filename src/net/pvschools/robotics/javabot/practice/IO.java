/*
 * Input and output drivers for the robot.
 */

package net.pvschools.robotics.javabot.practice;

import net.pvschools.robotics.javabot.practice.Systems.VisionTargetSpotter;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;
import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 *
 * @author Trevor
 */
public class IO
{
    private static IO instance = new IO();
    
    private final Compressor compressor = new Compressor(Map.compressorSwitch,  Map.compressorRelay);
    private final Gyro gyro = new Gyro(Map.gyroPort);
    private final VisionTargetSpotter vp = new VisionTargetSpotter();
    private final Talon feedRoller = new Talon(Map.feedMotor);
    
    /** Piston */
    private final Piston kickerPiston   = new Piston(Map.kickerPistonArmIn,     Map.kickerPistonArmOut, 500),
                         latchPiston    = new Piston(Map.latchPistonArmIn,      Map.latchPistonArmOut, 500),
                         pickupPiston   = new Piston(Map.pickupPistonsIn,       Map.pickupPistonsOut, 500),
                         returnPiston   = new Piston(Map.returnPistonArmIn,     Map.returnPistonArmOut, 500),
                         lifterPiston   = new Piston(Map.returnPistonArmIn,     Map.returnPistonArmOut, 500),
                         sideArmPiston  = new Piston(Map.extendingPistonArmIn,  Map.extendingPistonArmOut, 500);
    
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
    
    public Talon getFeedRoller(){
        return feedRoller;
    }
    
    public Piston getKickerPiston()
    {
        return kickerPiston;
    }
    
    public Piston getLatchPiston()
    {
        return latchPiston;
    }
    
    public Piston getPickupPiston()
    {
        return pickupPiston;
    }
    
    public Piston getReturnPiston()
    {
        return returnPiston;
    }
    
    public Piston getRampLiftPiston()
    {
        return lifterPiston;
    }
    
    public Piston getSideArmPiston()
    {
        return sideArmPiston;
    }
}
