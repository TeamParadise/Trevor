/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.RunAutonomous;
//import net.pvschools.robotics.javabot.practice.Systems.MaxbotixUltrasonic;
//import net.pvschools.robotics.javabot.practice.Systems.MaxbotixUltrasonic;

/**
 *
 * @author student
 */
public class JavaBot extends IterativeRobot
{
//    public static MaxbotixUltrasonic sonar = new MaxbotixUltrasonic(4);
    //MaxbotixUltrasonic sonar = new MaxbotixUltrasonic(1);
    int cntr = 0;
    int cntr2 = 0;
    
    //SocketPi raspberryPi = new SocketPi();

    /** The command to be run during the autonomous session */
    public void robotInit()
    {
        IO.getInstance().getGyro().reset();
        IO.getInstance().getCompressor().start();
        //    try {
        //           raspberryPi.connect();
        //       }
//        catch (IOException e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }
    }

    public void autonomousInit()
    {
        new RunAutonomous().start();
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
        //System.out.println("getting data from pi");
        try
        {
//            raspberryPi.getRawData();
        } catch (Exception ex)
        {
            System.out.println("error: " + ex.getMessage());
        }

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
