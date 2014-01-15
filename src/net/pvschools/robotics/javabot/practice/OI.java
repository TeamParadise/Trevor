/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
    
        
    Joystick mainJoystick = new Joystick(Map.joystickPort);
    
    public OI(){
        SmartDashboard.putNumber("damping", .5);
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
    
    
       
}
