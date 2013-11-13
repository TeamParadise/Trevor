/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import net.pvschools.robotics.javabot.practice.commands.MecanumDrive;
import net.pvschools.robotics.javabot.practice.commands.RoboCommand;

/**
 *
 * @author student
 */
public class JavaBot extends IterativeRobot
{
    
    /**The command to be run during the autonomous session*/
    
    public void robotInit()
    {
        RoboCommand.init();
    }

    public void autonomousInit()
    {
    }

    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }

    /**Run as an initial command before starting Operator Control*/
    public void teleopInit()
    {
        
    }

    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
    }
    
}
