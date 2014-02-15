/*
 * Input and output drivers for the robot.
 */

package net.pvschools.robotics.javabot.practice;

import net.pvschools.robotics.javabot.practice.subsystems.VisionTargetSpotter;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Talon;
import net.pvschools.robotics.javabot.practice.subsystems.Piston;

/**
 *
 * @author Trevor
 */
public class IO
{
    private static IO instance = new IO();
    
    private final Compressor compressor = new Compressor(Map.compressorSwitch,  Map.compressorRelay);
    
    private IO()
    {
    }
    
    public Compressor getCompressor()
    {
        return compressor;
    }
    
    public static IO getInstance()
    {
        return instance;
    }
}
