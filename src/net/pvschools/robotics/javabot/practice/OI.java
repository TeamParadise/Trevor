/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.ChargeKicker;
import net.pvschools.robotics.javabot.practice.commands.PassCommand;
import net.pvschools.robotics.javabot.practice.commands.PopFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.PrimeRobot;
import net.pvschools.robotics.javabot.practice.commands.PushFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.ResetKicker;
import net.pvschools.robotics.javabot.practice.commands.StartPickup;
import net.pvschools.robotics.javabot.practice.commands.StopPickup;
import net.pvschools.robotics.javabot.practice.commands.Shoot;
import net.pvschools.robotics.javabot.practice.commands.StartCatch;
import net.pvschools.robotics.javabot.practice.commands.StopCatch;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendLittleKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.LowerRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.RaiseRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractLittleKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;

public class OI
{
    private static final OI instance = new OI();

    private final Joystick mainJoystick = new Joystick(Map.joystickPort);
    
    /** Shoot */
    private final Button button1 = new JoystickButton(mainJoystick, 1);
    
    /** Extend Feed <p> Keep extended while holding */
    private final Button button2 = new JoystickButton(mainJoystick, 2);
    
    private final Button button3 = new JoystickButton(mainJoystick, 3);
    
    private final Button button5 = new JoystickButton(mainJoystick, 5);
    
    private final Button button4 = new JoystickButton(mainJoystick, 4);
    
    private final Button button6 = new JoystickButton(mainJoystick, 6);
    
    private final Button button7 = new JoystickButton(mainJoystick, 7);
    
    private final Button button8 = new JoystickButton(mainJoystick, 8);
    
    private final Button button9 = new JoystickButton(mainJoystick, 9);
    
    private final Button button10 = new JoystickButton(mainJoystick, 10);
    
    private final Button button11 = new JoystickButton(mainJoystick, 11);
    
    private final Button button12 = new JoystickButton(mainJoystick, 12);

    private OI()
    {
        SmartDashboard.putNumber("Dampening", .9);
		
		// Add commands to smart dashboard:
		SmartDashboard.putData(new OpenCatcher());
		SmartDashboard.putData(new CloseCatcher());
		SmartDashboard.putData(new RaiseRamp());
		SmartDashboard.putData(new LowerRamp());
		SmartDashboard.putData(new ExtendPickup("Extend Pickup"));
		SmartDashboard.putData(new RetractPickup());
		SmartDashboard.putData(new ChargeKicker());
		SmartDashboard.putData(new ResetKicker());
		SmartDashboard.putData(new ExtendLittleKicker());
		SmartDashboard.putData(new RetractLittleKicker());
		SmartDashboard.putData(new ExtendBigKicker());
		SmartDashboard.putData(new RetractBigKicker());
		SmartDashboard.putData(new OpenLatch());
		SmartDashboard.putData(new CloseLatch());
		SmartDashboard.putData(new PrimeRobot());
        
        SmartDashboard.putBoolean("Extend Pickup", false);
		
        //Button Command Initialization
        button2.whenPressed(new StartPickup());
        button2.whenReleased(new StopPickup());
		
		button11.whenPressed(new PushFeedRollerSpeed(FeedRoller.spewSpeed));
		button11.whenReleased(new PopFeedRollerSpeed());
		
        button1.whenPressed(new Shoot(false, "Extend Pickup"));  // standard shot
        button5.whenPressed(new Shoot(true, "Extend Pickup"));   // quick shot
        
        button3.whenPressed(new PassCommand());
        
        button4.whenPressed(new StartCatch("Extend Pickup"));
        button4.whenReleased(new StopCatch());
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
