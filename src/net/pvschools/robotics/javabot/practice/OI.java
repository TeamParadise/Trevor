/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.OpenPiston;

public class OI {
    private static OI instance;

    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    private final Button button1 = new JoystickButton(mainJoystick, 1);
    
    public OI(){
        SmartDashboard.putNumber("damping", .5);
        button1.whenPressed(new OpenPiston(IO.getInstance().getPiston(0)));
        //Initialize buttons and such
        
    }
    
    public static void init(){
        instance = new OI();
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
