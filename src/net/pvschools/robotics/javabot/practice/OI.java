/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;
import net.pvschools.robotics.javabot.practice.commands.PopFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.PushFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.StartPickup;
import net.pvschools.robotics.javabot.practice.commands.StopPickup;
import net.pvschools.robotics.javabot.practice.commands.Shoot;

public class OI
{
    private static OI instance = new OI();

    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    
    /** Shoot */
    private final Button button1 = new JoystickButton(mainJoystick, 1);
    
    /** Extend Feed <p> Keep extended while holding */
    private final Button button2 = new JoystickButton(mainJoystick, 2);
    
    /** Side Arms Down */
    private final Button button3 = new JoystickButton(mainJoystick, 3);
    
    /** Side Arms Up */
    private final Button button5 = new JoystickButton(mainJoystick, 5);
    
    /** Ramp Down */
    private final Button button4 = new JoystickButton(mainJoystick, 4);
    
    /** Ramp Up */
    private final Button button6 = new JoystickButton(mainJoystick, 6);
    
    /** Spew */
    private final Button button11 = new JoystickButton(mainJoystick, 11);

    private OI()
    {
        SmartDashboard.putNumber("Dampening", .5);
		
        //Button Command Initialization
        button2.whenPressed(new StartPickup());
        button2.whenReleased(new StopPickup());
		
		button11.whenPressed(new PushFeedRollerSpeed(FeedRoller.spewSpeed));
		button11.whenReleased(new PopFeedRollerSpeed());
        
        button1.whenPressed(new Shoot(button5.get()));
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
