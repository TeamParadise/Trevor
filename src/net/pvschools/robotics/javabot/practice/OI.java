/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {
    private static OI instance;

    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    
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
    
    public static OI getInstance(){
        return instance;
    }
    
    public static final int TRIGGER = 1,
                            THUMB = 2;
       
}
