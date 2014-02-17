/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.PopFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.PushFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.StartPickup;
import net.pvschools.robotics.javabot.practice.commands.StopPickup;
import net.pvschools.robotics.javabot.practice.commands.Shoot;
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
        SmartDashboard.putNumber("Dampening", .5);
		
		// Add commands to smart dashboard:
		SmartDashboard.putData("Open Catcher", new OpenCatcher());
		SmartDashboard.putData("Close Catcher", new CloseCatcher());
		SmartDashboard.putData("Raise Ramp", new RaiseRamp());
		SmartDashboard.putData("Lower Ramp", new LowerRamp());
		SmartDashboard.putData("Extend Pickup", new ExtendPickup());
		SmartDashboard.putData("Retract Pickup", new RetractPickup());
		SmartDashboard.putData("Extend Little Kicker", new ExtendLittleKicker());
		SmartDashboard.putData("Retract Little Kicker", new RetractLittleKicker());
		SmartDashboard.putData("Extend Big Kicker", new ExtendBigKicker());
		SmartDashboard.putData("Retract Big Kicker", new RetractBigKicker());
		SmartDashboard.putData("Open Latch", new OpenLatch());
		SmartDashboard.putData("Close Latch", new CloseLatch());
		
        //Button Command Initialization
        button2.whenPressed(new StartPickup());
        button2.whenReleased(new StopPickup());
		
		button11.whenPressed(new PushFeedRollerSpeed(FeedRoller.spewSpeed));
		button11.whenReleased(new PopFeedRollerSpeed());
		
//        private static Boolean catching;
//        if (button12.get())
//        {
//           Sonar Sonar = new Sonar(Map.SonarPingChannel,Map.SonarEchoChannel);
//           if (Sonar.getDistanceInInches()<13 and !catching)
//           {
//              CloseCatcher Catcher = new CloseCatcher();
//              Catcher.start();
//              catching = true;
//           } else
//           {
//               catching = false;
//           }
//        }
        
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
