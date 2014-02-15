/*
 * Main class code for Team 1165's Java-Run Robot.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.ChargeKicker;
import net.pvschools.robotics.javabot.practice.commands.RunAutonomous;
import net.pvschools.robotics.javabot.practice.commands.StopPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.LowerRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 *
 * @author student
 */
public class JavaBot extends IterativeRobot
{
    
    int cntr = 0;
    int cntr2 = 0;

    /** The command to be run during the autonomous session */
    private final CommandGroup runAutonomous = new RunAutonomous();

    public void robotInit()
    {
        IO.getInstance().getCompressor().start();
        new CloseLatch().start();
        new ChargeKicker().start();
        new StopPickup().start();
        new RetractPickup().start();
        new LowerRamp().start();
        new CloseCatcher().start();
    }

    public void autonomousInit()
    {
        runAutonomous.start();
    }

    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }

    /** Run as an initial command before starting Operator Control */
    public void teleopInit()
    {

    }

    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
        SmartDashboard.putString(" message ", "latest version");

        SmartDashboard.putNumber("Watchdog ", getWatchdog().getTimer());
        SmartDashboard.putNumber(" Periodic ", cntr2);

        cntr2++;
        if (cntr2 > 1000)
        {
            cntr2 = 0;
            SmartDashboard.putNumber(" cntr2 ", cntr2);
        }
        
    }

    public void teleopContinuous()
    {
        SmartDashboard.putNumber(" Continuous ", cntr);
        cntr++;
        if (cntr > 100000)
        {
            cntr = 0;
        }
    }

}
