/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 * Class for driving the robot at a fixed speed and direction.
 *
 * @author robostud
 */
public class DriveDirectional extends RoboCommand
{
    private double magnitude;
    private double direction;
    
    // Specifies speed and direction to drive the robot.
    public DriveDirectional(double magnitude, double direction)
    {
        requires(driveTrain);
        this.magnitude = magnitude;
        this.direction = direction;
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        driveTrain.drivePolar(magnitude, direction, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    //
    // Note that this command is typically called from the Autonomous
    //
    protected boolean isFinished()
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end()
    {
        stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
        stop();
    }
    
    // Stop all drive motion.
    private void stop()
    {
        driveTrain.drivePolar(0, 0, 0);
    }
}