/*
 * Main class code for Team 1165's Java-Run Robot.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.RunAutonomous;

/**
 *
 * @author student
 */
public class JavaBot extends IterativeRobot
{
    
    int cntr = 0;
    int cntr2 = 0;

    private CommandGroup runAutonomous = new RunAutonomous();

    /** The command to be run during the autonomous session */
    public void robotInit()
    {
        IO.getInstance().getGyro().reset();
        IO.getInstance().getCompressor().start();
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
        IO.getInstance().getGyro().reset();
    }

    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
        SmartDashboard.putString(" message ", "latest version");

        double angle = IO.getInstance().getGyro().getAngle();
        SmartDashboard.putNumber(" Gyro ", angle);
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
