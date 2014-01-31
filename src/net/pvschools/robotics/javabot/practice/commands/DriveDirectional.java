/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author robostud
 */
public class DriveDirectional extends RoboCommand
{
    private Timer timer;
    private double magnitude;
    private double direction;
    
    public DriveDirectional()
    {
        requires(driveTrain);
//        timer = new Timer();
    }
    
    public DriveDirectional(double magnitude, double direction)
    {
        this();
        this.magnitude = magnitude;
        this.direction = direction;
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
//        timer.reset();
//        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        driveTrain.drivePolar(magnitude, direction, 0);
        
//        if (timer.get() < 5.0)
//        {
//            driveTrain.drivePolar(magnitude, direction, 0);
//        }
//        else driveTrain.drivePolar(0, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return this.isTimedOut();
//        return timer.get() > 5.0;
    }

    // Called once after isFinished returns true
    protected void end()
    {
        driveTrain.drivePolar(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}