/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI
{
    private static OI instance = new OI();

    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    
    /** Shoot */
    private final Button button1 = new JoystickButton(mainJoystick, 1);
    
    /** Extend Feed <p> Keep Extended while holding
     */
    private final Button button2 = new JoystickButton(mainJoystick, 2);
    
    /** Side Arms Down */
    private final Button button3 = new JoystickButton(mainJoystick, 3);
    
    /** Side Arms Up */
    private final Button button5 = new JoystickButton(mainJoystick, 5);
    
    /** Ramp Down */
    private final Button button4 = new JoystickButton(mainJoystick, 4);
    
    /** Ramp Up */
    private final Button button6 = new JoystickButton(mainJoystick, 6);

    private OI()
    {
        SmartDashboard.putNumber("Dampening", .5); 
        //Button Command Initialization
    }
    
    public double getDampening()
    {
        return SmartDashboard.getNumber("Dampening");
    }
    
    public double getDriveThrottle()
    {
        return mainJoystick.getThrottle();
    }
    
    public double getDriveX()
    {
        return mainJoystick.getY();
    }
    
    public double getDriveY()
    {
        return mainJoystick.getX();
    }
    
    public double getDriveTwist()
    {
        return mainJoystick.getTwist();
    }
    
    public static OI getInstance()
    {
        return instance;
    }
}
