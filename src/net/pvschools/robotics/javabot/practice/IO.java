/*
 *Input and output drivers for the robot.
 */

package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Gyro;
import net.pvschools.robotics.javabot.practice.Systems.Piston;

/**
 *
 * @author Trevor
 */
public class IO {
    
    private static IO instance;
    private final Compressor compressor = new Compressor(Map.compressorSwitch, Map.compressorRelay);
    private final Piston[] pistons = {new Piston(Map.shooterRelay, Map.shooterSolonoid)};
    private final Gyro gyro = new Gyro(Map.gyroPort);
    
    public IO(){
    }
    
    public static void init(){
        instance = new IO();
    }
    
    public Gyro getGyro(){
        return gyro;
    }
    
    public Piston getPiston(int index){
        return pistons[index];
    }
    
    public Piston[] getPistons(){
        return pistons;
    }
    
    public Compressor getCompressor(){
        return compressor;
    }
    
    public static IO getInstance(){
        return instance;
    }
    
}