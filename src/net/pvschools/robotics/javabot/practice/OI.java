/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.Systems.Piston;


public class OI {
    private static OI instance;
        
    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    private final Compressor compressor = new Compressor(Map.compressorSwitch, Map.compressorRelay);
    private final Piston[] pistons = {new Piston(Map.shooterRelay, Map.shooterSolonoid)};
    private final Gyro gyro = new Gyro(Map.gyroPort);
    
    public OI(){
        SmartDashboard.putNumber("damping", .5);
        instance = this;
        //Initialize buttons and such
        
    }
    
    public double getDamping(){
        return SmartDashboard.getNumber("damping");
    }
    
    public double getDriveThrottle(){
        return mainJoystick.getThrottle();
    }
    
    public double getDriveX(){
        return mainJoystick.getY();
    }
    
    public double getDriveY(){
        return mainJoystick.getX();
    }
    
    public double getDriveTwist(){
        return mainJoystick.getTwist();
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
    
    public static OI getInstance(){
        return instance;
    }
    
    public static final int TRIGGER = 1,
                            THUMB = 2;
       
}
